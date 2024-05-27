public class TrailingZerosOfFactorial {

    /// causes overflow exccepiton
    int trailingZerosFactoriral    (int x) throws StackOverflowError{
        int fact =1 ;
        for ( int i =2 ; i <=x ; i++){
            fact*=i ;
        }
        int res = 0 ;
        while (fact%10==0){
            res++;
            fact= fact /10 ;
        }
        return  res ;
    }


    int trailingZeroInFactorialOptimal ( int n ){
        int res = 0 ;

        for ( int i =5 ; i <=n;i=i*5){
            res +=n/i;
        }
        return res ; 
    }
}
