package packA;

import java.util.ArrayList;

public class Programmer extends Employee {
    public Programmer(String n, int exp, int sal) {
        name = n; experience = exp; salary = sal;
    }
    private ArrayList<String> skills = new ArrayList<>();
    public void setSkills(String ... s) {
        for (var x : s) {
            skills.add(x);
        }
    }
    public ArrayList<String> getSkills() {
        return skills;
    }
    @Override
    public void sayHi() {

    }
    public String coding() {
        return "I am coding.";
    }
}