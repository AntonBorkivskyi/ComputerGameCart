public class ComputerGameParameters {
    private Genres genre;
    private Platforms platform;
    private int ageRestriction;
    private String description;

    public ComputerGameParameters(int ageRestriction, String description, Genres genre, Platforms platform){
        this.genre = genre;
        this.platform = platform;
        this.description = description;
        this.ageRestriction = ageRestriction;
    }

    public String getDescription() {
        return description;
    }

    public Genres getGenre() {
        return genre;
    }

    public Platforms getPlatform() {
        return platform;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public boolean matches(ComputerGameParameters param_to_match){
        if (this.getAgeRestriction() != param_to_match.getAgeRestriction()){return false;}
        if (this.getDescription() != param_to_match.getDescription()){return false;}
        if (this.getGenre() != param_to_match.getGenre()){return false;}
        return this.getPlatform() == param_to_match.getPlatform();
    }

}
