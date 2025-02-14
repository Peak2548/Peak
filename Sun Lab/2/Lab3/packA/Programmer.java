package packA;

public class Programmer extends EmpTmp {
    public Programmer (String n, int exp, int sal) {
        super(n, exp, sal);
    }
    @Override
    public void sayHi() {
        System.out.println("hi " + getName());
    }
    @Override
    public String toString() {
        return "";
    }
    public String coding() {
        return "I am coding.";
    }
}