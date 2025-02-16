package packA;

public class Programmer {
    private String name;
    protected int salary;
    private int experience;
    public Programmer(String n, int exp, int sal) {
        name = n; salary = sal; experience = exp;
    }
    public Programmer(String n) {
        name = n;
    }
    public Programmer() {}
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setSalary(int newSalary) {
        salary = newSalary;
    }
    public int getSalary() {
        return salary;
    }
    public void setExperience(int exp) {
        experience = exp;
    }
    public int getExperience() {
        return experience;
    }
    public String toString() {
        return "Programmer [name=" + name + ", salary=" + salary + ", experience=" + experience ;
    }
    public void sayHi() {
        System.out.println("hi from " + name);
    }
}