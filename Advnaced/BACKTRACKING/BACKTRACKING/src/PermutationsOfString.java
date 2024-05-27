import java.util.Arrays;

public class PermutationsOfString {


    void printPermutationsOfString(char [] s , int l , int r){
        if (l==r){
            System.out.println(s);
            return;
        }

        for ( int i = l ; i <= r ; i++){
            swap(s,l,i);
            printPermutationsOfString(s , l+1 , r);
            swap(s,l,i);
        }

    }
    void printPermutationsOfStringWithNoAB(char [] s , int l , int r){
        if (l==r){
            if(!s.toString().contains("AB")){
                System.out.println(s);
                return;
            }

        }

        for ( int i = l ; i <= r ; i++){
            swap(s,l,i);
            printPermutationsOfString(s , l+1 , r);
            swap(s,l,i);
        }

    }

    void swap(char [] chars, int i , int j ){
        char temp = chars[i];
        chars[i]=chars[j];
        chars[j]=temp;
    }





    boolean isSafe ( String s , int l , int i , int r ){
        if(l!=0&& s.charAt(i-1)=='A'&&s.charAt(i)=='B'){
            return false;
        }
        if(r == l+1 && s.charAt(i)=='A'&&s.charAt(i)=='B'){
            return false;
        }
        return true ;
    }
    void printPermutationsOfStringWithNoABBACKTRACKING(char [] s , int l , int r){
        if (l==r){
            System.out.println(s);
            return;

        }

        for ( int i = l ; i <= r ; i++){
          if(isSafe(new String (s ),l,i,r)){
              swap(s,l,i);
              printPermutationsOfString(s , l+1 , r);
              swap(s,l,i);
          }
        }

    }
}
