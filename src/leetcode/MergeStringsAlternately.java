package leetcode;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Inicializa um StringBuilder para armazenar a string mesclada
        StringBuilder mergedString = new StringBuilder(); // => E.D para concatenar strings

        // Inicializa os contadores para percorrer word1 e word2
        int i = 0, j = 0;

        // Loop enquanto ainda houver caracteres em ambas as palavras
        while (i < word1.length() && j < word2.length()) {
            // Adiciona o caractere atual de word1 à string mesclada e incrementa i
            mergedString.append(word1.charAt(i++));

            // Adiciona o caractere atual de word2 à string mesclada e incrementa j
            mergedString.append(word2.charAt(j++));
        }

        // Se ainda houver caracteres restantes em word1, adiciona-os à string mesclada
        while (i < word1.length()) {
            mergedString.append(word1.charAt(i++));
        }

        // Se ainda houver caracteres restantes em word2, adiciona-os à string mesclada
        while (j < word2.length()) {
            mergedString.append(word2.charAt(j++));
        }

        // Retorna a string mesclada
        return mergedString.toString();
    }
}