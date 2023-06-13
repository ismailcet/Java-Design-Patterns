package org.ismailcet.abstractfactorypatterns.implementation;

public class BmwCar implements Car{
    static final String PRICE = "10000000";
    @Override
    public String getPrice() {
        return PRICE;
    }
}
