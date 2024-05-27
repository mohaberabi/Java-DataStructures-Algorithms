package Heap;

public class MyMinHeap {

    private int[] arr;
    private int size;
    private int capacity;

    MyMinHeap(int capacity) {
        arr = new int[capacity];
        size = 0;
        this.capacity = capacity;
    }


    public int getMin() {
        return arr[0];
    }


    /// means removes the first element
    public int extractMin() {
        if (size == 0) {
            return -1;
        }

        if (size == 1) {
            size--;
            return arr[0];
        }
        int min = arr[0];
        arr[0] = arr[size - 1];
        size--;
        minHeapify(0);
        return min;

    }

    void insert(int x) {
        if (size == capacity) {
            return;
        }
        size++;
        arr[size - 1] = x;
        for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i]; ) {
            swap(arr[i], arr[parent(i)]);
            i = parent(i);
        }
    }

    /// get the index of  the left child
    public int left(int index) {

        return 2 * index + 1;
    }

    public int right(int index) {
        return 2 * index + 2;
    }

    public int parent(int index) {

        return Math.abs((index - 1) / 2);
    }


    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void decreaseKey(int i, int x) {
        arr[i] = x;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            swap(i, parent(i));
        }
    }

    private void minHeapify(int index) {
        /// indicies
        int lt = left(index);
        int rt = right(index);
        int smallest = index;
        if (lt < size && arr[lt] < arr[index]) {
            smallest = lt;
        }
        if (rt < size && arr[rt] < arr[smallest]) {
            smallest = rt;
        }
        if (smallest != index) {
            swap(index, smallest);
            minHeapify(smallest);
        }
    }
}
