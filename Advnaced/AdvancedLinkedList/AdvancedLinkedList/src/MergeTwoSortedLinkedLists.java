public class MergeTwoSortedLinkedLists {


    public Node mergeTwoSorted (Node h1 , Node h2 ){

        if (h1==null){return h2 ; }

        if (h2 ==null)
       {
            return h1 ;
        }


        Node head =null;
        Node tail = null;
        if (h1.data<=h2.data){head = h1 ; tail = h1 ; }
        else {
            head = h2 ;
            tail = h2 ;
        }

        h1=h1.next;
        h2=h2.next;
        while (h1!=null&&h2!=null){
            if (h1.data<h2.data){
        tail.next=h1;
        tail = h1 ;
        h1=h1.next;


            }
            else {
             tail.next=h2 ;
             tail = h2 ;
             h2=h2.next;
            }


        }
if (h1==null){
    tail.next=h2;
}
else {tail.next=h1 ; }
return head;
    }
}
