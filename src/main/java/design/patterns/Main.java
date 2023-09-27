package design.patterns;

import design.patterns.abstractFactory.CafeteriaFactory;
import design.patterns.abstractFactory.Client;
import design.patterns.abstractFactory.MeatBaseFactory;
import design.patterns.abstractFactory.VegetarianBaseFactory;
import design.patterns.facade.Facade;
import design.patterns.singleton.SingletonEager;
import design.patterns.singleton.SingletonLazy;
import design.patterns.singleton.SingletonLazyHolder;
import design.patterns.strategy.*;

import java.util.Scanner;


public class Main {

    private static Client clientInCafeteria() {

        Client client;
        CafeteriaFactory factory;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua base:");
        String base = scanner.next();

        String chosenBase = base.toLowerCase();

        if(chosenBase.contains("meat")){
            factory = new MeatBaseFactory();
        } else {
            factory = new VegetarianBaseFactory();
        }

        client = new Client(factory);
        return client;
    }

    public static void main(String[] args) {
        //TESTES SINGLETON
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //TESTES STRATEGY
        Behavior normal = new NormalBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior agressive = new AggressiveBehavior();

        Robot robot = new Robot();

        robot.setStrategy(normal);
        robot.move();

        robot.setStrategy(agressive);
        robot.move();

        robot.setStrategy(defensive);
        robot.move();

        robot.setStrategy(normal);
        robot.move();

        //TESTE FACADE
        Facade facade = new Facade();
        facade.migrateCustomer("Letícia", "96075810");

        //TESTE ABSTRACT FACTORY
        Client client = clientInCafeteria();
        client.base();
    }
}

