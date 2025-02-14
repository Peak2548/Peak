package packA;

public class Accountant extends Employee {
    private static String companyName = "berk barn jamkad";
    private int experience;
    private String specialty;

    @Override
    public void sayHi() {
        System.out.println(this.name + ", an Accountant, says hello");
    }
    public String tellProfit() {
        return companyName + "'s profit is " + (int)(Math.random() * 1000) + ". My salary is " + this.salary;
    }
    public static String tellMyRole() {
        return "I am an accountant at " + companyName;
    }
}