package CollectionFramework;// https://d2jdgazzki9vjm.cloudfront.net/images/java-collection-hierarchy.png

// Why generics: Because of robustness, ex: We dont want to dublicate ArrayList for Integer, Float, String ..etc seperatly
// So, generics provides functionality to create a class with different datatypes.

import java.util.Scanner;

public class Collection_Framework {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Collection_Framework c = new Collection_Framework();
        c.ArrayList();
        c.LinkedList();
        c.Vector();
        c.Stack();
        c.PriorityQueue();
        c.ArrayDequeue();
        c.HashSet();
        c.LinkedHashSet();
        c.TreeSet();
    }
    void ArrayList(){

    }
    void LinkedList(){

    }
    void Vector(){

    }
    void Stack(){

    }
    void PriorityQueue(){

    }
    void ArrayDequeue(){

    }
    void HashSet(){

    }
    void LinkedHashSet(){

    }
    void TreeSet(){

    }
}
