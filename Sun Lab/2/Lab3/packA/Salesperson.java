package packA;

public class Salesperson extends EmpTmp {
    private int target;
    public Salesperson(String n, int exp, int sal, int assingedTarget) {
        super(n, exp, sal);
        target = assingedTarget;
    }
    public Salesperson(String n, int exp) {
        super(n);
        setExperience(exp);
    }
    public void setTarget(int target) {
        this.target = target;
    }
    public int getTarget() {
        return target;
    }
    @Override
    public void setSalary(int increasedAmount) {
        salary += increasedAmount;
    }
    public void setSalary() {
        salary += (salary * 10 / 100);
    }
    public String makeQuotation() {
        return "Dear value customer, " + (int)(Math.random() * 1000)  + " is my best offer.";
    }
    @Override
    public String toString() {
        return "Salesperson [target=" + this.target + " " + super.toString() + " ]";
    }
}
