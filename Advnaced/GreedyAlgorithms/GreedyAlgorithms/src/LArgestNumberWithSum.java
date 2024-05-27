public class LArgestNumberWithSum {


    static String largestWithSum(int n, int sum) {


        if (sum > 9 * n) {
            return "-1";
        }


        String ans = "";

        for (int i = 0; i < n; i++) {

            int temp = 0;
            if (sum != 0) {
                temp = Math.min(sum, 9);
            }
            ans += (char) (temp + '0');
            sum -= temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        String ans = "";
        ans = largestWithSum(5, 12);

        System.out.println(ans);
    }

    static int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

}
