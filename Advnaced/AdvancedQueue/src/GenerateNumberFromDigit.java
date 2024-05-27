import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumberFromDigit {


    void generateAllPossibleBinary ( int n ){
        Queue<String > q = new LinkedList();


        q.add("1");
        for ( int i = 0 ; i < n ; i ++){

            String polled = q.poll();
            System.out.println(polled);
            q.add(polled+"0");
            q.add(polled+"1");

        }
    }



}
