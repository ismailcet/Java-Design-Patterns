# Singleton Pattern


## Explanation

---

> Singleton pattern is one of the simplest design patterns in java. This type of design pattern comes under creational 
> patterns as this pattern provides one of the best ways to create an object.                                          
> This pattern involves a single class which is responsible to create object while making sure that only single object gets created.The class provides a way to access its only objects which can be accessed directly without need to instantiate the object of the class.


```java
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
```

```java
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
```
The Console Output
```
singletonExampleLazyInitialization 1 => org.ismailcet.singletonpatterns.SingletonExampleLazyInitialization@4a574795
singletonExampleLazyInitialization 2 => org.ismailcet.singletonpatterns.SingletonExampleLazyInitialization@4a574795
true
```