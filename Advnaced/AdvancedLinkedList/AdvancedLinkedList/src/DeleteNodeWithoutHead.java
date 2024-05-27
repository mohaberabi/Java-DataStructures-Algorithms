public class DeleteNodeWithoutHead {

    public void deleteNodeWithoutHead (Node node){
        node.data=node.next.data;
        node.next=node.next.next;


    }
}
