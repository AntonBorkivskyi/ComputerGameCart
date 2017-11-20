public class CartDecorator extends Cart{
    Cart cart;

    public CartDecorator(Cart cart){
        this.cart = cart;
    }


}
