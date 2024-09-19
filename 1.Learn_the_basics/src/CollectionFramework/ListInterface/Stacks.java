// Stack is implemented based on vector because stack operations requires synchronization.
// Stack extends Vector extends List extends Collection extends Iterable.

// -----------Methods-------------- //
// void push(E), E pop(), E peek(), boolean empty()

package CollectionFramework.ListInterface;

import java.util.List;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        // ----------------------- From List ------------------------//
        List<Integer> li = new Stack(); // only provides the methods from the List interface...
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        System.out.println(li);

        // ----------------------- From Stack - Unlocks Stack Methods ------------------------//
        Stack<Integer> st = new Stack(); // only provides the methods from the List interface...
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();
        st.pop();
        System.out.println(st);
        System.out.println("Peek: " + st.peek());
        System.out.println("Capacity: " + st.capacity());
        System.out.println("Size: " + st.size());
    }
}
