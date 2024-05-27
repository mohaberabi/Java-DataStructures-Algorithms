public class Main {
    public static void main(String[] args) {


        Node root = new Node(1);
        Node left = new Node(2);
        Node right = new Node(3);
        root.left = left;
        root.right = right;


        int res = SubtreesWithGivenSum.subTreesWithSum(root, 3);


        System.out.println(res);
    }
}