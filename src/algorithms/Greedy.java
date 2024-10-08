package algorithms;

// Problema da Mochila Fracionária (Knapsack Fracionário)
// Dado um conjunto de itens, cada um com um valor e um peso, o objetivo é maximizar o valor total dos itens que podem ser colocados em uma mochila com capacidade limitada. No problema fracionário, podemos pegar frações dos itens.

import java.util.*;

class Item {
    int weight;
    int value;

    // Construtor para o item
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

public class Greedy {

    // Função para resolver o problema da Mochila Fracionária usando abordagem
    // gulosa
    public static double fractionalKnapsack(int capacity, Item[] items) {
        // Ordena os itens por valor/peso decrescente
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.value / o1.weight;
                double r2 = (double) o2.value / o2.weight;
                return Double.compare(r2, r1);
            }
        });

        double totalValue = 0.0; // Valor total que podemos levar na mochila
        int currentCapacity = capacity; // Capacidade restante da mochila

        // Itera sobre os itens ordenados
        for (Item item : items) {
            if (item.weight <= currentCapacity) {
                // Se o item cabe inteiro na mochila, leva ele todo
                totalValue += item.value;
                currentCapacity -= item.weight;
            } else {
                // Caso contrário, leva a fração que cabe
                double fraction = (double) currentCapacity / item.weight;
                totalValue += item.value * fraction;
                break; // Como pegamos uma fração, a mochila está cheia
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        // Definindo os itens (peso, valor)
        Item[] items = {
                new Item(10, 60), // Item 1: peso 10, valor 60
                new Item(20, 100), // Item 2: peso 20, valor 100
                new Item(30, 120) // Item 3: peso 30, valor 120
        };

        // Capacidade da mochila
        int capacity = 50;

        // Calcula o valor máximo que podemos levar
        double maxValue = fractionalKnapsack(capacity, items);

        // Exibe o resultado
        System.out.println("Valor máximo na mochila = " + maxValue);
    }
}
