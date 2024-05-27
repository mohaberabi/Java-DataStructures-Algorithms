package hashing;

import java.util.Arrays;

public class LinearProbbing {


    public static int[] linearProbing(int hashSize, int arr[], int arraySize) {
        int[] ans = new int[hashSize];
        Arrays.fill(ans, -1);

        for (int i = 0; i < arraySize; i++) {
            int index = hash(arr[i], hashSize);

            while (ans[index] != -1) {
                index = (index + 1) % hashSize;
            }

            ans[index] = arr[i];
        }

        return ans;
    }

    private static int hash(int key, int size) {
        return key % size;
    }
}
