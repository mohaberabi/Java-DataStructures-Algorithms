import java.util.*;

public class Test {

     public  static  boolean iso (String S1 , String S2 ){
          if(S1.length()!=S2.length()){
               return false ;
          }

          TreeMap<Character,Integer> t1 = new TreeMap<>();

          TreeMap<Character,Integer> t2 = new TreeMap<>();

          for ( char c : S1.toCharArray()){
               t1.put(c,t1.getOrDefault(c,0)+1);
          }
          for ( char c : S2.toCharArray()){
               t2.put(c,t2.getOrDefault(c,0)+1);
          }

          List<Integer> values1 = new ArrayList(t1.values());
          List<Integer> values2 =  new ArrayList(t2.values());

          for ( int i = 0 ; i < values1.size();i++){
               if(values1.get(i)!=values2.get(i)){
                    return false ;
               }
          }

          return true;
     }
   public static void main  (String [] args ){
     boolean ans = iso("aabs","xxy");
        System.out.println(ans);
    }

}
