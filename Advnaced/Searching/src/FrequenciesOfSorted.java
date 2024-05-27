public class FrequenciesOfSorted {

    int freqiuenciesInSorted(int[] arr, int n, int x) {
        int first = IndexOfFirstOccuerence.firstOccueceIterative(arr, n, x);
        if (first == -1) {
            return 0;
        } else {
            return IndexOfLastOccuerence.indexOfLastOccurenceIterative(arr, n, x) - first + 1;
        }
    }
}
