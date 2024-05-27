import java.util.*;

public class G4G {

    String name ;

    void s (){




        Map<String , Integer> s = new HashMap();





List<Map.Entry<String ,Integer>> list = new ArrayList<>(s.entrySet());


   Comparator myComp=     new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1 , Map.Entry<String, Integer> e2 ) {

                if (e1.getValue().compareTo(e2.getValue())==0){
                    return  e2.getKey().compareTo(e1.getKey());
                }
                else {
                    return e2.getValue().compareTo(e1.getValue());
                }
            }
        };

Collections.sort(list, myComp);




    }
}
