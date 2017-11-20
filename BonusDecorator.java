public class BonusDecorator extends CartDecorator{

    public BonusDecorator(Cart cart){
        super(cart);
    }

    @Override
    public boolean ship() {
        return true;
    }


}
