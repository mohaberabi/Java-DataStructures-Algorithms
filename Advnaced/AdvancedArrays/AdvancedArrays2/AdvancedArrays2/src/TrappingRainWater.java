public class TrappingRainWater  {




    int maxWater (int [] heights , int n ){


        int res = 0 ;
        for ( int i =1 ; i < n ; i ++){

            int lMax = heights[i];

            for ( int j = 0 ; j < i ; j++){
                lMax = Math.max(heights[j],lMax);
            }

            int rMax = heights[i];

            for ( int j = i +1 ; j<n; j ++){
                rMax = Math.max(rMax,heights[i]);
            }

            res+=Math.min(lMax,rMax)-heights[i];
        }
        return res ;
    }


    int trappingRainWaterOptimal ( int []arr , int n ){
        int res = 0 ;
        int [] lMax = new int [n];
        int []rMax = new int [n];


        lMax[0]=arr[0];
        for ( int i =1 ; i < n ; i ++){
            lMax[i]= Math.max(lMax[i-1],arr[i]);
        }
        rMax[n-1]= arr[n-1];
        for ( int i = n-2 ; i >= 0 ; i --){
            rMax[i]= Math.max(arr[i],rMax[i+1]);
        }

        for ( int i =1 ; i < n ; i ++){
            res += (Math.min(lMax[i],rMax[i])-arr[i]);
        }
        return  res ;
    }
}
