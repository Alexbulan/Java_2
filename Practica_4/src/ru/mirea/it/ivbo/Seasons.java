package ru.mirea.it.ivbo;

public enum Seasons {
        WINTER(-15),
        SPRING(10),
        SUMMER(25){
            public void getDescription() {
                System.out.println("Теплое время года");
            }
        },
        AUTUMN(15);
    final private double averageTemperature;

    Seasons(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
    public void getDescription() {
        System.out.println("Холодное время года");
    }
    public void loveSeason(Seasons s){
        switch (s){
            case AUTUMN -> System.out.println("Я люблю осень");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case WINTER -> System.out.println("Я люблю зиму");
            default -> System.out.println("Я люблю все сезоны");
        }
    }

    @Override
    public String toString() {
        return "Average temperature is " +  averageTemperature;
    }
}
