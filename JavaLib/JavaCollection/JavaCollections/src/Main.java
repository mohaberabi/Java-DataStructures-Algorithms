import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<Integer> deq = new ArrayDeque<Integer>();

        deq.addLast(1);
        deq.addLast(2);
        deq.addLast(3);
        deq.addLast(4);
        deq.addLast(5);
        deq.addLast(6);
ArrayDeqImpl.leftRotateDeqByKTimes(deq,2);

for ( int x : deq){
    System.out.println(x+" ");
}

    }
}