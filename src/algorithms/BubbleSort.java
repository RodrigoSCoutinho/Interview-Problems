package algorithms;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        bubbleSort(array);

        System.out.println("Sorted array");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void bubbleSort(int[] list) {

        int n = list.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Se o elemento atual for maior que o próximo
                if (list[j] > list[j + 1]) {

                    // Troca list[j] e list[j + 1]
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    // Another way to implement bubble sort

    public static void main2(String[] args) {

        int[] array = { 64, 34, 25, 12, 22, 11, 90 };

        boolean swapped = true; // flag to check if any swap is done
        int aux;

        do {
            swapped = false;
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i + 1]) {
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println("Sorted array");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}