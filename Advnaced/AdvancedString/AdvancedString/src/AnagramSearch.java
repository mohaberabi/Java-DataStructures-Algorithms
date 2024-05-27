import java.util.Arrays;

public class AnagramSearch {



    boolean isPresentNaive (String txt , String pat){

        int n = txt.length();
        int m = pat.length();
        for ( int i = 0 ; i <=n-m;i++ ){

            if (Anagram.anagramOptimal(txt ,pat)){
                return true ;
            }



        }
        return  false ;
    }


    boolean isPresentOptimal (String txt , String pat ){
        int []ct = new int [256];
        int[] cp = new int [256];
        for ( int i = 0 ; i < pat.length();i++){
            ct[txt.charAt(i)]++;
            cp[pat.charAt(i)]++;

        }
        for ( int i = pat.length();i<txt.length();i++){
            if(Arrays.equals(cp,ct)){
                return true ;
            }
            ct[txt.charAt(i)]++;
            ct[txt.charAt(i-pat.length())]--;
        }
        return false ;
    }
}
