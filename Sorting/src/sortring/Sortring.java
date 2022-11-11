package sortring;

import java.util.Arrays;

public class Sortring {

    public static void main(String[] args) {
        int arr[] = {59, 46, 32, 80, 46, 55, 50, 43, 44, 81, 12, 95, 17, 80, 75, 33, 40, 61, 16, 87};
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);
        int[] arr4 = Arrays.copyOf(arr, arr.length);

        System.out.println("The Array :\n" + Arrays.toString(arr));
        System.out.println("Insertion Sort : ");
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Selection Sort : ");
        selectionSort(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("Bubble Sort : ");
        bubbleSort(arr3);
        System.out.println(Arrays.toString(arr3));

        quickSort(arr4);
        System.out.println("Quick Sort :\n"
                + Arrays.toString(arr4));

    }

    public static void insertionSort(int[] x) {
        for (int i = 1; i < x.length; i++) {
            for (int j = i; j > 0; j--) {
                if (x[j - 1] > x[j]) {
                    swap(x, j, j - 1);
                }
            }
            System.out.println(Arrays.toString(x));
        }
    }

    public static void selectionSort(int[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[j] < x[i]) {
                    swap(x, i, j);
                }
            }

            System.out.println(Arrays.toString(x));
        }

    }

    public static void bubbleSort(int[] x) {
        int swaps;
        do {
            swaps = 0;
            for (int i = 0; i < x.length - 1; i++) {
                if (x[i] > x[i + 1]) {
                    swap(x, i, i + 1);
                    swaps = 1;
                }

            }

            System.out.println(Arrays.toString(x));
        } while (swaps != 0);
    }

    public static void swap(int x[], int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    public static void quickSort(int[] x) {
        sort(x, 0, x.length - 1);
    }

    private static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);

        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);

            }

        }
        swap(arr, i + 1, high);
        return i + 1;
    }

}


