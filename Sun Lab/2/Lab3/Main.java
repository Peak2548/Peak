import java.util.ArrayList;
import packA.*;

public class Main {
    public static void main(String[] args) {
        q1();
        }
        static void q1() {
            ArrayList<EmpTmp> aList = new ArrayList<>();
            aList.add(new Accountant("goodAtmyJob",  7,  6,  390,  "sing"));
            aList.add(new Accountant( "canRap",  4,  9, 480,  "rap"));
            aList.add(new Salesperson( "mr.salesperson",  5,  150,  5000));
            aList.add(new Salesperson( "mr.kayan",  3,  260,  9000));
            aList.add(new Programmer( "Keng",  2,  300));
            aList.add(new EmpTmp( "invisible",  9,  120));
            System.out.println( "Upcasting");
            for (EmpTmp e : aList) {
                e.sayHi();
            }
            System.out.println("Downcasting");
            for (EmpTmp e : aList) {
                String str;
                if (e instanceof Programmer) {
                    Programmer e2 = (Programmer)e;
                    str = e2.coding();
                }
                else if (e instanceof Salesperson) {
                    Salesperson e3 = (Salesperson)e;
                    str = e3.makeQuotation();
                }
                else if (e instanceof Accountant) {
                    Accountant e4 = (Accountant)e;
                    str = e4.tellProfit();
                }
                else {
                    str = e.toString();
                }
                System.out.println(str);
            }
        }
}
