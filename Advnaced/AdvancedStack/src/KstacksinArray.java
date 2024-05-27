public class KstacksinArray {


    int[] arr;
    int[] top;
    int[] next;
    int k;
    int freeTop;
    int cap;

    KstacksinArray(int k, int n) {
        this.k = k;
        this.cap = n;
        freeTop = 0;

        arr = new int[cap];
        top = new int[k];
        next = new int[cap];
        for (int i = 0; i < k; i++) {
            top[i] = -1;
        }
        for (int i = 0; i < cap - 1; i++) {
            next[i] = i + 1;
        }
        next[cap - 1] = -1;

    }

    void push(int x, int stackNo) {
        int i = freeTop;
        next[i] = top[stackNo];
        top[stackNo] = i;
        arr[i] = x;
    }

    int pop(int stackNo) {
        int i = top[stackNo];
        top[stackNo] = next[i];
        next[i] = freeTop;
        freeTop = i;
        return arr[i];
    }
}
