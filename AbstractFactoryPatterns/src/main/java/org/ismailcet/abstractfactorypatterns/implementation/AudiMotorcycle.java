package org.ismailcet.abstractfactorypatterns.implementation;

public class AudiMotorcycle implements Motorcycle{
    static final String PRICE = "20000";
    @Override
    public String getPrice() {
        return PRICE;
    }
}
