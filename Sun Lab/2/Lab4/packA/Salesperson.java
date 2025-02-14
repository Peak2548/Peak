package packA;

public class Salesperson extends Employee implements SalesRoles {
    private int target;
    @Override
    public void sayHi() {
        System.out.println("I'm an Saleperson");
    }
    public void setSalary() {
        salary += (salary * 10 / 100);
    }
    public void setSalary(int incAmount) {
        salary += incAmount;
    }
    @Override
    public String makeQuotation() {
        return "Dear value customer, " + (int)(Math.random() * 1000)  + " is my best offer.";
    }
}