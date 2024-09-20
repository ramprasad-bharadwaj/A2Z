// Deque -> Doubly ended queue -> Insertion and deletion from both the end.
// It contains the implementation of Lists and Queues, and we can implement stack and queues from Dequeue
// Used in sliding window problems
// use .offer() .poll() .peek() always to be exception free code. Instead of .add() .remove() and .get()
// most of the queue methods have .....First() and .....Last() methods in deque. Ex: pollFirst() and .offerFirst()

// Deque for Stack implementation...
// Vector has the Stack implementation, but it is comparatively slower as it follows synchronization.
// Hence, use Stack related operations on Deque-ArrayDeque so that processing becomes faster.
// Methods -> .push() .pop()

// Deque for Queue Implementation...
// There is now direct implementation for queue hence use Deque-ArrayDeque as it also leverages the methods from List Interface
// Methods -> .add() or .offer() |  .remove() or .poll()

//Don't confuse -> Stack implementation -> .push() .pop(),
//                 Queue Implementation -> .offer() .poll()

package CollectionFramework.Deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LearnArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque();
        d.offer(10);
        d.offerLast(20);
        d.offerFirst(0);

        System.out.println(d.poll());
        System.out.println(d.pollLast());
        System.out.println(d.pollFirst());

        System.out.println(d);
    }
}
