public class IsBST {

    boolean isBSTMethod1 ( Node root , int min , int max ){
        if(root==null){
            return  true ; 
        }
        return  root.data>min && root.data<max
                &&isBSTMethod1(root.left,min , root.data)&&
                isBSTMethod1(root.right, root.data,max);
        
    }


    int  prev = Integer.MIN_VALUE;
    boolean isBSTUsingInOrderTraversal ( Node root ){
        if(root==null){
            return true ;
        }

        if(!isBSTUsingInOrderTraversal(root.left)){
            return false;
        }
        isBSTUsingInOrderTraversal(root.left);

        if(root.data<=prev){
            return false;
        }
        prev = root.data;
        return  isBSTUsingInOrderTraversal(root.right);
    }
}
