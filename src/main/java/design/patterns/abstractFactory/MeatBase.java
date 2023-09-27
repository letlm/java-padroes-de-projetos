package design.patterns.abstractFactory;

public class MeatBase implements Hamburger{

    @Override
    public void base() {
        System.out.println("Customer chose a beef burger");
    }
}
