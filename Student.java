class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Student extends Person {
    String school;

    Student(String n, int a, String s) {
        super(n, a);
        school = s;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
        System.out.println("I attend " + school + ".");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Edric", 20, "Middlesex College");
        s1.introduce();
    }
}
