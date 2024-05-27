public class Main {
    public static void main(String[] args) {


        int [] list = {
                2 ,5 ,8 ,11 ,3,6,9,13
        };

        int res = CountInversionsOptimal.countInversions(list  , 0 ,list.length-1 );
        System.out.println(res);
//        for (int x : list){
//            System.out.println(x);
//        }
//        System.out.println(res);

    }
}