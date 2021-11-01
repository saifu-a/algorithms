package divideandconquer;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(array, start, mid);
            mergeSort(array, mid + 1, end);
            merge(array, start, mid, end);
        }
    }

    public static void merge(int[] array, int start, int mid, int end) {
        int[] temp = new int[array.length];
        int i = start;
        int j = mid + 1;
        int k = start;

        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= mid)
            temp[k++] = array[i++];

        while (j <= end)
            temp[k++] = array[j++];

        for (int x = start; x <= end; x++)
            array[x] = temp[x];
    }
}