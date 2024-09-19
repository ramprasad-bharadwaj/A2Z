// Vector Class synchronizes each individual operation.
// Used in multithreading env.
// Less efficient due to the overhead of synchronization.
// Stack is implemented based on vector because stack operations requires synchronization.
// Stack extends Vector extends List extends Collection extends Iterable.

package CollectionFramework.ListInterface;

import java.util.List;
import java.util.Vector;

public class VectorClass {
    public static void main(String[] args) {
        List<Integer> nums = new Vector();

        nums.add(10);
        nums.add(29);
        nums.remove(1);
        nums.add(20);
    }
}
