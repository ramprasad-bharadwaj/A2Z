package RegularConcepts;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //Autoboxing
//        Integer x = new Integer(12); //deprecated since version 9
        Integer p = Integer.valueOf("12");
        Integer q = Integer.valueOf("12");
        Integer r = Integer.valueOf(p*q);
        System.out.println(r);

        Boolean b = Boolean.valueOf("True");
        Integer z = 18;

        //unboxing
        int a = z + 10;
    }
}
