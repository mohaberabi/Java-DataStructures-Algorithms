import com.sun.source.doctree.SeeTree;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class PrintStringsWithBegainEnd {




public  static void main (String args[]){
    String arr [] = {"MOHAB","Mohamed","ALi","Mohabbbb"};

    Arrays.stream(arr).filter(x->x.startsWith("M")).filter(x->x.endsWith("B")).forEach(System.out::println);
}

}
