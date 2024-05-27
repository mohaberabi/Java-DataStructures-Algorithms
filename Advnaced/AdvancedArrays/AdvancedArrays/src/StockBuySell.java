import java.util.ArrayList;

public class StockBuySell {

    int maxProfit (int []price , int start , int end  ){

        if (end <=start){
            return  0 ;
        }

        int profit = 0 ;



        for ( int i = 0 ; i < end ;i++){
            for ( int j = i+1 ;j<end;j++){

                if (price [j]>price[i]){
                    int newProfit =price  [j]- price[i]+
                            maxProfit(price,start , i-1 )+
                            maxProfit(price , j+1 , end );
                    profit = Math.max(profit , newProfit);

                }

            }
        }


        return profit;
    }


    int maxProfit (int [] price , int n ){



        int profit = 0 ;



        for ( int i = 1 ; i < n ; i ++){

            if (price[i]>price[i-1]){
                profit   += (price[i]-price [i-1 ]);
            }
        }
        return profit ;

    }
}
