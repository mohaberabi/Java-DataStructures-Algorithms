public class SwapFromEndAndStartAtK {


    public void swapFromEndsAtK(Node head, int k ){

        int n =100;

        Node first  = head ;
        Node second  = head ;
Node firstPRev = null;
Node secondPrev = null;

        for ( int i =1 ;i<k-1;i++ ){
            firstPRev=first;
            first=firstPRev.next;
        }
        for ( int i =1 ;i<n-k+1;i++ ){
      secondPrev = second;
      second= second.next;
        }

if (firstPRev!=null){
    firstPRev.next=second;
}
if (secondPrev!=null){
    secondPrev.next=first;
}

Node temp = first.next;
first.next=second.next;
second.next=temp;

    }
}
