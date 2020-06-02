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

    static void showInfo() {
        System.out.println("Wpisz porę roku:");
        System.out.println("wiosna lato jesień zima");
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
        Seasons[] seasons = values();
        for (Seasons s : seasons) {
            if (s == season) {
                StringBuilder sb = new StringBuilder();
                sb.append("Miesiące pory roku: ");
                sb.append(s.descriptionPL + " to: ");
                sb.append(Arrays.toString(s.months));
                System.out.println(sb.toString());
            }
        }
    }
}
