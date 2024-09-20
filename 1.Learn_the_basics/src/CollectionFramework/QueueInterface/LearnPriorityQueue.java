// Priority Queue -> Lower the number, Higher the priority -> similar ti=o ranking system.
// Priority Queue uses |minHeap| to sort the elements entered and polls the small one out.

// We can reverse the ordering by changing the minHeap to maxHeap by entering the lambda expression inside the parameter.
// Queue<Integer> pq = new PriorityQueue((a,b)-> b-a); // now it's maxHeap.

// In case of Strings, it will sort the strings in the Dictionary form or lexicographical format.

// Custom methods can also be implemented using |comparable and comparator|



package CollectionFramework.QueueInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue();

        pq.offer(100);
        pq.offer(20);
        pq.offer(300);
        pq.offer(40);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}
