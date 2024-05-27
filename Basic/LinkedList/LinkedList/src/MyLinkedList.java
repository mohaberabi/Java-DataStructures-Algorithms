public class MyLinkedList {


    public MyNode head;

    public MyLinkedList(int data) {

        insertToHead(data);
    }


    void insertToHead(int data) {
        MyNode newNode = new MyNode(data);
        newNode.next = head;
        head = newNode;
    }

    int removeHead() {
        if (head == null) {
            return -1;
        }
        MyNode removed = head;

        head = head.next;
        return removed.data;
    }


    void insertToTail(int data) {
        if (head == null) {
            head = new MyNode(data);

        } else {
            MyNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = new MyNode(data);
        }

    }

    int removeTail() {
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            return -1;
        } else {
            MyNode curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            MyNode removed = curr.next;
            curr.next = null;
            return removed.data;
        }
    }


    void printMiddle() {
        if (head == null) {
            return;
        }
        MyNode fast = head;
        MyNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        System.out.println(slow.data);
    }

    int getPosition(int data) {
        if (head == null) {
            return -1;
        }

        MyNode curr = head;
        int pos = 1;
        while (curr != null) {
            if (data == curr.data) {
                return pos;
            } else {
                pos++;
                curr = curr.next;

            }
        }
        return -1;
    }

    void print() {
        MyNode curr = head;
        while (curr != null) {
            System.out.println("NODE -> " + curr.data);
            curr = curr.next;
        }
    }
}
