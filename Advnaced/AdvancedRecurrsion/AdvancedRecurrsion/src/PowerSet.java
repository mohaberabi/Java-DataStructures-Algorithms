import java.util.ArrayList;

public class PowerSet {



    static ArrayList<String>powerSet (String s ){
        ArrayList<String >al  = new ArrayList<>();

        powerSetHelper(s ,al , 0 ,"");
        return al;
    }


    static void powerSetHelper (String s , ArrayList<String>al , int index , String curr){
        int n = s.length();
        if (index==n){
            al.add(curr);
            return;
        }
        powerSetHelper(s , al , index +1 , curr);
        powerSetHelper(s , al , index +1 ,curr  + s.charAt(index));

    }
}
