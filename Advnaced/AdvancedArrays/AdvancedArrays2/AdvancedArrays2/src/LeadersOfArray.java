public class LeadersOfArray {



    void printLeaders ( int []arr , int n ){
        for ( int i = 0 ; i < n ; i ++){
            boolean flag = false;

            for ( int j =i+1 ; j < n ; j ++ ){

                if (arr[i]<=arr[j]){
                    flag = true ;
                    break;
                }
            }

            if (flag==false){
                System.out.println(arr[i]);
            }
        }
    }

    void printLeadersOptimal ( int [] arr , int n ){

        int curr = arr[n-1];
        for ( int i = n -2 ;i>=0;i--){
            if (curr<arr[i]){
                curr = arr[i];
                System.out.println(curr);
            }
        }

    }
}
