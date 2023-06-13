package org.ismailcet.abstractfactorypatterns.implementation;

public interface AbstractFactory <T>{
    T create(String type);
}
