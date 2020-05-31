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
        switch (convertSeason) {
            case SPRING -> {
                System.out.println(SPRING.name());
                printMonths(SPRING);
            }
            case SUMMER -> {
                System.out.println(SUMMER.name());
                printMonths(SUMMER);
            }
            case AUTUMN -> {
                System.out.println(AUTUMN.name());
                printMonths(AUTUMN);
            }
            case WINTER -> {
                System.out.println(WINTER.name());
                printMonths(WINTER);
            }
        }
    }

    private static Seasons convertTo(String season) {
        for (Seasons s : Seasons.values()) {
            if (s.descriptionPL.equalsIgnoreCase(season))
                return s;
        }
        throw new NullPointerException("Nie ma takiej pory roku");
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
