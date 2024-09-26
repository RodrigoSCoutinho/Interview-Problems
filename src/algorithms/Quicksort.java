package algorithms;

public class Quicksort {
    public static void main(String[] args) {
        int[] list = { 5, 3, 1, 9, 8, 2, 4, 7 };
        quicksort(list, 0, list.length - 1);

        for (int i : list) {
            System.out.print(i + " ");
        }
    }

    public static void quicksort(int[] list, int low, int high) {

        if (low < high) {
            int pi = partition(list, low, high);

            quicksort(list, low, pi - 1);
            quicksort(list, pi + 1, high);
        }
    }

    public static int partition(int[] list, int low, int high) {
        int pivot = list[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (list[j] < pivot) {
                i++;
                int temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }

        int temp = list[i + 1];
        list[i + 1] = list[high];
        list[high] = temp;

        return i + 1;
    }
}
