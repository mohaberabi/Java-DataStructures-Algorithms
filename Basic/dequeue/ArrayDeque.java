package dequeue;

public class ArrayDeque {
    int size;
    int capacity;
    int[] arr;
    int frontIndex;

    ArrayDeque(int c) {
        frontIndex = 0;
        capacity = c;
        size = 0;
        arr = new int[c];
    }

    boolean isFull() {
        return size == capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void deleteFront() {
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    void deleteRear() {
        size--;
    }

    void insertRear(int x) {
        arr[size] = x;
        size++;
    }

    void insertFront(int x) {
        for (int i = size - 1; i >= 0; i--) {
            arr[i + 1] = arr[i];

        }
        arr[0] = x;
        size++;
    }


    void insertRearEffiecnt(int x) {
        if (isFull()) return;

        int newRear = (frontIndex + size) % capacity;
        arr
                [newRear] = x;
        size++;
    }


    void deleteFrontEffecient() {
        frontIndex = (frontIndex + 1) % capacity;
        size--;
    }

    int getRearEffiecnt() {
        return (frontIndex + size - 1) % capacity;
    }

    void insertFrontEffiecnt(int x) {
        frontIndex = (frontIndex + capacity - 1) % capacity;
        arr[frontIndex] = x;

    }

    int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return size - 1;
    }

    int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return arr[0];
    }
}
