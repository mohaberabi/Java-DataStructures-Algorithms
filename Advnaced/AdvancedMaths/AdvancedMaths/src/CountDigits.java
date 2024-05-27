public class CountDigits {

int ocuntDigit ( int x ){
    int res = 0 ;


    while (x>0){
        x= x/10 ;
        res++;
    }

    return res ;
}

}
