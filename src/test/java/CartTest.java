import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {
    @Test
    public void addGame() throws Exception {
        Cart cart = new Cart();
        cart.addGame("N1", 100, 1, new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS));
        assertEquals(1, cart.getGames().size());
        cart.addGame("N2", 200, 2, new ComputerGameParameters(12, "D2", Genres.MOBA, Platforms.WINDOWS));
        assertEquals(2, cart.getGames().size());

    }

    @Test
    public void search() throws Exception {
        Cart cart = new Cart();
        cart.addGame("N1", 100, 1, new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS));
        cart.addGame("N2", 200, 2, new ComputerGameParameters(12, "D2", Genres.MOBA, Platforms.WINDOWS));
        cart.addGame("N3", 300, 3, new ComputerGameParameters(15, "D3", Genres.SIMULATION, Platforms.LINUX));
        cart.addGame("N4", 400, 4, new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS));
        assertEquals(2, cart.search(new ComputerGameParameters(18, "D1", Genres.ACTION, Platforms.IOS)).size());
        assertEquals(0, cart.search(new ComputerGameParameters(15, "D3", Genres.MOBA, Platforms.WINDOWS)).size());

    }

}