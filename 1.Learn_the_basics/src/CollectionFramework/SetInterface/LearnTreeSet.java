// Internally implements BST (Binary Search Tree) to stores the elements in sorted order with no duplicates.
// Prints the sorted tree elements in inorder traversal.
// Time Complexity -> O(log n)

package CollectionFramework.SetInterface;

import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet();

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
        System.out.println(s.contains(50));
        System.out.println(s);
    }
}
