package leetcode;

class Solution {
    public boolean isPalindrome(int x) {
        // Números negativos não são palíndromos
        if (x < 0) {
            return false;
        }

        int numeroOriginal = x;
        int numeroInvertido = 0;

        // Reverter o número
        while (x != 0) {
            int ultimoDigito = x % 10; // Obter o último dígito
            numeroInvertido = numeroInvertido * 10 + ultimoDigito; // Formar o número invertido
            x = x / 10; // Remover o último dígito
        }

        // Verificar se o número original é igual ao número invertido
        return numeroOriginal == numeroInvertido;
    }
}
