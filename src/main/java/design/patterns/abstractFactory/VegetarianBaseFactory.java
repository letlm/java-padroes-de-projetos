package design.patterns.abstractFactory;

public class VegetarianBaseFactory implements CafeteriaFactory {
    @Override
    public Hamburger burguer() {
        return new VegetarianBase();
    }
}
