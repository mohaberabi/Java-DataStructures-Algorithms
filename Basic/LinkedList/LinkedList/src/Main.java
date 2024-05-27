public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(1);

        list.insertToTail(2);
        list.insertToTail(3);
        list.insertToTail(4);
        list.insertToTail(5);
        list.insertToTail(6);

        list.printMiddle();

        int pos = list.getPosition(2);
        System.out.println(pos);
    }
}