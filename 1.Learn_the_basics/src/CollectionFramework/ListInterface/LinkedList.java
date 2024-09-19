// Same methods alike ArrayList as both extends List Interface
// But it doesn't store elements in contiguous locations

package CollectionFramework.ListInterface;

import java.util.Iterator;
import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> fruits = new java.util.LinkedList();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Muskmelon");

        Iterator f = fruits.iterator();

        for(String fruit: fruits){
            System.out.print(fruit + ", ");
        }


    }
}
