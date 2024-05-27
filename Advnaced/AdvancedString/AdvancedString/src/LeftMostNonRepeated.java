import java.util.Arrays;

public class LeftMostNonRepeated {


    int leftMostNonRepeatingOptimal1(String s) {


        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }


        for (int i = 0; i < s.length(); i++) {

            if (count[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;

    }

    int leftMostNonRepeated(String s) {


        for (int i = 0; i < s.length(); i++) {
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag = true;
                    break;
                }

            }
            if (flag == false) {
                return i;
            }
        }

        return -1;
    }


    int leftMostNonRepeatingOptimal2(String s) {

        int[] fIndex = new int[256];
        Arrays.fill(fIndex, -1);

        for (int i = 0; i < s.length(); i++) {

            if (fIndex[s.charAt(i)] == -1) {
                fIndex[s.charAt(i)] = i;
            } else {
                fIndex[s.charAt(i)] = -2;
            }


        }

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < 256; i++) {
            if (fIndex[s.charAt(i)] >= 0) {
                res = Math.min(res, fIndex[i]);
            }
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
