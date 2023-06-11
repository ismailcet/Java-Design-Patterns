package org.ismailcet.singletonpatterns;

public class SingletonExampleEagerInitialization {

    private static SingletonExampleEagerInitialization instance = new SingletonExampleEagerInitialization();

    private SingletonExampleEagerInitialization(){}

    public static SingletonExampleEagerInitialization getInstance(){
        return instance;
    }

}
