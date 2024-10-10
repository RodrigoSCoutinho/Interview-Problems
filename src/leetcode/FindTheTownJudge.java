package leetcode;

public class FindTheTownJudge {
    public int findJudge(int n, int[][] trust) {
        // Vetores para armazenar quantas pessoas confiam em um dado nó (trustCount)
        // e em quantos outros o nó confia (trustOthers).
        int[] trustCount = new int[n + 1];
        int[] trustOthers = new int[n + 1];

        // Processar as relações de confiança.
        for (int[] relation : trust) {
            int a = relation[0];
            int b = relation[1];

            // a confia em b
            trustOthers[a]++;
            trustCount[b]++;
        }

        // Procurar a pessoa que todos confiam (n-1), mas que não confia em ninguém (0).
        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1 && trustOthers[i] == 0) {
                return i; // Este é o juiz.
            }
        }

        return -1; // Se não encontrar ninguém que seja o juiz.
    }
}
