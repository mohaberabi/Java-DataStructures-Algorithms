import java.util.Arrays;

public class Anagram {

    boolean anagramNaive (String s1 , String s2 ){
        if (s1.length()!=s2.length()){return  false ; }


        char[] c1 = s1.toCharArray();
        char[]c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2 );
s1 = new String(c1);
s2 = new String(c2);

        return  s1.equals(s2);
    }





    static  final  int CHAR = 256 ;
   static boolean anagramOptimal (String s1 , String s2 ){
        if (s1.length()!=s2.length()){
            return  false ;
        }
        int [] count = new int [CHAR];
        for ( int i = 0; i < s1.length();i++){
            count [s1.charAt(i)]++;
            count [s2.charAt(i)]--;
        }


        for ( int i = 0 ; i < CHAR;i++){
            if (count [i]!=0){
                return  false ;
            }
        }
        return true ;
    }
}
