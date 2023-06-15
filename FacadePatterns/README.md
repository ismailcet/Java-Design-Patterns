# Facade Pattern

## Explanation

---

> Facade patterns hides the complexities of the system and provides an interface to the client using 
> which the client can access the system.This type of design patterns comes under structural pattern as
> this pattern adds an interface to existing system to hide its complexities.


## Programmatic Example

Firstly, We create Lights and Engine class type for Car.
```java
public class Engine {
    public void on(){
        System.out.println("Engine Started");
    }
    public void off(){
        System.out.println("Engine Stopped");
    }
}

public class Lights {
    public void on(){
        System.out.println("Lights Started");
    }
    public void off(){
        System.out.println("Lights Stopped");
    }
}
```
And we create a facade class.
```java
public class CarFacade {
    private Engine engine = new Engine();
    private Lights lights = new Lights();


    public void startCar(){
        engine.on();
        lights.on();
    }

    public void stopCar(){
        engine.off();
        lights.off();
    }
}
```

We use tha facade to start car
```java
public class FacadePatternsDemo
{
    public static void main( String[] args ) {
        CarFacade car = new CarFacade();
        System.out.println("Car Started\n");
        car.startCar();
        System.out.println("\nCar Stopped \n");
        car.stopCar();
    }
}
```