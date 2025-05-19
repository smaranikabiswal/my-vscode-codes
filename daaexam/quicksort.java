import java.util.*;

public class quicksort {

    public static void quickSort(int arr[], int low, int high) {
        if (low >= high) return;

        int start = low;
        int end = high;
        int pivot = arr[low]; // picking first element as pivot

        while (start < end) {
            while (start < end && arr[end] >= pivot) {
                end--;
            }
            while (start < end && arr[start] <= pivot) {
                start++;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        // place pivot to its correct position
        int temp = arr[low];
        arr[low] = arr[start];
        arr[start] = temp;

        // recursively sort left and right parts
        quickSort(arr, low, start - 1);
        quickSort(arr, start + 1, high);
    }

    public static void printArray(int arr[]) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, size - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }
}