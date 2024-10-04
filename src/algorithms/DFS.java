package algorithms;

import java.util.*;

public class DFS {

    // Função para realizar a busca em profundidade (DFS)
    public void dfs(int currentNode, List<List<Integer>> adjList, boolean[] visited) {
        // Marca o nó atual como visitado
        visited[currentNode] = true;

        // Imprime o nó atual
        System.out.print(currentNode + " ");

        // Itera por todos os vizinhos do nó atual
        for (int neighbor : adjList.get(currentNode)) {
            // Se o vizinho ainda não foi visitado, chama a DFS recursivamente para ele
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited);
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

        // Criando um array para marcar os nós visitados
        boolean[] visited = new boolean[adjList.size()];

        // Criando o objeto da classe DFS e chamando o método dfs
        DFS dfs = new DFS();
        dfs.dfs(0, adjList, visited);
    }
}
