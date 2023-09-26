package design.patterns;

import design.patterns.facade.Facade;
import design.patterns.singleton.SingletonEager;
import design.patterns.singleton.SingletonLazy;
import design.patterns.singleton.SingletonLazyHolder;
import design.patterns.strategy.*;


public class Main {
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

        //TESTES FACADE
        Facade facade = new Facade();
        facade.migrateCustomer("Letícia", "96075810");

    }
}