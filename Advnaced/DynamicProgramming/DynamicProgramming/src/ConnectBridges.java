import java.util.Arrays;
import java.util.Collections;

public class ConnectBridges {


    public static class City {
        int first;
        int second;

        public City(int f, int s) {
            first = f;
            second = s;
        }

        @Override
        public String toString() {
            return "first-> " + first + " " + "Second->" + second;
        }
    }


    static int buildBridges(City[] cities, int n) {

        Arrays.sort(cities, (a, b) -> a.first - b.first == 0 ? a.second - b.second : a.first - b.first);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = cities[i].second;
        }
        int[] lis = new int[n];
        lis[0] = 1;

        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {

                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        int res = lis[0];
        for (int i = 0; i < n; i++) {
            res = Math.max(res, lis[i]);
        }
        return res;
    }

    public static void main(String[] args) {

        City[] cities = {
                new City(6, 2),
                new City(4, 3),
                new City(2, 6),
                new City(1, 5),

        };

        int ans = buildBridges(cities, cities.length);


        for (City cit : cities) {
            System.out.println(cit.toString());
        }

        System.out.println(ans);
    }
}
