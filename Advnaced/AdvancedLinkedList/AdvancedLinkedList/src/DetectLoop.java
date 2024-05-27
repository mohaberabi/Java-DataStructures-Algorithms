public class DetectLoop {


    public static boolean isLoop (Node head ){
        Node fast = head;
        Node slow = head ;
        while (fast !=null&&fast.next !=null){
            fast = fast.next.next ;
            slow = slow.next;
            if (fast ==slow){
                return true;
            }
        }
        return false ;
    }

    public void  detectAndRemoveLoop (Node head ){
        Node fast = head ;
        Node slow = head ;
        while (fast!=null&&fast.next !=null){
            fast = fast.next.next ;
            slow = slow.next ;
            if (slow ==fast){
                break;
            }
        }
        if (slow!=fast){
            return ;
        }

        slow = head;
        while (slow.next!=fast.next){
            slow = slow.next ;
            fast = fast.next ;
        }
        fast.next=null;
    }
}
