public class LinkedListStack {


private int size ;
    private Node peck ;

public LinkedListStack(){}



void push (int data){
    if (peck==null){
        peck = new Node(data);
    }
    else {
        Node added = new Node(data);
        added.next = peck;
        peck = added;
        size ++;
    }
}

int  pop (){
    if (peck==null){
        return -1;
    }
    int popped  = peck.data ;
    peck=peck.next;
    size -- ;
    return  popped;

}

int getPeck (){return  peck.data;}




int size (){return  size;}






    private class Node {
       public Node next ;
        public  int data;
        Node(int data){
            this.data = data ;
            next = null;
        }
    }
}
