import java.util.Arrays;

public class LongestCommonSbSequence {



    static  int N =4 ;
    static   int M = 3 ;
    static  int [][]memo = new int [N+1][M+1];

   //  non dynamic programming solution
  static   int lcs (String s1 , String s2 , int n , int m ){
        if(n==0||m==0){
            return 0;
        }

        if (s1.charAt(n-1)==s2.charAt(m-1)){
            return 1 +lcs(s1 , s2 , n-1 , m-1 );
        }
        else {
            return  Math.max(lcs(s1 , s2 , n-1 , m ),lcs(s1 ,s2 , n , m-1 ));
        }
    }

    // memoization dynamic programming soluition
    static   int lcs (String  s1 , int   n ,String s2 , int m){
        if (memo[n][m]!=-1){
            return memo[n][m];
        }

        if(m==0||n ==0){
             memo[n][m]=0;
        }
        else {
            if(s1.charAt(n-1)  ==s2.charAt(m-1)){
                memo[n][m]=1+lcs(s1 , n-1 , s2 , m-1 );
            }
            else {
                memo[n][m]= Math.max(lcs(s1 , n ,s2,m-1),lcs(s1 , n-1 , s2 , m));
            }

        }
        return memo[n][m];

    }

    public static void main (String  [] args){

        for (int i = 0 ; i < N ; i++){
            for (int j = 0 ; j < M;j++){
                memo[i][j]=-1;
            }
        }
        int ans =lcs("axyz","baz",4 ,3);

        System.out.println(ans);

    }
}
