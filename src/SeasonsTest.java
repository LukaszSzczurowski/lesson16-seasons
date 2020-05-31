import java.util.Arrays;
import java.util.Scanner;

public class SeasonsTest {

    public static void main(String[] args) {

        Seasons.showInfo();
        Scanner scanner = new Scanner(System.in);
        String inputSeason = scanner.nextLine();
        Seasons.showSeasonAndMonths(inputSeason);
        scanner.close();


    }
}
