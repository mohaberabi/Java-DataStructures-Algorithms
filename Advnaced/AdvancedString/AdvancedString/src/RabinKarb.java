



public class RabinKarb {


    private  static final int  prime = 113 ;

    private static final int chars = 256;



    void rabinKarb(char []  txt ,int n ,  char[]  pat , int m ){
        int h =1 ;

        for ( int i =1 ; i <=m-1 ; i++){
            h = (h*chars)%prime;
        }


        int p =0 ; // the hash of the pattern

        int t = 0 ; // the hash of the text
        for ( int i =0 ; i <m ; i++){
            p=(p*chars+pat[i])%prime; // calc hash of the pattern
            t= (t*chars+txt[i])%prime; // calc hash of the text
        }
        for ( int i=0  ; i <=n-m;i++){
            if (p==t){
                boolean flag = true ;

            for ( int j = 0 ; j < m ; j++){
                if (txt[i+j]!=pat[j]){
                    flag=false;
                    break;

                }
            }
            if (flag){
                System.out.print (i+" ");
            }
            }
            /// calc the hash of the text for the next iteration ti+1

            if (i<n-m){
              t = ((prime*(t-txt[i]*h))+txt[i+m])%prime;
              if (t<0){
                  t = t+prime;
              }
            }

        }

    }

}
