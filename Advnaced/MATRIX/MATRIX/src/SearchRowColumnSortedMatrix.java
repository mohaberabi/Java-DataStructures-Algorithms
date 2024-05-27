public class SearchRowColumnSortedMatrix {


    String searchInColumnRowSorted(int[][] mat, int R, int C, int target) {


        String ans = "NOT FOUND";


        int i = 0;
        int j = C - 1;

        while (i < R && j >= 0) {
            if (mat[i][j] == target) {
                ans = "FOUND AT" + i + " " + j;
                return ans;
            } else if (mat[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return ans;

    }
}
