import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class MyCirculerLinkedList2 {


    public static int josephs2(int n, int k) {

        LinkedList<Integer> ll = new LinkedList<>();


        for (int i = 0; i < n; i++) {
            ll.add(i);
        }

        Iterator<Integer> it = ll.iterator();

        while (ll.size() > 1) {
            int count = 0;

            while (count < k) {
                while (it.hasNext() && count < k) {
                    it.next();
                    count++;
                }
                if (count < k) {
                    it = ll.iterator();
                    it.next();
                    count++;

                }
                it.remove();
            }
        }
        return ll.getFirst();
    }

    public static int jospethsProblem(int k, int n) {

        LinkedList<Integer> list = new LinkedList();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        Iterator iterator = list.iterator();
        while (list.size() > 1) {
            int count = 0;
            while (count < k) {
                while (iterator.hasNext() && count < k) {
                    iterator.next();
                    count++;
                }
                if (count < k) {
                    iterator = list.iterator();
                    iterator.next();
                    count++;
                }
                iterator.remove();
            }
        }


        return list.getFirst();
    }
}
