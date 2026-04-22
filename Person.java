public class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    public void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        Person p = new Person("Edric", 20   );
        p.introduce();
    }
}
