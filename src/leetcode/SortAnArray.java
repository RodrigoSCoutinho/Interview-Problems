package leetcode;

public class SortAnArray {
    class Solution {
        public int[] sortArray(int[] nums) {
            if (nums == null || nums.length <= 1) {
                return nums; // Se o array for nulo ou já estiver ordenado (1 elemento)
            }

            mergeSort(nums, 0, nums.length - 1);
            return nums;
        }

        // Função de Merge Sort
        private void mergeSort(int[] nums, int left, int right) {
            if (left < right) {
                int mid = left + (right - left) / 2; // Encontra o meio do array

                // Ordena a primeira e a segunda metade
                mergeSort(nums, left, mid);
                mergeSort(nums, mid + 1, right);

                // Combina as duas metades ordenadas
                merge(nums, left, mid, right);
            }
        }

        // Função de Merge para combinar duas partes
        private void merge(int[] nums, int left, int mid, int right) {
            // Tamanhos dos dois subarrays a serem combinados
            int n1 = mid - left + 1;
            int n2 = right - mid;

            // Arrays temporários para armazenar os elementos das metades
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];

            // Copia os dados para os arrays temporários
            for (int i = 0; i < n1; i++) {
                leftArray[i] = nums[left + i];
            }
            for (int j = 0; j < n2; j++) {
                rightArray[j] = nums[mid + 1 + j];
            }

            // Combina os arrays temporários de volta em nums[left...right]
            int i = 0, j = 0;
            int k = left; // Índice inicial de nums

            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    nums[k] = leftArray[i];
                    i++;
                } else {
                    nums[k] = rightArray[j];
                    j++;
                }
                k++;
            }

            // Copia os elementos restantes de leftArray, se houver algum
            while (i < n1) {
                nums[k] = leftArray[i];
                i++;
                k++;
            }

            // Copia os elementos restantes de rightArray, se houver algum
            while (j < n2) {
                nums[k] = rightArray[j];
                j++;
                k++;
            }
        }
    }

}
