// Similar to HashSet but implemented using LinkedList and hence, no randomness in accessing -> fixed order due to links.
// Time Complexity -> O(n) ->  due to LinkedList traversal.

package CollectionFramework.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet
{
    public static void main(String[] args) {
        Set<Integer> s = new LinkedHashSet<>();

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
