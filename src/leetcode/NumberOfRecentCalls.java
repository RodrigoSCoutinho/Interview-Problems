package leetcode;

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<Integer>();
    }

    public int ping(int t) {

        requests.add(t);

        int range = t - 3000;

        while (requests.peek() < range) {
            requests.poll();
        }
        return requests.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
