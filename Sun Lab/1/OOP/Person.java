package OOP;

public class Person {
    String name;
    int year;
    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }
    Person() {}
    void changeName() {
        this.name = ("Peak");
    }
}