import java.util.HashMap;

public class PossibleWordsFromPhone {


    void possibleWordsFromPhone (int [] arr  , int N ){
        HashMap<Integer , String >  map = new HashMap<Integer, String>();


StringBuilder s = new StringBuilder();
        map.put(0,"0");
        map.put(1,"1");
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

        for (int no : arr){
            s.append(map.get(no));
        }
    }
}
