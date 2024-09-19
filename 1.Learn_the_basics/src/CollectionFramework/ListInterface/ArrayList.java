// Implementation:
// new list = (old list * 3)/2 + 1
// Ex size increments: 10 -> 16 -> 25 -> ...


//Methods -> .add(value) .add(index, value) .remove(index) .remove(Integer.valueOf(value))
//           .get(index) .getFirst() .set(index, value) .removeAll() .retainAll()
//           .clear() .toArray() .indexOf() .lastIndexOf() .listIterator -> Iterator<E> i = li.iterator();
//           .sublist(start inclusive, end exclusive)

// for loop condition
// array -> nums.length
// ArrayList list -> list.size()

// for loop each indexing
// array -> nums[i]
// ArrayList list -> list.get(i)


package CollectionFramework.ListInterface;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<Integer> li = new java.util.ArrayList();

        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);

        // -----------------Iterator loop----------------------- //
        Iterator<Integer> i = li.iterator();
        while(i.hasNext()){
            System.out.print(i.next() + "\t");
        }


        // -----------------Methods--------------------- //
        System.out.println("\n" + li);
        System.out.println(li.size());
        System.out.println(li.get(2));
        System.out.println(li.contains(10));
        System.out.println(li.remove(3));
        System.out.println(li.remove(Integer.valueOf(30)));
        System.out.println(li.remove(Integer.valueOf(30)));
        System.out.println(li);

        // ------------------More Methods - require one more ArrayList---------------------- //

        List<Integer> li2 = new java.util.ArrayList();
        li2.add(50);
        li2.add(60);
        li2.add(70);
        li2.add(80);

        li.addAll(li2);
        //similarly removeAll()
        //similarly retainAll() //opposite of removeAll() // used to get the intersection
        //clear() -> delete all elements

        // ----------------ArrayList to array conversion & looping------------------ //

        Object a[] = li.toArray();

        for(Object x: a){
            Integer temp = (Integer) x;
            System.out.print(temp + " ");
        }
        System.out.println();
        System.out.println(li);

        //--------------------------------------------------------//




    }
}
