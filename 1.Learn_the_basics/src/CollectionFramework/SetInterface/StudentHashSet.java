package CollectionFramework.SetInterface;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StudentHashSet {
    public static void main(String[] args) {

        Set<Student> s = new HashSet();
        s.add(new Student(1, "Ram", "ram@gmail.com"));
        s.add(new Student(1, "Shyam", "shyam@gmail.com"));
        s.add(new Student(2, "Krishna", "ram@gmail.com")); //duplicated mail

        Student s1 = new Student(5, "Raghu", "raghu@@gmail.com");
        Student s2 = new Student(5, "Raghuvir", "raghuvir@@gmail.com");

        System.out.println(s1.getClass());
        System.out.println(s2.getClass());
        System.out.println(s1.equals(s2));

        System.out.println(s);
    }
}

class Student{
    int rollNo;
    String name;
    String gmail;

    public Student(int rollNo, String name, String gmail) {
        this.rollNo = rollNo;
        this.name = name;
        this.gmail = gmail;
    }

    // We can call this explicitly but implicitly the HashSet implements before adding an element;
    // Here the implementation for custom class is demonstrated.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //Here it checks whether the object passed is same object, then return true.
        // But we received, 2 different objects / instances of a class - here 2 different students
        if (o == null || getClass() != o.getClass()) return false; // both student instances are not null and belong to same class.
        Student student = (Student) o; //typecasting
        return rollNo == student.rollNo || Objects.equals(gmail, student.gmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, gmail);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
}

