package org.ismailcet.abstractfactorypatterns.implementation;

public class BmwMotorcycle implements Motorcycle{
    static final String PRICE = "10000";
    @Override
    public String getPrice() {
        return PRICE;
    }
}
