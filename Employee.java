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

public class Employee extends Person {
    double salary;

    Employee(String n, int a, double s) {
        super(n, a);
        salary = s;
    }

    public void displaySalary() {
        System.out.println("My salary is $" + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("John", 30, 55000);
        e1.introduce();
        e1.displaySalary();
    }
}
