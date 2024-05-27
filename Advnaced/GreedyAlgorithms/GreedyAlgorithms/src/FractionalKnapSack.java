import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {


    static class Stolen implements Comparable<Stolen> {
        int weight;
        int value;

        public Stolen(int w, int v) {
            weight = w;
            value = v;
        }

        @Override
        public int compareTo(Stolen other) {
            return (weight * other.value) - (value * other.weight);
        }

        @Override
        public String toString() {
            return "W=" + weight + " , " + " V=" + " " + value;
        }
    }

    static double fractionalKnapSack(Stolen[] arr, int n, int capacity) {

        double res = 0.0;
        Arrays.sort(arr, Comparator.comparingDouble((Stolen stolen) -> (double) stolen.value / stolen.weight).reversed());

        for (Stolen stolen : arr) {
            if (stolen.weight <= capacity) {
                res += stolen.value;
                capacity = capacity - stolen.weight;
            } else {
                res += (double) capacity / stolen.weight * stolen.value;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        double res = 0;
        Stolen[] arr = {

                new Stolen(10, 60),
                new Stolen(40, 100),
                new Stolen(20, 100),
                new Stolen(30, 120),
        };

        res = fractionalKnapSack(arr, arr.length, 50);
        System.out.println(res);
    }

}
