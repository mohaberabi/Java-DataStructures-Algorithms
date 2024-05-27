import java.lang.reflect.Array;
import java.util.Arrays;

public class LeftMostRepeeated {

    int leftMostRepeatedNaive(String s) {


        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }


    static int CHAR = 256;

    int leftMostRepeatedOptimal(String s) {
        int[] count = new int[CHAR];


        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;

        }


        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] > 1) {
                return i;
            }
        }
        return -1;
    }


    int leftMostInsaneOptimal(String s) {

        boolean[] visited = new boolean[CHAR];
        Arrays.fill(visited, false);

        int res = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (visited[s.charAt(i)]) {
                res = i;
            } else {
                visited[s.charAt(i)] = true;
            }
        }
        return res;
    }

    int leftMostSuperOptimal(String s) {

        int[] fIndex = new int[CHAR];

        Arrays.fill(fIndex, -1);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            int index = fIndex[s.charAt(i)];
            if (index == -1) {
                fIndex[s.charAt(i)] = i;
            } else {
                res = Math.min(res, index);
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;

    }
}
