import java.util.HashMap;
import java.util.Map;

public class LRU {


    private static  class HashNode {
        int key ;
        int value ;
        HashNode next ;
        HashNode prev ;


        public HashNode(int key , int value ){
            this.key=key;
            this.value=value;
            next = prev = null;
        }
    }


    private static Map<Integer,HashNode>map ;
    private static int cacpacity ;
    private static int count ;
    private static HashNode head ;
    private static HashNode tail ;

    LRU(int cap)
    {
        map = new HashMap<>();
        this.cacpacity = cap;
        head = new HashNode(0, 0);
        tail = new HashNode(0, 0);
        head.next = tail;
        head.prev = null;
        tail = null;
        tail.prev = head;
        count = 0;
    }
    public static void addToHead(int key , int value ){
        HashNode node = new HashNode(key , value);

        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;

    }

    public static void deleteNode (HashNode node ){
       node.prev.next=node.next;
       node.next.prev=node.prev;
    }
public static int get (int key){
        if (map.containsKey(key)){
HashNode node = map.get(key);
int data = node.value;
deleteNode(node);
addToHead(node.key,node.value);
return data;
        }
        else {return -1; }
}


public static void set(int key , int value ){
        if (map.get(key)!=null){
            HashNode node = map.get(key);
            deleteNode(node);
            addToHead( node. key ,node.  value );
        }
        else {
            HashNode added = new HashNode(key , value);
            map.put(key , added);
            if (count<cacpacity){
                count++;
                addToHead(added.key,added.value);
            }else {
                map.remove(tail.prev.key);
                deleteNode(tail.prev);
                addToHead(added.key,added.value);
            }

        }
}
}
