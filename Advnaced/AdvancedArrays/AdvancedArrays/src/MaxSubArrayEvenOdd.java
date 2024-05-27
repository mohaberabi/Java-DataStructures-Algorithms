public class MaxSubArrayEvenOdd {



int maxEvenOddNaive (int [] arr , int n){
    int res = 1 ;



    for ( int i = 0 ; i < n ; i ++){

        int curr =1 ;
        for ( int j = i+1 ; j < n ; j++){

            if (isEven(arr[j])&&!isEven(arr[j-1])||isEven(arr[j-1])&& !isEven(arr[j])){


                curr ++;
            }
            else {
                break ;
            }
            res = Math.max(res , curr);

        }
    }
    return  res ;
}


// based on kadnes algorithm
int maxEvenOddOptimal (int arr [] , int n ){
    int res =1 ;
    int curr =1 ;
    for ( int i =1 ;i < n ; i++){

        if ((isEven(arr[i])&&isEven(arr[i-1])==false)||isEven(arr[i-1])&&isEven(arr[i])==false){
            curr ++;
            res= Math.max(res, curr);
        }
        else {
            curr = 1;
        }



    }
    return res ;
}
boolean isEven (int a ){
    return  a % 2 ==0 ;
}

}
