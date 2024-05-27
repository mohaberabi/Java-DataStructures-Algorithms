public class NaivePatternSeach {




    void naivePatternSearch ( String s , String p){
        int n = s.length();
        int m = p.length();



        for ( int i = 0 ; i <= n-m;i++){

            int j ;
            for (j=0;j<m;j++){
                if (s.charAt(i+j)!=p.charAt(j)){
                    break;
                }


            }
            if (j==m){
                System.out.println(i);
            }
        }

    }


    void naivePatternSearchImprovedAtDistnict(String s , String  p ){
        int n = s.length();
        int m = p.length();

        for ( int i = 0 ; i <= n-m; ){
            int j ;
            for ( j = 0 ; j < m ; j ++){


                if (s.charAt(i)!=p.charAt(i)){
                    break;
                }



            }

            if (j==m){
                System.out.println(i+" ");
            }
            if (j==0){
                i++;
            }
            else {
                i = i+j ;
            }


        }





    }
}
