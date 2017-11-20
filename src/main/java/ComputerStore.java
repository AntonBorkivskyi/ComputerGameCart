import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    private List<ComputerGame> games;

    public ComputerStore(){
        games = new ArrayList();
    }

    public void addGame(String name, int price, int id, ComputerGameParameters parameters) {
        ComputerGame game = new ComputerGame(name, price, id, parameters);
        games.add(game);
    }

    public List getGames(){
        return games;
    }

    public ArrayList search(ComputerGameParameters parameters_to_search){
        ArrayList<ComputerGame> matching_games = new ArrayList();
        for (int i = 0; i < games.size(); i++){
            ComputerGame cg = games.get(i);
            ComputerGameParameters cgp = cg.getParameters();
            if (cgp.matches(parameters_to_search)){
                matching_games.add(cg);
            }
        }
        return matching_games;
    }
}
