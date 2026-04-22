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

class Student extends Person {
    String school;

    Student(String n, int a, String s) {
        super(n, a);
        school = s;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
        System.out.println("I attend " + school + ".");
    }
}

class Employee extends Person {
    double salary;

    Employee(String n, int a, double s) {
        super(n, a);
        salary = s;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Person[] people = new Person[3];

        people[0] = new Person("Alex", 25);
        people[1] = new Student("Edric", 20, "Middlesex College");
        people[2] = new Employee("Mike", 35, 60000);

        for (int i = 0; i < people.length; i++) {
            people[i].introduce();
            System.out.println();
        }
    }
}
