package linkedlist;

import common.MyNode;
import org.w3c.dom.Node;

import java.util.ArrayList;

public class LinkedListHelper {

//    static void printMiddle(MyNode head) {
//        if (head == null) return;
//        MyNode fast = head;
//        MyNode slow = head;
//
//        while (fast != null && fast.getNext() != null) {
//            slow = slow.getNext();
//            fast = fast.getNext().getNext();
//        }
//        System.out.println(slow.toString());
//
//    }
//    static MyNode removeTail(MyNode head) {
//        if (head == null) {
//            return null;
//        }
//        if (head.getNext() == null) {
//            return null;
//        }
//
//        MyNode curr = head;
//
//        while (curr.getNext().getNext() != null) {
//            curr = curr.getNext();
//
//        }
//        curr.setNext(null);
//        return head;
//    }
//    static ArrayList<Integer> displayLinkedList(MyNode head) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        MyNode curr = head;
//        while (curr != null) {
//
//            ans.add(curr.getData().hashCode());
//            curr = curr.getNext();
//        }
//
//        return ans;
//    }

    //    static MyNode addToTail(MyNode head, String data) {
//        MyNode node = new MyNode(data);
//
//        if (head == null) {
//            return node;
//        } else {
//            MyNode curr = head;
//            while (curr.getNext() != null) {
//                curr = curr.getNext();
//            }
//            curr.setNext(node);
//            return head;
//        }
//    }
//    static MyNode addToHead(MyNode head, String data) {
//        MyNode node = new MyNode(data);
//        node.setNext(head);
//        return node;
//    }
//    static MyNode deleteHead(MyNode head) {
//        if (head == null) {
//            return null;
//        }
//        return head.getNext();
//    }
    //    static void printMiddelNaive(MyNode head) {
//
//        if (head == null) {
//            return;
//        }
//        int count = 0;
//        MyNode curr;
//        for (curr = head; curr != null; curr = curr.getNext()) {
//            count++;
//
//
//        }
//
//        curr = head;
//        for (int i = 0; i < count / 2; i++) {
//            curr = curr.getNext();
//        }
//        System.out.println(curr.toString());
//
//    }

    //    static int searchAndGetPositionItrative(MyNode head, String data) {
//
//        MyNode curr = head;
//        int index = 1;
//        while (head != null) {
//            if (head.getData() == data) {
//                return index;
//            } else {
//                index++;
//                curr = curr.getNext();
//            }
//        }
//        return -1;
//    }
//
//
//    static int searchAndGetPositionRecursive(MyNode head, String data) {
//        if (head == null) return -1;
//        if (head.getData() == data) {
//            return 1;
//        } else {
//            int index = searchAndGetPositionRecursive(head.getNext(), data);
//            if (index == -1) {
//                return -1;
//            } else {
//                return index + 1;
//            }
//        }
//
//    }
//static void traverseLinkedListRecursive(MyNode node) {
//
//        if (node == null) {
//            return;
//        }
//        System.out.println(node.toString());
//        traverseLinkedListRecursive(node.getNext());
//
//    }
//    static boolean isIdentical(MyNode head1, MyNode head2) {
//        if (head1 == null || head2 == null) {
//            return false;
//        }
//        boolean ans = true;
//
//        MyNode node1 = head1;
//        MyNode node2 = head2;
//        while (node1 != null && node2 != null) {
//            if (node1.getData() != node2.getData()) {
//                ans = false;
//                break;
//            }
//            node1 = node1.getNext();
//            node2 = node2.getNext();
//        }
//        return ans;
//    }
//    static void removeDuplicates(MyNode head) {
//        MyNode curr = head;
//        while (curr != null && curr.getNext() != null) {
//            if (curr.getData() == curr.getNext().getData()) {
//                curr.setNext(curr.getNext().getNext());
//            } else {
//                curr = curr.getNext();
//            }
//        }
//    }


//    static MyNode reverse(MyNode head) {
//        MyNode curr = head;
//        MyNode prev = null;
//        while (curr != null) {
//            MyNode next = curr.getNext();
//            curr.setNext(prev);
//            prev = curr;
//            curr = next;
//
//        }
//        return prev;
//    }

    static boolean sorted(MyNode head) {


        if (head == null) {
            return false;
        }
        if (head.getNext() == null) {
            return true;
        }
        boolean inc = true;
        boolean dec = true;


        MyNode temp = head;
        MyNode temp2 = head.getNext();

        while (temp2 != null) {
            if (temp2.getData().hashCode() < temp.getData().hashCode()) {
                inc = false;
            }
            temp2 = temp2.getNext();
            temp = temp.getNext();
        }
        temp = head;
        temp2 = head.getNext();

        while (temp2 != null) {
            if (temp2.getData().hashCode() > temp.getData().hashCode()) {
                dec = false;
            }
            temp2 = temp2.getNext();
            temp = temp.getNext();
        }
        return inc || dec;
    }


    static void printNFromEnd(int n, MyNode head) {
        int len = 0;
        for (MyNode node = head; node != null; node = node.getNext()) {
            len++;
        }
        if (len < n) {
            return;
        }
        MyNode curr = head;
        for (int i = 0; i < len; i++) {
            curr = curr.getNext();
        }
        System.out.println(curr.toString());
    }


    static MyNode insertIntoSortedd(MyNode head, String data) {

        if (head == null) {
            return null;
        }

        if (head.getData().hashCode() >= data.hashCode()) {
            MyNode node = new MyNode(data);

            node.setNext(head);
            head = node;
            return head;

        }
        MyNode temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        if (data.hashCode() > temp.getData().hashCode()) {
            temp.setNext(new MyNode(data));
            return head;
        }
        MyNode prev = head;
        MyNode curr = head;
        while (data.hashCode() > curr.getData().hashCode()) {
            prev = curr;
            curr = curr.getNext();
        }

        prev.setNext(new MyNode(data));
        prev = prev.getNext();
        prev.setNext(curr);
        return head;
    }


    static MyNode insertAtPos(MyNode head, int pos, String data) {
        MyNode node = new MyNode(data);
        if (head == null) {
            return node;
        }
        if (pos == 1) {
            node.setNext(head);
            return node;
        }
        MyNode curr = head;

        int edge = pos - 2;
        for (int i = 1; i <= edge; i++) {
            curr = curr.getNext();
        }

        /// if position is longer than list length itself so do not change anything return the same head ;
        if (curr == null) {
            return head;
        }
        node.setNext(curr.getNext());
        curr.setNext(node);
        return head;
    }


//


//
}
