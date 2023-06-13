package org.ismailcet.abstractfactorypatterns.implementation;

public class MotorcycleFactory implements AbstractFactory<Motorcycle>{
    @Override
    public Motorcycle create(String type) {
        if("BMW".equalsIgnoreCase(type)){
            return new BmwMotorcycle();
        } else if ("AUDI".equalsIgnoreCase(type)) {
            return new AudiMotorcycle();
        }
        return null;
    }
}
