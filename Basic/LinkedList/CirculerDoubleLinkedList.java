package linkedlist;

import common.MyNode;

public class CirculerDoubleLinkedList {

    static boolean areTwoSame(MyNode head1, MyNode head2) {

        if (head1 == null || head2 == null) {
            return false;
        }

        MyNode n1 = head1;
        MyNode n2 = head2;

        do {
            if (n1.getData() != n2.getData()) {
                return false;
            }
            n1 = n1.getNext();
            n2 = n2.getNext();
        } while (n1 != head1 && n2 != head2);


        return true;
    }

    static String getMiddleOfCirulerDLList(MyNode head) {
        MyNode front = head;
        MyNode back = head.getPrevious();
        while (front != back) {
            front = front.getNext();
            back = back.getPrevious();
        }
        return front.getData();
    }

    static MyNode insertToHead(String data, MyNode head) {
        MyNode node = new MyNode(data);
        if (head == null) {
            node.setNext(node);
            node.setPrevious(node);
            return node;
        }

        node.setPrevious(head.getPrevious());
        node.setNext(head);
        head.getPrevious().setNext(node);
        head.setPrevious(node);
        return node;
    }
}
