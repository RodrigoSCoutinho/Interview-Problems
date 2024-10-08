package algorithms;

import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
        // Definindo o grafo como um mapa de listas de adjacência
        Map<String, List<Node>> graph = new HashMap<>();
        graph.put("A", Arrays.asList(new Node("B", 1), new Node("C", 4)));
        graph.put("B", Arrays.asList(new Node("C", 2), new Node("D", 5)));
        graph.put("C", Arrays.asList(new Node("D", 1)));
        graph.put("D", Arrays.asList());

        // Chamando a função dijkstra para calcular as menores distâncias a partir do nó
        // "A"
        Map<String, Integer> distances = dijkstra(graph, "A");

        // Imprimindo as distâncias
        for (Map.Entry<String, Integer> entry : distances.entrySet()) {
            System.out.println("Distância de A para " + entry.getKey() + " é " + entry.getValue());
        }
    }

    // Função que implementa o algoritmo de Dijkstra
    public static Map<String, Integer> dijkstra(Map<String, List<Node>> graph, String start) {
        // Inicializando as distâncias com infinito
        Map<String, Integer> distances = new HashMap<>();
        for (String node : graph.keySet()) {
            distances.put(node, Integer.MAX_VALUE);
        }
        distances.put(start, 0);

        // Fila de prioridade para selecionar o nó com a menor distância
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        priorityQueue.add(new Node(start, 0));

        while (!priorityQueue.isEmpty()) {
            Node currentNode = priorityQueue.poll();
            String currentName = currentNode.name;

            // Atualizando as distâncias dos nós vizinhos
            for (Node neighbor : graph.get(currentName)) {
                int newDist = distances.get(currentName) + neighbor.distance;
                if (newDist < distances.get(neighbor.name)) {
                    distances.put(neighbor.name, newDist);
                    priorityQueue.add(new Node(neighbor.name, newDist));
                }
            }
        }

        return distances;
    }
}

// Classe auxiliar para representar um nó no grafo
class Node {
    String name;
    int distance;

    Node(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }
}