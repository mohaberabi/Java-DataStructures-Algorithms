public class LargestAndSecondLargest {



   static void prindLargestAndSecondLrgest (int [] arr , int n ){
       int largest = Integer.MIN_VALUE;
       for ( int i = 0 ; i < n ; i ++){
           largest = Math.max(largest,arr[i]);
       }
       int second = -1 ;

       for ( int i = 0 ; i < n ; i ++){

           if (arr[i]<largest&&arr[i]!=largest){
               second = Math.max(second , arr[i]);
           }


       }
       System.out.println(largest);
       System.out.println(second);
    }
}
