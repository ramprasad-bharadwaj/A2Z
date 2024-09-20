package BasicPrograms;
// Collection of basic usage of;
// User Input/Output
// Data types
// If else
// Switch statements
// Array and Strings initialization
// For and while loops (incl. enhanced)
// Functions
// Time complexity

import java.util.Scanner;

public class All_the_basics {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        All_the_basics all = new All_the_basics();

        long l1 = Long.parseUnsignedLong("12345678901234567890");
        String l1Str = Long.toUnsignedString(l1);
        System.out.println(l1Str);

        long fact;
        fact = all.factorial(20);
        System.out.println(fact);

        all.datatypes();
//        all.inout();
//        all.timer(5);
//        all.allarrays();

        int add1 = all.add(5, 10);
        float add2 = all.add(5.5f, 9.5f);
        double add3 = all.add(5.5, 9.5);
    }

    public int add(int x, int y) {
        return x + y;
    }

    public float add(float x, float y) {
        return x + y;
    }

    public double add(double x, double y) {
        return x + y;
    }

    private void allarrays() {
        int a[] = {1,2,3,4,5};
        for(int i: a)
            System.out.println(i);
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }

    //default access specifier
    void timer(int i) {
        while(i != -1){
            System.out.println(i);
            i--;
        }
    }

    private long factorial(int i) {
        long fact = 1;
        for (int num = i; num > 1; num--)
            fact *= num;
        return fact;
    }

    public void datatypes(){
        System.out.println("byte " + Byte.BYTES);
        System.out.println("char " + Character.BYTES);
        System.out.println("int " + Integer.BYTES);
        System.out.println("long " + Long.BYTES);
        System.out.println("short " + Short.BYTES);
        System.out.println("double " + Double.BYTES);
        System.out.println("float " + Float.BYTES);
    }

    public void inout(){
        System.out.println("Enter in sequence\n boolean, char, byte, short, int, long, float, double, String");

        boolean z;
        z = sc.nextBoolean();
        System.out.println(z);

        char c;
        c = sc.next().charAt(0);
        System.out.println(c);

        byte x; // upto 127
        x = sc.nextByte();
        System.out.println(x);

        short s;
        s = sc.nextShort();
        System.out.println(s);

        int a;
        a = sc.nextInt();
        System.out.println(a);

        long d;
        d = sc.nextLong();
        System.out.println(d);

        float b;
        b = sc.nextFloat();
        System.out.println(b);

        double e;
        e = sc.nextDouble();
        System.out.println(e);

        String str;
        float array[] = new float[2];

        System.out.println("Enter the array elements: ");
        for(int i = 0; i < 2; i++){
            array[i] = sc.nextFloat();
        }
        System.out.println();
        for(float i: array)
            System.out.print(i + ", ");
    }
}
