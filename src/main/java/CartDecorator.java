public class CartDecorator extends Cart{
    private Cart cart;

    public CartDecorator(Cart cart){
        this.cart = cart;
    }

    @Override
    public double computeTotalPrice() {
        return cart.computeTotalPrice();
    }

}
