public class TrappingRainWater {


    int getDropsNaive (int arr [] , int n ){
        int res = 0 ;

        for ( int i =1 ; i < n-1 ; i ++){
            int lMax = arr[i];

            for ( int j = 0 ; j < i ; j++){


                lMax = Math.max(lMax,arr[j]);


            }

            int rMax = arr[i];
            for ( int j = 0 ; j < i  ;j++){
                rMax = Math.max(rMax,arr[j]);
            }

            res += (Math.min(lMax,rMax)-arr[i]);
        }


return res ;
    }

    int getDropsOptimal (int arr [] , int n ){


        int res = 0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];

        lMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i - 1], arr[i]);
        }

        rMax[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i + 1], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            res += ((Math.min(lMax[i], rMax[i])) - arr[i]);
        }

        return res;
    }



}
