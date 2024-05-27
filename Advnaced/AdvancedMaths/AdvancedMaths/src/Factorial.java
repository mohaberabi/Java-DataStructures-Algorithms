public class Factorial {


    int factorialRec(int x){
        if (x==0){return 1 ;}
        return factorialRec(x-1)*x ;
    }


    int factorialItrative( int x){
        int  res = 1 ;
        for ( int i =2 ; i <= x ; i++){
            res *=i ;
        }
        return res;
    }
}
