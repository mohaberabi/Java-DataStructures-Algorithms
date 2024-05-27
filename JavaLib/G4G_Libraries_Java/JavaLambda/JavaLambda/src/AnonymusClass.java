import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class AnonymusClass {




    public static void printCond (Collection<Integer> c, Predicate<Integer> p){

        for ( Integer x : c ){
            System.out.println(x+" ");
        }
    }
    public static void main(String[] args) {



       Predicate<Integer>myPred = new Predicate<Integer>() {
           @Override
           public boolean test(Integer integer) {
               return false;
           }
       };
        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        printCond(al,  myPred);


    }
}
