package packA;

public class EmpTmp {
    private String name;
    protected int salary;
    private int experience;
    public EmpTmp(String n, int exp, int sal) {
        name = n; salary = sal; experience = exp;
    }
    public EmpTmp(String n) {
        name = n;
    }
    public EmpTmp() {}
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
        return "";
    }
    public void sayHi() {
        System.out.println("Hi from an EmpTmp instance");
    }
}