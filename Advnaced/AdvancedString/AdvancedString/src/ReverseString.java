public class ReverseString {



    String  reverseString (String s ){

        char[]chars  = s.toCharArray();


        int left = 0 ;
        int right = s.length()-1;


        while (left < right){
            swap(chars,left , right);
            left ++;
            right --;
        }



        s = new String(chars);
        return  s;
    }






    void swap ( char [] chars , int i , int j  ){
        char temp  = chars[i];

       chars[i]=chars[j];
       chars[j]=temp;


    }
}
