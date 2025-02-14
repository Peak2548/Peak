import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieCounter_050292 {
    ArrayList<Movie> availableList = new ArrayList<>();
    ArrayList<Movie> checkOutList = new ArrayList<>();

    MovieCounter_050292() {
        try (Scanner input = new Scanner(Paths.get("movies2.csv"))) {
                while (input.hasNext()) {
                    String row = input.nextLine();
                    String[] tokens = row.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                    try {
                        Movie m1 = new Movie(tokens[0], Integer.parseInt(tokens[1]), Double.parseDouble(tokens[2]));
                        availableList.add(m1);
                    }
                    catch (Exception e) {
                    }
                }
            }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    void showAvailableList() {
        System.out.println("The Following titles are available.");
        for (Movie avbMov : availableList) {
            System.out.println(avbMov);
        }
    }
    void showCheckoutList() {
        for (Movie checkPrint : checkOutList) {
            System.out.println(checkPrint);
        }
    }
    void checkout(int index) { 
        System.out.println("The following titles have been checked out.");
        checkOutList.add(availableList.get(index));
        availableList.remove(index);
    }
}