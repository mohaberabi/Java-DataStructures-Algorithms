public class MyCirculerLinkedList {


    MyNode head;


    MyCirculerLinkedList() {
        this.head = null;
    }

    static void print(MyNode head) {
        if (head == null) return;
        System.out.println(head.data);
        for (MyNode node = head.next; node != head; node = node.next) {
            System.out.println(node.data);
        }
    }

    int removeTail() {
        if (head == null) {
            return -1;
        }
        if (head.next == head) {
            return -1;
        }
        MyNode curr = head;
        int data = -1;
        while (curr.next.next != head) {
            curr = curr.next;

        }
        data = curr.next.data;
        curr.next = head;
        return data;
    }

    void insertToHeadNaive(int data) {
        MyNode added = new MyNode(data);

        if (head == null) {
            added.next = added;
            head = added;
        } else {
            MyNode last = head;
            while (last.next != head) {
                last = last.next;
            }

            added.next = head;
            head = added;
            last.next = head;

        }
    }

    void insertToHeadEffiecnt(int data) {
        MyNode added = new MyNode(data);
        if (head == null) {
            added.next = added;
            head = added;

        } else {
            added.next = head.next;
            head.next = added;
            int tempData = added.data;
            added.data = head.data;
            head.data = tempData;

        }
    }

    void insertToTailEffiecnt(int x) {
        MyNode added = new MyNode(x);
        if (head == null) {
            added.next = added;
            head = added;
        } else {
            added.next = head.next;
            head.next = added;
            int temp = added.data;
            added.data = head.data;
            head.data = temp;
            head = added;
        }
    }


    void insertToTailNaive(int x) {
        MyNode added = new MyNode(x);
        if (head == null) {
            added.next = added;
            head = added;
        } else {
            MyNode curr = head;

            while (curr.next != head) {
                curr = curr.next;
            }
            curr.next = added;
            added.next = head;
            head = added;
        }
    }


}
