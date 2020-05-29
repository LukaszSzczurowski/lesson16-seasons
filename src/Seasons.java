public enum Seasons {
    SPRING("wiosna"),
    SUMMER("lato"),
    AUTUMN("jesień"),
    WINTER("zima");


    private String descriptionPL;
    private final String[] monthForSpring = {"marzec","kwiecień","maj"};
    private final String[] monthForSummer= {"czerwiec","lipiec","sierpień"};
    private final String[] monthForAutumn= {"wrzesień","październik","listopad"};
    private final String[] monthForWinter= {"grudzień","styczeń","luty"};

    Seasons(String descriptionPL) {

        this.descriptionPL = descriptionPL;
    }

    public String getDescriptionPL() {
        return descriptionPL;
    }


}
