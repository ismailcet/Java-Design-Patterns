# Factory Method Pattern

## Explanation

---

> Define an interface for creating a object, but let subclasses decide which class to instantiate. Factory method lets
> a class defer instantiation to subclasses.


## Programmatic Example
We have an interface Coin and two implementations GoldCoin and CopperCoin.
```java
public interface Coin {
    String description();
}

public class GoldCoin implements Coin {
    static final String DESCRIPTION  = "This is a gold coin ! ";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}

public class CopperCoin implements Coin{
    static final String DESCRIPTION = "This is a copper coin ! ";
    @Override
    public String description() {
        return DESCRIPTION;
    }
}
```

We create a factory class CoinFactory.java to instantiate implementations.

```java
public class CoinFactory {
    public  Coin getCoin(String coin){
        if (coin == "gold") {
            return new GoldCoin();
        } else if (coin == "copper") {
            return new CopperCoin();
        }else{
            return null;
        }
    }
}
```

Now Let`s use factory class to create and get object of implementations class by passing some informations.
```java
public class GenerateCoin
{
    public static void main( String[] args ) {

        CoinFactory coin1 = new CoinFactory();
        Coin goldCoin = coin1.getCoin("gold");
        System.out.println(goldCoin.description());

        Coin copperCoin = coin1.getCoin("copper");
        System.out.println(copperCoin.description());
    }
}
```

The Console Output
```
This is a gold coin ! 
This is a copper coin ! 
```