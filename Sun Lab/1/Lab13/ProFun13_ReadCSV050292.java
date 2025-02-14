import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ProFun13_ReadCSV050292 {
    public static void main(String[] args) {
        System.out.println("-demo1--");
        demo1();
        System.out.println("-demo2--");
        demo2();
        System.out.println("-demo3--");
        demo3();
        System.out.println("demo4--");
        demo4();
        // System.out.println("MovieCounter");
        // movieCounter();
    }
    // static void movieCounter() {
    //     MovieCounter_050292 location1 = new MovieCounter_050292();
    //     MovieCounter_050292 location2 = new MovieCounter_050292();

    //     System.out.println("location 1");
    //     location1.showAvailableList();
    //     System.out.println("location 2");
    //     location2.showAvailableList();

    //     System.out.println("location 1");
    //     location1.checkout(1);
    //     location1.showCheckoutList();
    //     location1.showAvailableList();

    //     System.out.println("location 2");
    //     location2.checkout(2);
    //     location2.showCheckoutList();
    //     location2.showAvailableList();
    // }
    static void demo4() {
        ArrayList<Movie> availableList = new ArrayList<>();
        ArrayList<String> err = new ArrayList<>();
        try (Scanner input = new Scanner(Paths.get("movies2.csv"))) {
            int cnt = 0;
            while (input.hasNext()) {
                cnt++;
                String row = input.nextLine();
                String[] tokens = row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                try {
                    Movie m1 = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                    availableList.add(m1);
                }
                catch (Exception e) {
                    err.add("At row " + cnt + ", exception named "+ e + "... skip");
                    continue;
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        for (String errPrint : err) {
            System.out.println(errPrint);
        }
        for (Movie movPrint : availableList) {
            System.out.println(movPrint);
        }
    }
    static void demo3() {
        try (Scanner input = new Scanner(Paths.get("movies2.csv"))) {
            int cnt = 0;
                while (input.hasNext()) {
                    cnt++;
                    String row = input.nextLine();
                    String[] tokens = row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                    try {
                        Movie m1 = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                        System.out.println(m1);
                    }
                    catch (Exception e) {
                        System.out.println("At row " + cnt + ", exception named "+ e + "... skip");
                        continue;
                    }
                }
            }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void demo2() {
        try (Scanner input = new Scanner(Paths.get("movies.csv"))) {
            while (input.hasNext()) {
                String row = input.nextLine();
                String[] tokens = row.split(",");
                Movie m1 = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                System.out.println(m1);
        }
    }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void demo1() {
        try (Scanner input = new Scanner(Paths.get("movies.csv"))) {
            while (input.hasNext()) {
                String row = input.nextLine();
                String[] tokens = row.split(",");
                System.out.println(tokens[0]);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}