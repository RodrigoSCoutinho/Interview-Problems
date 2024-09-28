package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = { 2, 3, 4, 10, 40 };
        System.out.println(binarySearch(list, 10)); // Deve retornar 4 (índice de 10)
    }

    public static int binarySearch(int[] list, int target) {

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;
            int guess = list[mid];

            if (guess == target) {
                return mid;
            } else if (guess >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}