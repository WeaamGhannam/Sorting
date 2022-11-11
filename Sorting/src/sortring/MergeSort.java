
package sortring;
import java.util.Arrays;

public class MergeSort {

    public static int[] mergeSort(int input[]) {
        if (input.length <= 7) {
            return insertionSort(input);
        } else {
            int minIndex = input.length / 2;
            int[] arrLeft = mergeSort(Arrays.copyOfRange(input, 0, minIndex));
            int[] arrRight = mergeSort(Arrays.copyOfRange(input, minIndex, input.length));

            return merge(arrLeft, arrRight);
        }
    }

    public static int[] merge(int[] arrLeft, int[] arrRight) {
        int newSize = arrLeft.length + arrRight.length;
        int outPut[] = new int[newSize];
        int leftIndex = 0, rightIndex = 0;
        for (int i = 0; i < newSize; i++) {
            if (leftIndex < arrLeft.length && rightIndex < arrRight.length) {
                if (arrLeft[leftIndex] < arrRight[rightIndex]) {
                    outPut[i] = arrLeft[leftIndex++];
                } else {
                    outPut[i] = arrRight[rightIndex++];
                }
            } else if (leftIndex == arrLeft.length) {
                outPut[i] = arrRight[rightIndex++];
            } else {
                outPut[i] = arrLeft[leftIndex++];
            }

        }
        return outPut;
    }

    public static int[] insertionSort(int[] x) {
        for (int i = 1; i < x.length; i++) {
            for (int j = i; j > 0; j--) {
                if (x[j - 1] > x[j]) {
                    swap(x, j, j - 1);
                }
            }
        }
        return x;
    }

    public static void swap(int x[], int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    public static void main(String[] args) {
        int arr[] = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

}

