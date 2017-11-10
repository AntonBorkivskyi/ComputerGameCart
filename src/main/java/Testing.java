import java.util.ArrayList;

public class Testing {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addGame("N1", 100, 1, new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS));

        cart.addGame("N2", 200, 2, new ComputerGameParameters(12, "D2", Genres.MOBA, Platforms.WINDOWS));
        cart.addGame("N3", 300, 3, new ComputerGameParameters(15, "D3", Genres.SIMULATION, Platforms.LINUX));
        cart.addGame("N4", 400, 4, new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS));


        ComputerGameParameters cgp = new ComputerGameParameters(15, "D3", Genres.MOBA, Platforms.WINDOWS);

        ArrayList<ComputerGame> games = cart.search(cgp);
        System.out.println(games);
        if (games.isEmpty()){
            System.out.println("Sorry, nothing for you");
        }else{
            for(ComputerGame game : games){
                System.out.println("We found: "+ game.getName() + " | " + game.getParameters().getDescription() + " | " + game.getParameters().getAgeRestriction() + " | " + game.getParameters().getGenre() + " | " + game.getParameters().getPlatform());
            }
        }
    }
}
