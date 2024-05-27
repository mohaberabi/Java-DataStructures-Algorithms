package linkedlist;

import common.MyNode;

public class CircularLinkedList {


    static void print2(MyNode head) {
        if (head == null) return;

        MyNode node = head;
        do {
            System.out.println(node.getData());
            node = node.getNext();
        } while (node != head);
    }

    static MyNode insertToHeadEffiecint(MyNode head, String x) {
        MyNode node = new MyNode(x);
        if (head == null) {
            node.setNext(node);
            return node;
        } else {
            node.setNext(head.getNext());
            head.setNext(node);
            String tempData = head.getData();
            head.setData(node.getData());
            node.setData(tempData);
            return head;
        }
    }
    static MyNode insertHeadNaive(MyNode head, String data) {
        MyNode node = new MyNode(data);
        if (head == null) {
            node.setNext(node);
        } else {
            MyNode curr = head;
            while (curr.getNext() != head) {
                curr = curr.getNext();
            }
            curr.setNext(node);
            node.setNext(curr);
        }
        return node;

    }
    static MyNode insertToTailNaive(MyNode head, String data) {
        MyNode node = new MyNode(data);
        if (head == null) {
            node.setNext(node);
            return node;
        } else {
            MyNode curr = head;
            while (curr.getNext() != head) {
                curr = curr.getNext();
            }
            curr.setNext(node);
            node.setNext(head);
            return head;
        }
    }

    static MyNode insertToTailEffiecient(MyNode head, String data) {

        MyNode node = new MyNode(data);
        if (head == null) {
            node.setNext(node);
            return node;
        } else {


            node.setNext(head.getNext());
            head.setNext(node);
            String tempData = node.getData();
            node.setData(head.getData());
            head.setData(tempData);
            return node;
        }
    }
static void print(MyNode head) {
        if (head == null) return;
        System.out.println(head.getData());
        for (MyNode node = head.getNext(); node != head; node = node.getNext()) {
            System.out.println(node.getData());
        }
    }
        static MyNode removeTail(MyNode head) {
        if (head == null) {
            return null;
        }
        if (head.getNext() == head) {
            return null;
        }
        MyNode curr = head;
        while (curr.getNext().getNext() != head) {
            curr = curr.getNext();
        }
        curr.setNext(head);
        return head;
    }


    static void insertAtPosition(MyNode head, int pos, String data) {
        MyNode node = new MyNode(data);

        if (head == null) {
            node.setNext(node);
            head = node;
        } else {
            if (pos == 1) {
                head = insertToHeadEffiecint(head, data);
            } else {
                MyNode curr = head;

                for (int i = 0; i < pos - 2; i++) {
                    curr = curr.getNext();
                }
                node.setNext(curr.getNext());
                head.setNext(node);

            }
        }


    }


    static MyNode removeHeadNaive(MyNode head) {
        if (head == null) {
            return null;
        }
        if (head.getNext() == head) {
            return null;
        }

        MyNode curr = head;

        while (curr.getNext() != head) {
            curr = curr.getNext();
        }
        MyNode temp = head;
        head = head.getNext();
        temp.setNext(null);
        curr.setNext(head);
        return curr.getNext();
    }

    MyNode deleteAtPos(MyNode head, int pos) {
        if (head == null) {
            return null;
        }
        if (pos == 1) {
            return removeHeadEffiecint(head);
        }
        MyNode curr = head;

        for (int i = 0; i < pos - 2; i++) {
            curr = curr.getNext();
        }
        curr.setNext(curr.getNext().getNext());
        return head;
    }


    static MyNode removeHeadEffiecint(MyNode head) {
        if (head == null) return null;
        if (head.getNext() == head) return null;
        head.setData(head.getNext().getData());
        head.setNext(head.getNext().getNext());
        return head;
    }
//
}
