import java.util.Arrays;
import java.util.List;

public class MethodRef {









    public static void main (String  args []){


        List<Integer> al  =  Arrays.asList(1,1,1,1,1,1,1);

        al.forEach(System.out::println);


        String a [] = {"G","A","C"};
        String b [] = {"g","a","c"};
        if (Arrays.equals(a ,b, String::compareToIgnoreCase))
            System.out.println("Yes");
else
            System.out.println("False");


    }
}
