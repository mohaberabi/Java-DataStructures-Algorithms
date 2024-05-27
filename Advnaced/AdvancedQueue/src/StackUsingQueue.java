import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    private final static Queue<Integer> q1  = new LinkedList();
    private final static Queue<Integer> q2  = new LinkedList();



void push ( int x ){


    while (q1.isEmpty()==false ){
        q2.add(q1.poll());
    }

    q1.add(x);
    while (q2.isEmpty()==false ){
        q1.add(q2.poll());
    }
}
    int pop(){

        if (q1.isEmpty()){return  -1 ; }
        return  q1.poll();
    }


}
