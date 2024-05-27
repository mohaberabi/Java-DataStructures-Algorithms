import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class G4G {

    public static void printCond (Collection<Integer>c, Predicate<Integer>p){

        for ( Integer x : c ){
            if(p.test(x))
            System.out.println(x+" ");
        }
    }
    public static void main(String[] args) {





        List<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
printCond(al,  x->x%2==0);


    }
}
