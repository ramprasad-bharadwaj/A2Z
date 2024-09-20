// Simple HashSet -> Random Arrangement in memory due to Hashing

// Abstract implementation -> Ex: Consider it as a bag which only has/takes(input) unique elements and
//                                provides elements uniquely when outputs/fetched
// Due to the Randomness of the output, the time complexity is O(1)

// Methods -> |.add()| .addALl() |.remove()| .removeAll() .retainAll() .clear() .size() |.contains()|

package CollectionFramework.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet();

        s.add(10);
        s.add(10);
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(50);
        s.add(90);
        s.add(40);

        System.out.println(s);
        System.out.println(s.remove(10));
        System.out.println(s);
    }
}
