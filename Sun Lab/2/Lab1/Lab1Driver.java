import java.util.ArrayList;

public class Lab1Driver {
    public static void main(String[] args) {
        q1();
        q3();
    }
    static void q3() {
        Lab1Coder somsri = new Lab1Coder("Somsri", 5);
        somsri.setLanguages("javascript", "dart");
        Lab1Coder ber3 = new Lab1Coder("ber3");
        ArrayList<String> commonLanguages = ber3.findCommonLanguage(somsri);
        System.out.println(commonLanguages);
        commonLanguages = keng.findCommonLanguage(ber3);
        System.out.println(commonLanguages);
    }
    static void q1() {
        Lab1Coder santa = new Lab1Coder();
        santa.setName("Santa");
        santa.setExperience(3);
        System.out.println(santa.getName());
    }
}
