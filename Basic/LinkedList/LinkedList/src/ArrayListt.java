import java.util.*;

public class ArrayListt {


    public static void main(String args[]) {


        ArrayList<List<Integer>> matrix = new ArrayList<>();

        matrix.add(Arrays.asList(1, 2, 3, 4));
        matrix.add(Arrays.asList(5, 6));
        matrix.add(Arrays.asList(7, 8, 9));

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < matrix.size() - 1; i++) {


            LinkedList s = new LinkedList();







            for (int j = 0; j < matrix.get(i).size(); j++) {

                int sum = matrix.get(i).get(j);
                ans = Math.min(ans, sum);
            }
        }
        System.out.println(ans);


//
//        ArrayList<Integer> al = new ArrayList();
//        al.add(1);
//        al.add(2);
//        al.add(3);
//        al.add(4);
//        al.add(5);
//        ArrayList<Integer> rev = new ArrayList();
//
//        Iterator it = al.iterator();
//
//        ListIterator lit = al.listIterator();

        //  while (it.hasNext()) {
        //            System.out.println(it.next());
        //            Math.ma
        //        }


//        for (int i = al.size() - 1; i >= 0; i--) {
//            System.out.println(i);
//            rev.add(al.get(i));
//        }
//        System.out.println(rev);
//        rev.sort(null);
//        System.out.println(rev);
//        al.sort(Collections.reverseOrder()); // Sort in descending order

    }
}
