public class Palindrome {


    boolean palindromeNaive ( String s ){
        String rev = new StringBuilder(s).reverse().toString();
        return  rev.equals(s);

    }

    boolean palindromeOptimal  ( String s ){
        int left = 0 ;
        int right = s.length()-1;


//        if (s.charAt(left)!=s.charAt(right)){
//            return  false ;
//        }

while (left < right){
    if (s.charAt(left)!=s.charAt(right)){
     return  false ;
    }

    else {
        left ++;
        right --;
    }


}




return true ;



    }
}
