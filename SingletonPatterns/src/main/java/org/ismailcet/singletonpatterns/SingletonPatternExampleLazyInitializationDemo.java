package org.ismailcet.singletonpatterns;


public class SingletonPatternExampleLazyInitializationDemo
{
    public static void main( String[] args ) {
        //Illegal construct
        //Compile Time Error : The constructor SingletonExampleLazyInitialization() is not visible
        //SingletonExampleLazyInitialization object = new SingletonExampleLazyInitialization()

        //Get the only object available
        SingletonExampleLazyInitialization singletonExampleLazyInitialization1 = SingletonExampleLazyInitialization.getInstance();
        //Get the only object available
        SingletonExampleLazyInitialization singletonExampleLazyInitialization2 = SingletonExampleLazyInitialization.getInstance();

        System.out.println("singletonExampleLazyInitialization 1 => " + singletonExampleLazyInitialization1);
        System.out.println("singletonExampleLazyInitialization 2 => " + singletonExampleLazyInitialization2);
        System.out.println(singletonExampleLazyInitialization1 == singletonExampleLazyInitialization2);
    }
}
