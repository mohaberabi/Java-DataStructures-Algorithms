import java.util.*;

public class Main {
    public static void main(String[] args) {


        Queue<Integer> q = new LinkedList<>();

        q.add(4);
        q.add(3);
        q.add(1);
        q.add(10);
        q.add(2);
        q.add(6);
       Queue<Integer> rev =  reverse(q);
        for ( int i : rev ){
            System.out.println(i);
        }

    }




    public static  Queue<Integer> reverse (Queue<Integer> q ){

        Queue<Integer> rev = new LinkedList();
        Stack<Integer> s = new Stack();

        while (!q.isEmpty()){
            s.push(q.poll());
        }
        while (!s.isEmpty()){
            rev.offer(s.pop());
        }
        return rev;
    }

    public static void  reverseFirstKelements (Queue<Integer> q , int k ){


        Stack<Integer> s = new Stack<>();

        for ( int i = 0 ;i < k ; i++){
            s.push(q.poll());
        }

        for ( int i = 0 ; i < k ; i++){
            q.add(s.pop());
        }

        for ( int i = 0 ; i < q.size()-k;i++){
            q.offer(q.poll());
        }

        for ( int i : q){
            System.out.println(q);
        }



    }
    public static void clear (Queue<Integer>q){
        while (q.isEmpty()==false ){
            q.poll();
        }

    }
    public static int findFrequency (Queue<Integer>q , int k ){
        return  Collections.frequency(q,k);
    }
}