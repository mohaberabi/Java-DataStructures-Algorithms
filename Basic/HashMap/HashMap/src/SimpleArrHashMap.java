public class SimpleArrHashMap {


    public String []hash ;

    public SimpleArrHashMap(int size ){
        this. hash = new String [size];
    }

    public String get (String key ){
        int index = hash(key);
        return  hash[index];
    }

public void set (String key , String value ){
        int index = hash(key ) ;
        hash[index]= value ;
}
    private int hash (String key ){
        int hashcode= 0 ;

        for ( int i = 0 ; i < key.length();i++){
            hashcode = hashcode+Character.codePointAt(key , i);

        }
        hashcode = hashcode%hash.length;
        return hashcode;
    }
}
