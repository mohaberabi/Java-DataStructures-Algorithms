public class MinAdjacentDiff {


  static  void minAdjacentDiff(int [] arr , int n ){
      int ans = Integer.MAX_VALUE;

      for( int i =1 ; i < n ; i ++){
          ans = Math.min(ans , Math.abs(arr[i]-arr[i-1]));
      }

      ans = Math.min(ans , Math.abs(arr[0]-arr[n-1]));
      System.out.println(ans);
  }
}
