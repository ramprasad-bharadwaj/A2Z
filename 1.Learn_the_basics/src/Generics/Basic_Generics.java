package Generics;

public class Basic_Generics {
    public static void main(String[] args) {
        //Generic classes
        Basic_Generics b = new Basic_Generics();
        Cat<Integer, String> x1 = new Cat(1, "Cat1");
        Cat<Integer, String> x2 = new Cat(2, "Cat2");

        //Generic method
        printData("String data");
        printData(123); //Integer data
        printData(45.678);
        printData(x1); // possible - returns the reference -- if there is a tostring() method then it returns the given string
        //printDoubleData(x1); // not possible - because it extends Number, so it won't accept object of a class

    }

    static <T> void printData(T data){
        System.out.println(data);
    }

    static <M extends Number> void printDoubleData(M data){
        System.out.println(data);
    }
}

class Dog<E>{
    E id;
    public Dog(E id){
        this.id = id;
    }
    E getId(){
        return id;
    }
}
class Cat<E, V> {
    E id;
    V name;

    public Cat(E id, V name){
        this.id = id;
        this.name = name;
    }

}
