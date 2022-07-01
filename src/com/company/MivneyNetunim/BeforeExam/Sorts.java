package com.company.MivneyNetunim.BeforeExam;

public class Sorts {
    public static void main(String[] args) {
//        int[] arr = new int[]{3, 8, 10, 6, 9, 4, 7, 15, 1};
//        System.out.println(Arrays.toString(arr));
//        mergeSort(arr);
//        System.out.println(Arrays.toString(arr));
//        int[] arr2 = new int[]{3, 8, 10, 6, 9, 4, 7, 15, 1};
//        System.out.println(Arrays.toString(arr2));
//        selectionSort(arr2);
//        System.out.println(Arrays.toString(arr2));

    }

    // ----------- Task 1 -----------
    // find if there are 2 numbers sum equal zero, in sorted array, O(n).
    public static boolean sum_zero(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while (i<j){
            if (arr[i] + arr[j] == 0) return true;
            else if (arr[i] + arr[j] < 0) i++;
            else if (arr[i] + arr[j] > 0) j--;
        }
        return false;
    }

    // ----------- Task 2 -----------
    // sort array by even numbers first and odd numbers last, O(n).
    public static void uniqueSort(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while (i<j){
            if (arr[i] % 2 == 0) i++;
            else {
                while (arr[j] % 2 != 0) j--;
                swap(arr, i, j);
            }
        }
    }

    // --- Radix Sort ---
    // a sort based on sort the digits from units and on...
    public static void radixSort(int[] a) {//O(n)+O(n*log(k))=O(n*log(k))
        int i, max = a[0], exp = 1, n = a.length;
        int base = 10;
        int[] temp = new int[n];
        for (i = 1; i < n; i++) {
            if (a[i] > max) max = a[i];
        }
        while (max / exp > 0) {
            int[] bucket = new int[base];
            for (i = 0; i < n; i++) {
                int index = (a[i] / exp) % base;
                bucket[index]++;
            }
            for (i = 1; i < base; i++) {
                bucket[i] = bucket[i] + bucket[i - 1];
            }
            for (i = n - 1; i >= 0; i--) {
                //temp[--bucket[(a[i] / exp) % base]] = a[i];
                int j = (a[i] / exp) % base;
                temp[--bucket[j]] = a[i];
            }
            //System.out.println(Arrays.toString(temp));
            for (i = 0; i < n; i++)
                a[i] = temp[i];
            exp = exp * base;
        }
    }

    // --- Counting Sort ---
    //
    public static void countingSort(int[] a) {//O(n+k)
        /** find max and min values **/
        int N = a.length;
        int max = a[0], min = a[0];
        for (int i = 1; i < N; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        int range = max - min + 1;
        /** make count/frequency array for each element **/
        int count[] = new int[range];
        for (int i = 0; i < a.length; i++)
            count[a[i] - min]++;
        /** modify count so that positions in final array is obtained **/
        for (int j = 1; j < range; j++)
            count[j] = count[j] + count[j - 1];

        /** modify original array **/
        for (int i = 0, j = 0; j < range; j++) {
            while (i < count[j]) a[i++] = j + min;
        }
    }


    // --- Selection Sort ---
    //
    public static void selectionSort(int[] arr){
        int minIndex;
        for (int i = 0; i < arr.length-1; i++) {
            minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i , minIndex);
        }
    }

    // --- Insertion Sort ---
    //
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j = j - 1;
            }
        }
    }


    // --- Bubble Sort ---
    //
    public static void bubbleSort(int[] arr){
        boolean flag = true;
        for (int i=0; flag && i <arr.length; i++){
            flag = false;
            for (int j=0; j < arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    flag = true;
                }
            }
        }
    }

    // --- Binary Search ---
    //  (in a sorted array)
    public static int binarySearch(int[] arr, int element) {
        return binarySearch(arr, 0, arr.length - 1, element);
    }

    public static int binarySearch(int[] arr, int low, int high, int element) {
        int middle = (high + low) / 2;
        int current = arr[middle];
        if (current == element)
            return middle;
        else if (low >= high)
            return -1;
        else if (current < element)
            return binarySearch(arr, low, middle - 1, element);
        else return binarySearch(arr, middle + 1, high, element);
    }

    // --- Quick Sort ---
    //
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = low;
        low++;
        while (low <= high) {
            if (arr[low] <= arr[pivot]) low++;
            else if (arr[high] > arr[pivot]) high--;
            else swap(arr, low, high);
        }
        swap(arr, high, pivot);
        return high;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // --- Merge Sort ---
    //
    public static void mergeSort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);
            merge(arr, start, middle, end);
        }
    }

    private static void merge(int[] arr, int start, int middle, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = middle + 1;
        int tempIndex = 0;
        while (i <= middle && j <= end) {
            if (arr[i] < arr[j])
                temp[tempIndex++] = arr[i++];
            else temp[tempIndex++] = arr[j++];
        }
        // if one of them not end than continue to add (because they already sort by their own)
        while (i <= middle)
            temp[tempIndex++] = arr[i++];
        while (j <= end)
            temp[tempIndex++] = arr[j++];
        // copy the temp array to original
        i = start;
        tempIndex = 0;
        while (tempIndex < temp.length && i <= end) {
            arr[i++] = temp[tempIndex++];
        }
    }
}
