public class StockBuySell {
    int maxProfit ( int []arr , int n , int start , int end ){

        if (end<=start){return 0;}


        int profit = 0 ;


        for ( int i = start ;i<end ;i++){
            for ( int j= i+1 ; j<end ;j++){
                if (arr[j]>arr[i]){
                    int currentPfoit = (arr[j]-arr[i])+
                            maxProfit(arr , n , start , i-1 )+
                            maxProfit(arr , n , j+1 , end );
                    profit = Math.max(profit,currentPfoit);
                }
            }
        }
        return  profit ;
    }

    int maxProfitOptimal ( int []arr , int n ){
        int profit = 0 ;
        for ( int i =1 ; i < n ; i ++){
            if (arr[i]>arr[i-1]){
                profit += (arr[i]-arr[i-1]);
            }
        }
   return profit;
    }

}
