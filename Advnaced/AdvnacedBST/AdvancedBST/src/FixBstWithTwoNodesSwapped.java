public class FixBstWithTwoNodesSwapped {



    Node prev  = null ;  Node first   = null;
    Node second = null;

Node  fixTree (Node root ){
    fixBST(root );
    swapData();
    return root ;
}


   private void fixBST(Node root){
        if(root==null){
            return;
        }
        fixBST(root.left);
        if(prev!=null&&prev.data>root.data){
            if(first ==null){
                first=prev ;
            }
            second = root;
        }
        prev = root ;
        fixBST(root.right);
    }


    void swapData ( ){
        int temp = first.data;
        first.data = second.data;
        second.data = temp  ;
    }
}
