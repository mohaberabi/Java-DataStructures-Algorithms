public class ReverseLinkedListByKGroups {

    public Node reverseRecursive (Node head,int k ){
        Node curr = head ;
        Node next = null;
        Node prev = null;
        int count = 0 ;
        while (curr!=null&&count <k){
            next = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = next ;
            count ++;
        }


        if (next !=null){
            Node restHead = reverseRecursive(next , k);
            head.next=restHead ;
            return prev;
        }
        return head ;

    }
    public Node reverseIterative (Node head , int k ){
        Node curr = head ;
        Node prevFirst = null;
        boolean firstPass = true ;
        while (curr!=null){
            Node first = curr ;
         Node    prev = null;
            int count = 0 ;

            while (curr!=null&&count<k){
                Node next = curr.next ;
                curr.next = prev ;
                prev = curr ;
                curr=next ;
                count ++;
            }
            if (firstPass){
                head = prev ; firstPass=false ;
            }
            else {
                prevFirst.next = prev ;
            }
            prevFirst=first;
        }
        return head ;
    }
}
