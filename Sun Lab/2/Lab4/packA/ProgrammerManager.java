package packA;

public class ProgrammerManager extends Programmer {
    public ProgrammerManager(String n, int exp, int sal) {
        super(n, exp, sal);
    }
    @Override
    public void sayHi() {
        System.out.println("From sayHi, I knonw " + getSkills()); 
    }
    public String coding() {
        return "I am coding.";
    }
    public int evaluate(Programmer p) {
        p.salary += (p.salary * 15 / 100);
        return p.salary;
    }
    @Override
    public String toString() {
        return "ManagerProgrammer [name=" + name + ", experience=" + experience + " salary=" + salary + "]";
    }
}
