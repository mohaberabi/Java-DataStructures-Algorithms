package hashing;

import java.util.HashSet;

public class SubArrayWithZero {

  public    static boolean subArrayWithZero (int[]array){
      HashSet<Integer>h = new HashSet<Integer>();
      int sum = 0 ;
      for ( int i = 0 ; i < array.length;i++){

          sum +=array[i];

          if (h.contains(sum)){
              return  true ;
          }

          if (sum==0){
              return  true ;
          }
          h.add(sum);

      }
      return false;

  }
}
