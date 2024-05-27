public class FibonacciTabulation {


    static   int N =5 ;
    static  int [] memo = new int [N+1];



  static   int fib(int n ){
  memo[0]=0;
  memo[1]=1 ;
  for (int i=2 ; i <= n;i++){
      memo[i]=memo[i-1]+memo[i-2];
  }
  return memo[n];
    }

    public  static  void main (String [] args){

      int f = fib(5);
        System.out.println(f);
    }
}
