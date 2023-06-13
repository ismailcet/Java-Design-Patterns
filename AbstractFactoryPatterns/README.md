# Abstract Factory Pattern

## Explanation

---

> Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

## Programmatic Example

Firstly , we`ll create family of Car and Motorcycle.
Car Interface and Motorcycle Interface
```java
public interface Car {
    String getPrice();
}

public interface Motorcycle {
    String getPrice();
}
```
A concrete implementation BMW and AUDI cars and motorcycles.
```java
public class BmwCar implements Car{
    static final String PRICE = "10000000";
    @Override
    public String getPrice() {
        return PRICE;
    }
}

public class AudiCar implements Car{

    static final String PRICE = "20000000";
    @Override
    public String getPrice() {
        return PRICE;
    }
}
```
```java
public class BmwMotorcycle implements Motorcycle{
    static final String PRICE = "10000";
    @Override
    public String getPrice() {
        return PRICE;
    }
}

public class AudiMotorcycle implements Motorcycle{
    static final String PRICE = "20000";
    @Override
    public String getPrice() {
        return PRICE;
    }
}
```
We create an AbstractFactory interface for them
```java
public interface AbstractFactory <T>{
    T create(String type);
}
```
We implement an CarFactory and MotorcycleFactory using Factory Method Design Pattern
```java
public class CarFactory implements AbstractFactory<Car>{
    @Override
    public Car create(String type) {
        if("BMW".equalsIgnoreCase(type)){
            return new BmwCar();
        } else if ("AUDI".equalsIgnoreCase(type)) {
            return new AudiCar();
        }
        return null;
    }
}

public class MotorcycleFactory implements AbstractFactory<Motorcycle>{
    @Override
    public Motorcycle create(String type) {
        if("BMW".equalsIgnoreCase(type)){
            return new BmwMotorcycle();
        } else if ("AUDI".equalsIgnoreCase(type)) {
            return new AudiMotorcycle();
        }
        return null;
    }
}
```

We create a FactoryProvider class will provider us implementation CarFactory and MotorcycleFactory.

```java
public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        if("Car".equalsIgnoreCase(choice)){
            return new CarFactory();
        }
        else if("Motorcycle".equalsIgnoreCase(choice)){
            return new MotorcycleFactory();
        }

        return null;
    }
}
```

And create test input
```java
public static void main(String[] args) {
        AbstractFactory<Car> car = FactoryProvider.getFactory("Car");
        AbstractFactory<Motorcycle> motorcycle = FactoryProvider.getFactory("motorcycle");

        Car bmw = car.create("BMW");
        Motorcycle motorBmw = motorcycle.create("BMW");

        System.out.println("Car BMW " + bmw.getPrice());
        System.out.println("Motor BMW " + motorBmw.getPrice());

        Car audi = car.create("AUDI");
        Motorcycle motorAudi = motorcycle.create("AUDI");

        System.out.println("Car AUDI " + audi.getPrice());
        System.out.println("Motor AUDI " + motorAudi.getPrice());
}
```

The Console Output
```
Car BMW 10000000
Motor BMW 10000
Car AUDI 20000000
Motor AUDI 20000
```
