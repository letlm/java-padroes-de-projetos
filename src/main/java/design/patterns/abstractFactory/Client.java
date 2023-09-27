package design.patterns.abstractFactory;

public class Client {
    private Hamburger burguer;

    public Client(CafeteriaFactory factory){
        burguer = factory.burguer();
    }

    public void base(){
        burguer.base();
    }
}
