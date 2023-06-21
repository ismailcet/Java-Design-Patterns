# Strategy Pattern


## Explanation

---

> Strategy design pattern is one of the behavioral design pattern.
> Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.


## Programming Example
First of all we will create the interface PaymentStrategy
```java
public interface PaymentStrategy {
    
    public void pay(int amount);
    
}
```

Now we will have to create concrete implementation for payment using Credit/debit card or paypal
```java
public class CreditCartStrategy implements PaymentStrategy{
    
    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCartStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with Credit/Debit card");
    }
    
}
```

```java
public class PaypalStrategy implements PaymentStrategy{
    
    private String email;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(int amount) {
        System.out.println(amount + " paid with PayPal !");
    }
    
}
```
We can implement Shopping Cart and Item
```java
public class Item {
    
    private String code;
    private int price;

    public Item(String code, int price) {
        this.code = code;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public int getPrice() {
        return price;
    }
    
}
```
```java
public class ShoppingCart {

    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
        items.remove(item);
    }
    public int calculateTotal(){
        int sum = 0;
        for(Item item:items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(calculateTotal());
    }

}
```
And Test section
```java
public class StrategyPatternDemo {
    
    public static void main( String[] args ) {
        
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("1234", 25);
        Item item2 = new Item("4321", 54);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PaypalStrategy("ismailcet3@gmail.com","deneme"));

        shoppingCart.pay(new CreditCartStrategy("name", "cardNumber", "123", "Ocak"));
    
    }
}
```
The Console Output
```
79 paid with PayPal !
79 paid with Credit/Debit card
```
