package divideandconquer;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int search = scanner.nextInt();

        boolean elementFound = binarySearch(array, 0, array.length, search);

        System.out.println("Is the element present? " + elementFound);
    }

    public static boolean binarySearch(int[] array, int start, int end, int search) {
        if (start >= end)
            return false;
        else {
            int mid = (start + end) / 2;
            if (array[mid] == search)
                return true;
            else {
                if (search > array[mid])
                    return binarySearch(array, mid + 1, end, search);
                else
                    return binarySearch(array, start, mid - 1, search);
            }
        }
    }
}
