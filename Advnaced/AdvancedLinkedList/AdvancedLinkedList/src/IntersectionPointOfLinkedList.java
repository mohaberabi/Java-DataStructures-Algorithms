import java.util.HashSet;

public class IntersectionPointOfLinkedList {




    Node getIntersectionPointNaive  (Node h1 , Node h2 ){
        HashSet<Integer>set = new HashSet<>();


        for (Node curr =h1 ; curr !=null;curr= curr.next){
            set.add(curr.data);
        }

        Node curr= h2  ;
        while (curr!=null){
            if (set.contains(curr.data)){
                return curr;
            }
            curr = curr.next;
        }
        return null;

    }

    Node getIntersectionPointOptimal(Node h1 , Node h2 ){
        int len1 = 0 ;
        int len2 = 0 ;

        Node curr1 = h1 ;
        Node curr2 = h2 ;
        while (curr1!=null){
            len1++;
            curr1=curr1.next;
        }
        while (curr2!=null){
            len2++;
            curr2=curr2.next;
        }
        int gap = Math.abs(len1-len2);

        curr1=h1;
        curr2=h2 ;

            for ( int i = 0 ; i < gap;i++){
                if (len1>len2){
                    curr1=curr1.next;
                }
                   else {
                    curr2= curr2.next;
                }

            }

        while (curr1!=null&&curr2!=null){
            if (curr2.data==curr1.data){return  curr1;}
           else {
                curr1=curr1.next;
                curr2=curr1.next;
            }
        }
return null;
    }
}
