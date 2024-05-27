import java.util.ArrayList;
import java.util.Arrays;

public class PermutationOfString {





    void printPermutationOFString(char [] s   , int i ){





        if (i == s.length){
            System.out.println(s);
            return;
        }

        for ( int j = i ; j < s.length ; j++){

            swap(s,i,j);
            printPermutationOFString(s , i+1 );
            swap(s , i , j );
        }
    }


ArrayList<String> permutationOfString (String s ){
        ArrayList<String > ans = new ArrayList();

        return ans ;
}



void permuteHelper (String s , int i , ArrayList<String> ans ){
        if (i == s.length()-1){
            ans.add(s);
            return;
        }
        for ( int  j= i ; j < s.length();j++){
            swap(s , i , j );
            permuteHelper(s ,  i +1,ans  );
            swap(s , i , j );

        }


}

    void swap (char [] s , int i , int j ){

        char temp = s[i];

        s[i]= s[j];
        s[j]=temp ;



    }




 static    String  swap(String s , int i  ,  int j ){

        char []c = s.toCharArray();

        char temp = c[i];
        c[i]= c[j];
        c[j]=temp ;
    String     edit  = Arrays.toString(c);
        return edit ;
    }
}
