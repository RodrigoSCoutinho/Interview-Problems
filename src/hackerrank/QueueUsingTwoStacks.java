package hackerrank;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {
    static class QueueUsingStacks {

        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        // Enqueue operation
        public void enqueue(int x) {
            stack1.push(x);
        }

        // Dequeue operation
        public int dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        // Get front element
        public int front() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueUsingStacks queue = new QueueUsingStacks();

        int queries = scanner.nextInt(); // Read number of queries
        for (int i = 0; i < queries; i++) {
            int queryType = scanner.nextInt();

            switch (queryType) {
                case 1: // Enqueue
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2: // Dequeue
                    queue.dequeue();
                    break;
                case 3: // Print front element
                    System.out.println(queue.front());
                    break;
            }
        }

        scanner.close();
    }
}
