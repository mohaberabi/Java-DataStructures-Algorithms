public class Main {
    public static void main(String[] args) {


        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};


//        Transpose.transpose(arr, arr.length);
        AntiClockWiseSwapMatrixBy90.antiClockSwapBy90Optinmal(arr, arr.length);


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}