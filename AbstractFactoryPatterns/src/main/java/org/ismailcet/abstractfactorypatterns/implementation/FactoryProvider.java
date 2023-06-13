package org.ismailcet.abstractfactorypatterns.implementation;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        if("Car".equalsIgnoreCase(choice)){
            return new CarFactory();
        }
        else if("Motorcycle".equalsIgnoreCase(choice)){
            return new MotorcycleFactory();
        }

        return null;
    }
}
