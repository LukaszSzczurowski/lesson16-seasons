import java.util.Arrays;

public enum Seasons {

    SPRING("wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("lato", new String[]{"czerwiec", "lipiec", "sierpień"}),
    AUTUMN("jesień", new String[]{"wrzesień", "październik", "listopad"}),
    WINTER("zima", new String[]{"grudzień", "styczeń", "luty"});

    private String descriptionPL;
    private String[] months;

    Seasons(String descriptionPL, String[] months) {
        this.descriptionPL = descriptionPL;
        this.months = months;
    }

    static void showSeasonAndMonths(String season) {
        Seasons convertSeason = convertTo(season);
        System.out.println(convertTo(season));
        printMonths(convertSeason);
    }

    private static Seasons convertTo(String polishDescription) {
        for (Seasons season : Seasons.values()) {
            if (season.descriptionPL.equalsIgnoreCase(polishDescription))
                return season;
        }
        throw new IllegalArgumentException("Nie ma takiej pory roku");
    }

    private static void printMonths(Seasons season) {
        StringBuilder sb = new StringBuilder();
        System.out.println("Miesiące pory roku: " + season.descriptionPL);
        System.out.println("to: " + Arrays.toString(season.months));

    }
}
