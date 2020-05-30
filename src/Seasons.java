import java.util.Arrays;

public enum Seasons {

    SPRING("wiosna"),
    SUMMER("lato"),
    AUTUMN("jesień"),
    WINTER("zima");

    private static final String[] monthForSpring = {"marzec", "kwiecień", "maj"};
    private static final String[] monthForSummer = {"czerwiec", "lipiec", "sierpień"};
    private static final String[] monthForAutumn = {"wrzesień", "październik", "listopad"};
    private static final String[] monthForWinter = {"grudzień", "styczeń", "luty"};

    private String descriptionPL;

    Seasons(String descriptionPL) {
        this.descriptionPL = descriptionPL;
    }

    static void showInfo(){
        System.out.println("Wpisz porę roku:");
        System.out.println("wiosna lato jesień zima");
    }

    static void showSeasonAndMonths(String seasons) {

        Seasons season = convertTo(seasons);
        switch (season) {
            case SPRING -> {
                System.out.println(SPRING.name());
                showMonths(SPRING);
            }
            case SUMMER -> {
                System.out.println(SUMMER.name());
                showMonths(SUMMER);
            }
            case AUTUMN -> {
                System.out.println(AUTUMN.name());
                showMonths(AUTUMN);
            }
            case WINTER -> {
                System.out.println(WINTER.name());
                showMonths(WINTER);
            }

        }
    }

    private static Seasons convertTo(String seasons) {
        for(Seasons s: Seasons.values()){
            if (s.descriptionPL.equalsIgnoreCase(seasons))
                return s;
        }
        throw new NullPointerException("Nie ma takiej pory roku");
    }

    private static void showMonths(Seasons seasons) {
        switch (seasons) {
            case SPRING -> System.out.println(Arrays.toString(monthForSpring));
            case SUMMER -> System.out.println(Arrays.toString(monthForSummer));
            case AUTUMN -> System.out.println(Arrays.toString(monthForAutumn));
            case WINTER -> System.out.println(Arrays.toString(monthForWinter));
        }
    }


}
