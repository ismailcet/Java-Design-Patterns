package org.ismailcet.abstractfactorypatterns.implementation;

public class app {
    public static void main(String[] args) {
        AbstractFactory<Car> car = FactoryProvider.getFactory("Car");
        AbstractFactory<Motorcycle> motorcycle = FactoryProvider.getFactory("motorcycle");

        Car bmw = car.create("BMW");
        Motorcycle motorBmw = motorcycle.create("BMW");

        System.out.println("Car BMW " + bmw.getPrice());
        System.out.println("Motor BMW " + motorBmw.getPrice());

        Car audi = car.create("AUDI");
        Motorcycle motorAudi = motorcycle.create("AUDI");

        System.out.println("Car AUDI " + audi.getPrice());
        System.out.println("Motor AUDI " + motorAudi.getPrice());
    }
}
