class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice");
        System.out.println("Before: " + person.name);
        modifyPerson(person);
        System.out.println("After: " + person.name);
    }
    public static void modifyPerson(Person p) {
        p.name = "Bob";
    }
}

