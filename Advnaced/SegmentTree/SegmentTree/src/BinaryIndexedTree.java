public class BinaryIndexedTree {

    int n;
    int[] arr;
    int[] tree;

    public BinaryIndexedTree(int[] arr) {
        this.arr = arr;
        this.tree = new int[arr.length + 1];
        this.n = arr.length;
    }

    void update(int i, int val) {
        int diff = val - arr[i];
        arr[i] = val;
        i = i + 1;

        while (i <= n) {
            tree[i] += diff;
            i = i + (i & -i);
        }
    }

    int getSum(int i) {
        i = i + 1;
        int res = 0;
        while (i > 0) {
            res += tree[i];
            i = i - (i & -i);
        }
        return res;
    }
}
