package common;

public class MyNode {
    private String data;
    private MyNode next;

    private MyNode previous;

    public MyNode(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public MyNode getPrevious() {
        return previous;
    }

    public void setPrevious(MyNode previous) {
        this.previous = previous;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MYNODE-> " + data;
    }
}
