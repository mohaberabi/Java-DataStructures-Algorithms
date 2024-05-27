public class SpiralTraversal {


    void spiralTraversal(int[][] mat, int R, int C) {
        int top = 0;
        int left = 0;
        int bottom = R - 1;
        int right = C - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.println(mat[top][i] + " ");
            }
            top++;


            for (int i = top; i <= bottom; i++) {
                System.out.println(mat[i][right] + " ");

            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.println(mat[bottom][i] + " ");

                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.println(mat[i][left] + " ");

                }
                left++;
            }
        }
    }
}
