import java.util.Arrays;
import java.util.Scanner;

public class SeasonsTest {

    public static void main(String[] args) {

        UserInputUtils.showInfo();
        Scanner scanner = new Scanner(System.in);
        boolean err = true;
        while (err) {
            try {
                String inputSeason = scanner.nextLine();
                Seasons.showSeasonAndMonths(inputSeason);
                err = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Nie ma takiej pory roku. Spróbuj jeszcze raz");
            }
        }
        scanner.close();


    }
}
