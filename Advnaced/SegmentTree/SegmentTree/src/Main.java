public class Main {
    public static void main(String[] args) {

        int[] arr = {100, 2, 2, 2, 1, 2, 33, -213,};
        long l = lcm(3, 4);
        System.out.println(l);

    }

    public static long lcm(long num1, long num2) {
        long gcd = calculateGCD(num1, num2);
        long product = num1 * num2;
        return product / gcd;
    }

    public static long calculateGCD(long a, long b) {
        if (b == 0) {
            return a;
        } else {
            return calculateGCD(b, a % b);
        }
    }
}