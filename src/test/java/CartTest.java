import org.junit.Test;

import static org.junit.Assert.*;

public class CartTest {
    @Test
    public void cart() throws Exception {
        Cart cart = new Cart();
        ComputerGame cg = new ComputerGame("G1", 1200, 56, new ComputerGameParameters(12, "D1", Genres.ACTION, Platforms.IOS));
        assertEquals(true, cart.addGame(cg));
        assertEquals(false, cart.ship());
        assertEquals(1200, cart.computeTotalPrice(), 0.01);

        CartDecorator cd = new CartDecorator(cart);
        BonusDecorator bd = new BonusDecorator(cart);
        DiscountDecorator dd = new DiscountDecorator(cart);
        assertEquals(true, bd.ship());
        System.out.println(dd.computeTotalPrice());
        assertEquals(960, dd.computeTotalPrice(), 0.01);

        cart.paymentStrategy = new CashPayment();
        assertEquals(true, cart.paymentStrategy.pay(cart.computeTotalPrice()));
        cart.paymentStrategy = new Privat24Payment();
        assertEquals(true, cart.paymentStrategy.pay(cart.computeTotalPrice()));

        cart.deliveryStrategy = new DeliveryNovaPoshta();
        assertEquals(true, cart.deliveryStrategy.deliver(cart.getGames()));
        cart.deliveryStrategy = new DeliveryDHL();
        assertEquals(true, cart.deliveryStrategy.deliver(cart.getGames()));
    }
}