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

class Employee extends Person {
    double salary;

    Employee(String n, int a, double s) {
        super(n, a);
        salary = s;
    }

    public void displaySalary() {
        System.out.println("My salary is $" + salary);
    }
}

public class Manager extends Employee {
    int teamSize;

    Manager(String n, int a, double s, int t) {
        super(n, a, s);
        teamSize = t;
    }

    public void displaySalary() {
        System.out.println("My salary is $" + salary);
        System.out.println("I manage a team of " + teamSize + " people.");
    }

    public static void main(String[] args) {
        Employee e = new Employee("John", 30, 50000);
        Manager m = new Manager("Sarah", 40, 80000, 5);

        e.introduce();
        e.displaySalary();

        System.out.println();

        m.introduce();
        m.displaySalary();
    }
}
