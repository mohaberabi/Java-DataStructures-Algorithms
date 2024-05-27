public class MinimumGroupFlips {




    void printWhatToFlipToBeSame (boolean [] arr , int n ){
        for ( int i =1 ; i < n ; i ++){
            if (arr[i]!=arr[i-1]){
                if (arr[i]!=arr[0]){
                    System.out.println("FROM "+i+" To");
                }
                else {
                    System.out.println(i-1);
                }
            }
            if (arr[n-1 ]!=arr[0]){
                System.out.println(n-1);
            }
        }
    }
}
