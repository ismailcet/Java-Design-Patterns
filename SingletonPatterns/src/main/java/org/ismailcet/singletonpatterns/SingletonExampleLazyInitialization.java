package org.ismailcet.singletonpatterns;

public class SingletonExampleLazyInitialization {

    //create a SingletonExampleLazyInitialization instance
    private static SingletonExampleLazyInitialization instance;

    //make a constructor private so that class not be instantiated
    private SingletonExampleLazyInitialization(){
    }

    //Get the only object available
    public static SingletonExampleLazyInitialization getInstance(){
        if(instance == null){
            //define instance create ab object SingletonExampleLazyInitialization
            instance = new SingletonExampleLazyInitialization();
        }
        return instance;
    }
}
