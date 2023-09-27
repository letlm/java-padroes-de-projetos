package design.patterns.abstractFactory;

public class MeatBaseFactory implements CafeteriaFactory {
    @Override
    public Hamburger burguer() {
        return new MeatBase();
    }
}
