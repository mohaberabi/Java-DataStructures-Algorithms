public class MyDoubleLinkedList {





    public MyNode head ;
    public MyNode tail ;

    MyDoubleLinkedList(){
        this.head=null;
        this.tail=null;
    }


    void addToTail (int data){
        MyNode newTail = new MyNode(data);
        MyNode currentTail = tail;
        if (currentTail!=null){
            currentTail.next=newTail;
            newTail.next = currentTail;
        }
        tail = newTail ;
        if (head==null){
            head=newTail;
        }

    }
    void addToHead (int data){

        MyNode newHead =new  MyNode(data);
        MyNode currentHead = head;
        if (currentHead!=null){
            currentHead.previous=newHead;
            newHead.next=currentHead;
        }
        head= newHead;
        if (this.tail==null){
            tail=newHead;
        }

    }


    int  removeTail (){
        MyNode removed = tail ;
        if (removed==null){
            return -1 ;
        }
        tail  = removed.previous;
        if (tail!=null){
            tail.next=null;
        }
        if (removed==head){
            return -1;
        }
        return removed.data;
    }
    int removeHead (){
        MyNode removed = head  ;

        if (removed==null){
            return -1;
        }
        head = removed.next;
        if (head!=null){
            head.previous=null;
        }
        if (removed==tail){
            removeTail();
        }
        return  removed.data;
    }
}
