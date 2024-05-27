package kmp;

public class KmpAlgorithm {


    void kmp (String pat , String txt ){
        int n = txt.length();
        int m = pat.length();

        int[]lps= new int [m];
        LpsOptimal.fillLps(pat , lps );
        int i = 0 ;
        int j = 0 ;
        while (i<n){
            if (pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }
            if (j==m){
                System.out.println(i-j);
                j= lps[j-1];

            }
            else if (i < n && pat.charAt(j)!=txt.charAt(i)){
                if (j==0){
                    i++;
                }
                else {
                    j =lps[j-1 ];
                }
            }
        }
    }

}
