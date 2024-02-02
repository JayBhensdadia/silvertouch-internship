import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {


    public static ArrayList<Integer> createArrayList(){
        ArrayList<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 15000; i++) {
            arr.add(random.nextInt(15000));
        }

        return arr;
    }

    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void selectionSort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }

            
            int temp = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, temp);
        }
    }

    public static void insertionSort(ArrayList<Integer> list) {
        int n = list.size();

        for (int i = 1; i < n; i++) {
            int key = list.get(i);
            int j = i - 1;

            
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }

            
            list.set(j + 1, key);
        }
    }

    public static void quickSort(ArrayList<Integer> list){
        quickSort(list, 0, list.size()-1);
    }

    public static void quickSort(ArrayList<Integer> list, int low, int high) {
        if (low < high) {
            
            
            int partitionIndex = partition(list, low, high);

            
            quickSort(list, low, partitionIndex - 1);
            quickSort(list, partitionIndex + 1, high);
        }
    }

    private static int partition(ArrayList<Integer> list, int low, int high) {
        int pivot = list.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            
            if (list.get(j) <= pivot) {
                i++;

                
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }

        
        int temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);

        return i + 1;
    }


    public static void mergeSort(ArrayList<Integer> list) {
        int n = list.size();

        if (n > 1) {
            int mid = n / 2;

            
            ArrayList<Integer> leftHalf = new ArrayList<>(list.subList(0, mid));
            ArrayList<Integer> rightHalf = new ArrayList<>(list.subList(mid, n));

            
            mergeSort(leftHalf);
            mergeSort(rightHalf);

            
            merge(list, leftHalf, rightHalf);
        }
    }

    private static void merge(ArrayList<Integer> list, ArrayList<Integer> left, ArrayList<Integer> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) < right.get(j)) {
                list.set(k++, left.get(i++));
            } else {
                list.set(k++, right.get(j++));
            }
        }

        
        while (i < left.size()) {
            list.set(k++, left.get(i++));
        }

        
        while (j < right.size()) {
            list.set(k++, right.get(j++));
        }
    }


    
    public static void countingSort(ArrayList<Integer> arr) {
        if (arr == null || arr.size() <= 1) {
            return;
        }
        int max = arr.get(0);
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        int[] count = new int[max + 1];
        for (int num : arr) {
            count[num]++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr.set(index++, i);
                count[i]--;
            }
        }
    }

    public static void radixSort(ArrayList<Integer> arr) {
        
        int max = getMax(arr);

        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private static void countingSort(ArrayList<Integer> arr, int exp) {
        int n = arr.size();
        ArrayList<Integer> output = new ArrayList<>(n);

        int[] count = new int[10];

        for (int i = 0; i < 10; i++) {
            count[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            count[(arr.get(i) / exp) % 10]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output.add(0);
        }
        for (int i = n - 1; i >= 0; i--) {
            output.set(count[(arr.get(i) / exp) % 10] - 1, arr.get(i));
            count[(arr.get(i) / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr.set(i, output.get(i));
        }
    }

    private static int getMax(ArrayList<Integer> arr) {
        int max = arr.get(0);
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static void heapSort(ArrayList<Integer> arr) {
        int n = arr.size();

        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for (int i = n - 1; i > 0; i--) {

            int temp = arr.get(0);
            arr.set(0, arr.get(i));
            arr.set(i, temp);

            heapify(arr, i, 0);
        }
    }

    private static void heapify(ArrayList<Integer> arr, int n, int i) {
        int largest = i;
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;

        if (leftChild < n && arr.get(leftChild) > arr.get(largest)) {
            largest = leftChild;
        }

        if (rightChild < n && arr.get(rightChild) > arr.get(largest)) {
            largest = rightChild;
        }

        if (largest != i) {

            int temp = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, temp);

            heapify(arr, n, largest);
        }
    }

    public static void bucketSort(ArrayList<Integer> array) {
        if (array == null || array.size() <= 1) {
            return;
        }

        int maxVal = Collections.max(array);
        int minVal = Collections.min(array);

        int numBuckets = (maxVal - minVal) / array.size() + 1;

        List<List<Integer>> buckets = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(new LinkedList<>());
        }

        for (Integer num : array) {
            int bucketIndex = (num - minVal) / array.size();
            buckets.get(bucketIndex).add(num);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (Integer num : bucket) {
                array.set(index++, num);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = createArrayList();

        long startTime;
        long endTime;



        System.out.println("---------------Comparing sorting algorithms--------------------");

        
        startTime = new Date().getTime();
        arr = createArrayList();
        bubbleSort(arr);
        endTime = new Date().getTime();
        System.out.println("bubble sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();
        
        
        startTime = new Date().getTime();
        arr = createArrayList();
        selectionSort(arr);
        endTime = new Date().getTime();
        System.out.println("selection sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();
        

        
        startTime= new Date().getTime();
        arr = createArrayList();
        insertionSort(arr);
        endTime = new Date().getTime();
        System.out.println("Insertion sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();
        

        
        startTime= new Date().getTime();
        arr = createArrayList();
        quickSort(arr);
        endTime = new Date().getTime();
        System.out.println("Quick sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();
        

        
        startTime= new Date().getTime();
        arr = createArrayList();
        mergeSort(arr);
        endTime = new Date().getTime();
        System.out.println("Merge sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();

        
        startTime= new Date().getTime();
        arr = createArrayList();
        countingSort(arr);
        endTime = new Date().getTime();
        System.out.println("Counting sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();


        
        startTime= new Date().getTime();
        arr = createArrayList();
        radixSort(arr);
        endTime = new Date().getTime();
        System.out.println("Radix sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();

        
        startTime= new Date().getTime();
        arr = createArrayList();
        heapSort(arr);
        endTime = new Date().getTime();
        System.out.println("Heap sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();


        
        startTime= new Date().getTime();
        arr = createArrayList();
        bucketSort(arr);
        endTime = new Date().getTime();
        System.out.println("Bucket sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();

        
        startTime= new Date().getTime();
        arr = createArrayList();
        Collections.sort(arr);
        endTime = new Date().getTime();
        System.out.println("Hybrid sort took "+ (endTime-startTime) + " miliseconds to sort");
        System.out.println();

    }
}