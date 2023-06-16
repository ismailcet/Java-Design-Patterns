# Adapter Patterns


## Explanation

---

> The adapter pattern convert the interface of a class into another interface clients expect.
> Adapter lets classes work together that could not otherwise because of incompatible interfaces.

## Programmatic Example

Firstly, We create a bird interface and create Sparrow using implements it.
```java

public interface Bird {
    public void fly();
    public void makeSound();
}

public class Sparrow implements Bird {
    public void fly() {
        System.out.println("Flying ! ");
    }

    public void makeSound() {
        System.out.println("Chirp Chirp ");
    }
}
```
And We create ToyDuck and create a PlasticToyDuck using implements it

```java
public interface ToyDuck {
    public void squeak();
}

public class PlasticToyDuck implements ToyDuck{
    public void squeak() {
        System.out.println("Squeak ! ");
    }
}
```

Lastly , we create a BirdAdaptor for using two interface together.

```java
public class BirdAdaptor implements ToyDuck{

    Bird bird;

    public BirdAdaptor(Bird bird) {
        this.bird = bird;
    }

    public void squeak() {
        bird.makeSound();
    }
}

```
Test in main method
```java
public class AdapterPatternsDemo
{
    public static void main( String[] args ) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticToyDuck();

        ToyDuck birdAdaptor = new BirdAdaptor(sparrow);

        System.out.println("Sparrow ...");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck");
        toyDuck.squeak();

        System.out.println("BirdAdaptor");
        birdAdaptor.squeak();
    }
}
```

The Console Output
```
Sparrow ...
Flying ! 
Chirp Chirp 
ToyDuck
Squeak ! 
BirdAdaptor
Chirp Chirp 
```