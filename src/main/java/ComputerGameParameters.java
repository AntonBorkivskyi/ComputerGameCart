import java.util.ArrayList;

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

    public ComputerGameParameters setDescription(String description) {
        this.description = description;
        return this;
    }

    public Genres getGenre() {
        return genre;
    }

    public ComputerGameParameters setGenre(Genres genre) {
        this.genre = genre;
        return this;
    }

    public Platforms getPlatform() {
        return platform;
    }

    public ComputerGameParameters setPlatform(Platforms platform) {
        this.platform = platform;
        return this;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public ComputerGameParameters setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
        return this;
    }

    public boolean matches(ComputerGameParameters param_to_match){
        if (this.getAgeRestriction() != param_to_match.getAgeRestriction()){return false;}
        if (this.getDescription() != param_to_match.getDescription()){return false;}
        if (this.getGenre() != param_to_match.getGenre()){return false;}
        if (this.getPlatform() != param_to_match.getPlatform()){return false;}
        return true;
    }

}
