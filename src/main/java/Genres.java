public enum Genres {
    ACTION("Action"), MOBA("Moba"), SIMULATION("Simulation");

    private String name;

    Genres(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}