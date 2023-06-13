package org.ismailcet.abstractfactorypatterns.implementation;

public class CarFactory implements AbstractFactory<Car>{
    @Override
    public Car create(String type) {
        if("BMW".equalsIgnoreCase(type)){
            return new BmwCar();
        } else if ("AUDI".equalsIgnoreCase(type)) {
            return new AudiCar();
        }
        return null;
    }
}
