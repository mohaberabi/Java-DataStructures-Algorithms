import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfStream {


    void medianOfStream(int[] arr, int n) {
        PriorityQueue<Integer> g = new PriorityQueue<>();
        PriorityQueue<Integer> s = new PriorityQueue<>(Collections.reverseOrder());

        s.add(arr[0]);
        System.out.println(arr[0]);

        for (int i = 1; i < n; i++) {
            int x = arr[i];

            if (s.size() > g.size()) {
                if (s.peek() > x) {
                    g.add(s.poll());
                    s.add(x);
                } else {
                    g.add(x);
                }
                System.out.println((s.peek() + g.peek()) / 2);
            } else {
                if (x <= s.peek()) {

                    s.add(x);
                } else {
                    g.add(x);
                    s.add(g.poll());
                }
                System.out.println(s.peek());
            }
        }

    }
}
