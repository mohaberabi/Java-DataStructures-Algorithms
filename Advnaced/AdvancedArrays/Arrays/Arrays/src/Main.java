import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(5);
        al.add(6);
        al.add(8);
        al.add(9);
      

        ReverseArrayInGroup.reversInGroup(al, al.size(), 3);

        for (int c : al) {
            System.out.println(c);
        }

    }
}