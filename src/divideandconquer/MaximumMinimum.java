package divideandconquer;

import java.util.Scanner;

class MaxMinPair {
    int max;
    int min;
}

public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        MaxMinPair maxMin = maximumMinimum(array, 0, array.length - 1);
        System.out.println("Maximum in the array is: " + maxMin.max);
        System.out.println("Minimum in the array is: " + maxMin.min);
    }

    public static MaxMinPair maximumMinimum(int[] array, int start, int end) {
        MaxMinPair maxMinPair = new MaxMinPair();

        if (start == end) {
            maxMinPair.max = maxMinPair.min = array[start];
        } else if (start - end == 1) {
            if (array[start] > array[end]) {
                maxMinPair.max = array[start];
                maxMinPair.min = array[end];
            } else {
                maxMinPair.max = array[end];
                maxMinPair.min = array[start];
            }
        } else {
            int mid = (start + end) / 2;
            MaxMinPair maxMinPair1 = maximumMinimum(array, start, mid - 1);
            MaxMinPair maxMinPair2 = maximumMinimum(array, mid + 1, end);

            if (maxMinPair1.max > maxMinPair2.max) {
                maxMinPair.max = maxMinPair1.max;
            } else {
                maxMinPair.max = maxMinPair2.max;
            }

            if (maxMinPair1.min < maxMinPair2.min) {
                maxMinPair.min = maxMinPair1.min;
            } else {
                maxMinPair.min = maxMinPair2.min;
            }
        }

        return maxMinPair;
    }
}