public enum Platforms {
    WINDOWS("Windows"), IOS("iOS"), LINUX("Linux");

    private String name;

    Platforms(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}