import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<ComputerGame> games = new ArrayList<ComputerGame>();
    PaymentStrategy paymentStrategy;
    DeliveryStrategy deliveryStrategy;

    public Cart(){

    }

    public boolean ship(){
        return false;
    }

    public double computeTotalPrice(){
        double price = 0;
        for(ComputerGame game : games){
            price += game.getPrice();
        }
        return price;
    }

    public boolean addGame(ComputerGame cg){
        this.games.add(cg);
        return true;
    }

    public List getGames(){
        return this.games;
    }
}
