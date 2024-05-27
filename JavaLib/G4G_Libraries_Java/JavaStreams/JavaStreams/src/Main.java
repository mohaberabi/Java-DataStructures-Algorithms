import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        int [] array = {1,2,3,34,4,55,5};

        int sum = Arrays.stream(array).sum();
        OptionalInt max = Arrays.stream(array).max();
        double  average = Arrays.stream(array).average().getAsDouble();
      int mm =   max.getAsInt();

//        Stream.iterate(1 , x->x+1).filter(x->x.toString().con)
    }
}