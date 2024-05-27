import java.util.Arrays;

public class FibonacciMemo {

    static  int N =5 ;
    static   int [] memo = new int [N+1];


     static    int fib(int n ) {
         if (memo[n] == -1) {
             int res;
             if (n == 0 || n == 1) {
                 res = n;
                 memo[n]=res;
             } else {
                 res = fib(n - 1) + fib(n - 2);
                 memo[n] = res;
             }
         }
         return memo[n];
    }

    public  static  void main ( String []args){

        Arrays.fill(memo,-1);
        int res = fib(5);
        System.out.println(res);
    }
}
