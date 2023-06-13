package org.ismailcet.abstractfactorypatterns.implementation;

public class AudiCar implements Car{

    static final String PRICE = "20000000";
    @Override
    public String getPrice() {
        return PRICE;
    }
}
