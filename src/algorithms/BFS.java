package algorithms;

import java.util.*;

public class BFS {

    // Função para realizar a busca em largura (BFS)
    public void bfs(int startNode, List<List<Integer>> adjList) {
        // Array para marcar os nós visitados, inicializando com 'false'
        boolean[] visited = new boolean[adjList.size()];

        // Fila para manter a ordem dos nós a serem visitados
        Queue<Integer> queue = new LinkedList<>();

        // Marca o nó inicial como visitado e o adiciona na fila
        visited[startNode] = true;
        queue.add(startNode);

        // Enquanto a fila não estiver vazia, continuar processando os nós
        while (!queue.isEmpty()) {
            // Remove o primeiro nó da fila e imprime
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // Itera por todos os vizinhos do nó atual
            for (int neighbor : adjList.get(currentNode)) {
                // Se o vizinho ainda não foi visitado, marca como visitado e adiciona à fila
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Inicializando a lista de adjacência para o grafo
        List<List<Integer>> adjList = new ArrayList<>();

        // Adicionando as listas de vizinhos para cada nó
        for (int i = 0; i < 6; i++) {
            adjList.add(new ArrayList<>());
        }

        // Definindo as arestas do grafo (conexões entre os nós)
        adjList.get(0).add(1);
        adjList.get(0).add(2);
        adjList.get(1).add(3);
        adjList.get(1).add(4);
        adjList.get(2).add(5);

        // Criando o objeto da classe BFS e chamando o método bfs
        BFS bfs = new BFS();
        bfs.bfs(0, adjList);
    }
}
