package design.patterns.abstractFactory;

public class VegetarianBase implements Hamburger {
    @Override
    public void base() {
        System.out.println("Customer chose a vegetarian burger");
    }
}
