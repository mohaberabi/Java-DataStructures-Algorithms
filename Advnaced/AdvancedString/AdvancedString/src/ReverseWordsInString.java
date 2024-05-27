public class ReverseWordsInString {


    static public String reverseWords(char[] s, int n) {

        int start = 0;
        for (int end = 0; end < n; end++) {
            if (s[end] == ' ') {
                reverse(s, start, end - 1);
                start = end + 1;
            }
        }
        reverse(s, start, n - 1);
        reverse(s, 0, n - 1);

        return new String(s);
    }


    static public void reverse(char[] arr, int start, int end) {

        while (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static public void swap(char[] arr, int i, int j) {


        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
