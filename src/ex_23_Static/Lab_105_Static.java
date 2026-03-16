package ex_23_Static;

public class Lab_105_Static {
    static void main(String[] args) {

        Student s1 = new Student(23);
        Student s2 = new Student(33);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(s1.course);
        System.out.println(s2.course);

        s1.m1();

    }

}


class Student {

    int age; //non-static, instance variable, attribute

    static String course = "ATB";

    public Student(int age)
    {
        this.age = age;
    }

    public static void m1()
    {
        System.out.println("static method");

        //System.out.println(this.age + "static function cannot call non static variable");
    }
}
