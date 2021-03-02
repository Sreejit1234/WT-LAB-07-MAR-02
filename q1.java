/**
 * Illustrate the usage of abstract class with following Java classes. - An
 * abstract class "student" with data member roll no, reg no and a abstract
 * method course() - A subclass "kiitian" with course() method implementation
 */
public class q1 {
    public static void main(String[] args) {
        new Kiitian(1905, 905).course("CSE");
    }
}

abstract class Student {
    int roll;
    int regno;

    abstract void course(String yourCourse);
}

class Kiitian extends Student {
    Kiitian(int regno, int roll) {
        super.regno = regno;
        super.roll = roll;
    }

    @Override
    void course(String yourCourse) {
        System.out.println(regno + " " + roll + "-> Your Course: " + yourCourse);
    }
}
