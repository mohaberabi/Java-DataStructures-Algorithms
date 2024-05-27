public class MergeSortLinkedList {

public static Node  mergeSortLinkedList (Node head){
    if (head==null||head.next==null){
        return head;
    }
    Node middle = middle(head);
    Node middleNext = middle.next;
    middleNext.next=null;
    Node left = mergeSortLinkedList(head);
    Node right = mergeSortLinkedList(middleNext);
    Node sorted = merge(left , right );
    return  sorted ;
}



public static Node merge (Node a , Node b ){
    if (a==null){
        return b;
    }
    if (b==null){
        return  a;
    }
    Node res = null;
    if (a.data<=b.data){
        res = a ;
        a.next=merge(a.next,b);
    }
    else {
        res =  b ;
        b.next=merge(a,b.next);
    }
    return res;

}





public static  Node middle  (Node head){

    Node fast= head;
    Node slow = head;

    while (fast!=null&&fast.next!=null){
        fast = fast.next.next;
        slow = slow .next;
    }
    return slow ;
}


}
