package algorithms;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        insertionSort(array);

        System.out.println("Sorted array");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void insertionSort(int[] array) {

        int n = array.length;

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = key;
        }
    }
}
