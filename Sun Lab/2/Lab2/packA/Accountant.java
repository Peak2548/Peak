package packA;

public class Accountant extends Programmer {
    private static String companyName = "berk barn jamakd";
    private int experience;
    private String specialty;
    public Accountant(String name, int superExp, int experience, int sal, String talent) {
        super(name, experience, sal); specialty = talent; setExperience(superExp);
    }
    public void setSpecialty(String newSpecialty) {
        specialty = newSpecialty;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setAccountExperience(int exp) {
        experience = exp;
    }
    public int getAccountExperience() {
        return experience;
    }
    public String tellProfit() {
        return companyName + "'s profit is " + (int)(Math.random() * 1000) + ". My salary is " + this.salary;
    }
    public String toString() {
        return "Accountant [experience=" + this.experience + ", specialty=" + this.specialty + "]";
    }
    public void sayHi() {
        System.out.println(this.getName() + " says hello");
    }
    public static String tellMyRole() {
        return "I am an accountant at " + companyName;
    }
}
