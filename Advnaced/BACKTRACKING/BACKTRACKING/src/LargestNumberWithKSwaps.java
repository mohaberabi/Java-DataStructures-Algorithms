public class LargestNumberWithKSwaps {
    static String maxNumber;

    public static String findMaxNumberWithKSwaps(String num, int k) {
        maxNumber = num;
        backtrack(num.toCharArray(), k, 0);
        return maxNumber;
    }

    private static void backtrack(char[] numArray, int k, int index) {
        if (k == 0) {
            return;
        }

        int n = numArray.length;

        for (int i = index; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numArray[j] > numArray[i]) {
                    swap(numArray, i, j);
                    String currentNum = new String(numArray);

                    if (currentNum.compareTo(maxNumber) > 0) {
                        maxNumber = currentNum;
                    }

                    backtrack(numArray, k - 1, i + 1);

                    swap(numArray, i, j); // Backtrack
                }
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        String num = "123456";
        int k = 3;
        String result = findMaxNumberWithKSwaps(num, k);
        System.out.println("Maximum number with " + k + " swaps: " + result);
    }
}
