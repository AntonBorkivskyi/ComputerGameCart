import org.junit.Test;

import static org.junit.Assert.*;

public class ObserveTest{
    @Test
    public void user() throws Exception {
        User c1 = new Customer();
        c1.update();

        User c2 = new Seller();
        c2.update();

        Cart cart = new Cart();
        assertEquals(true, cart.addObserver(c1));
        assertEquals(true, cart.addObserver(c2));
        assertEquals(true, cart.notifyObservers());
        assertEquals(true, cart.removeObserver(c1));
        assertEquals(true, cart.removeObserver(c2));
        assertEquals(0, cart.getObservers().size());
    }
}