// Methods -> .offer(),  .poll(), .peek()
//            1) .add() vs .offer() both of them append the elements but
//            .offer() returns false if it can't append element for some reason
//            and .add() throws exception but .offer() doesn't...
//            2) .remove() vs .poll() both removes an element from the front of the list but
//            .poll() returns null if the queue is empty rather throwing an exception alike .remove().
//            3) .element() vs .peek() both return the top element but
//            .peek() returns Null if queue is empty rather throwing an exception alike .element().

package CollectionFramework.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedList {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());

//        while (!q.isEmpty()){
//            q.poll()
//        }


    }
}
