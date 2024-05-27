package linkedlist;

import common.MyNode;

public class DoublyLinkedList {


    static MyNode insertToHead(MyNode head, String data) {
        MyNode node = new MyNode(data);

        node.setNext(head);
        if (head != null) {
            head.setPrevious(node);
        }
        return node;
    }

    static MyNode reverser(MyNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        MyNode curr = head;
        MyNode prev = null;
        while (curr != null) {
            prev = curr.getPrevious();
            curr.setPrevious(curr.getNext());
            curr.setNext(prev);
            curr = curr.getPrevious();
        }
        return prev.getPrevious();
    }


//    static MyNode removeTail(MyNode head) {
//        if (head == null) {
//            return null;
//        }
//
//        if (head.getNext() == null) {
//            return null;
//        }
//
//        MyNode curr = head;
//        while (curr.getNext() != null) {
//            curr = curr.getNext();
//        }
//        curr.getPrevious().setNext(null);
//        return head;
//    }
//
//    static MyNode removeHead(MyNode head) {
//        if (head == null) {
//            return null;
//        }
//        if (head.getNext() == null) {
//            return null;
//        }
//
//        head = head.getNext();
//        head.setPrevious(null);
//        return head;
//    }

    static MyNode insertTotTail(MyNode head, String data) {
        MyNode node = new MyNode(data);
        if (head == null) {
            return node;
        }
        MyNode curr = head;
        while (curr.getNext() != null) {
            curr = curr.getNext();
        }
        curr.setNext(node);
        node.setPrevious(curr);
        return head;
    }
}
