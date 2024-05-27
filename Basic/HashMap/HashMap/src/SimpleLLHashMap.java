import java.util.LinkedList;

public class SimpleLLHashMap<K , V> {

private class Entery<K,V>{
    K key ;
    V value  ;
    Entery(K key , V value ){
        this.value = value;
        this.key = key ;
    }
}

private  int capacity ;
 private     LinkedList<Entery<K,V> >[]hashMap ;


 public SimpleLLHashMap (int size ){

     this.hashMap = new LinkedList[size ];
     for ( int i= 0 ; i < size ; i ++){

         this.hashMap[i]= new LinkedList();
     }
     this.capacity = size ;
 }


public int hash(K key ) {

    return Math.abs(key.hashCode()) %capacity;

}
 public void set (K key,V value  ){
     int index = hash(key);
     LinkedList<Entery<K, V>> list = hashMap[index];
     for (Entery<K, V> entry : list) {
         if (entry.key.equals(key)) {
             entry.value = value;
             return;
         }
     }

     list.add(new Entery<>(key, value));
 }

 public V get (K key){
     int index  = hash(key);
     LinkedList<Entery<K,V>> list = hashMap[index];

     for ( Entery<K,V> entery : list ){
         if (entery.key==key){
             return entery.value;
         }
     }
     return null;
 }

}
