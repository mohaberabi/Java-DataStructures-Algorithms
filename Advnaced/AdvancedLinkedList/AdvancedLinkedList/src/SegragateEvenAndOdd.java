import java.util.HashMap;
import java.util.Map;

public class SegragateEvenAndOdd {

    public Node segragateEvenAndOdd(Node head){
        Node oE =null;
        Node oS=null;
        Node eS=null;
        Node eE=null;
        for (Node curr = head ; curr!=null;curr=curr.next){

            if (curr.data%2==0){
                if (eS==null){
                    eS=curr;
                    eE=curr;
                }
                else {
                    eE.next=curr;
                    eE=eE.next;
                }



            }

            else {
                if (oS==null){
                    oS=curr;
                    oE=curr;
                }
                else {
                    oE.next=curr;
                    oE=oE.next;
                }
            }
        }

        if (oS==null||eS==null){
            return head ;
        }
        eE.next=oS;
        oE.next=null;

        return eS;

    }
}
