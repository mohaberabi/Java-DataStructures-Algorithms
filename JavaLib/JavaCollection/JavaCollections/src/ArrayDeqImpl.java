import java.util.ArrayDeque;
import java.util.Stack;

public class ArrayDeqImpl {




    static void leftRotateDeqByKTimes (ArrayDeque<Integer> deq , int k ){



        Stack<Integer>stack = new Stack<>();


        for ( int i = 0 ; i < k ; i ++){

            stack.push(deq.pollLast());

        }


        while (!stack.isEmpty()){
            deq.addFirst(stack.pop());
        }



    }



    static void rightRotateQBy (ArrayDeque<Integer> deq , int k ){



        Stack<Integer>stack = new Stack<>();


        for ( int i = 0 ; i < k ; i ++){

            stack.push(deq.pollLast());

        }


        while (!stack.isEmpty()){
            deq.addFirst(stack.pop());
        }



    }



















    public static void eraseIt (ArrayDeque<Integer>deq , int x ){
        Stack<Integer> stack = new Stack<>();
        for ( int i = 0 ; i < x ; i++){
            stack.push(deq.pollFirst());
        }

        deq.pollFirst();
        while (!stack.isEmpty()){
            deq.addFirst(stack.peek());
            stack.pop();
        }
    }


    public static void eraseAtRange ( ArrayDeque<Integer>deq , int start , int end ){
        Stack<Integer>stack = new Stack<>();
        int c = 0 ;
        while (!deq.isEmpty()){
            if (c>=start && c<end ){
                deq.pollFirst();
            }else {
                stack.push(deq.pollFirst());
                c++;
            }
            deq.clear();
        }
        while (!stack.isEmpty()){
            deq.addFirst(stack.peek());
            stack.pop();
        }
    }
}
