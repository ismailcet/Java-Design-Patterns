# Command Pattern

## Explanation

---

> Command pattern is a data driven design pattern and falls under behavioral pattern category. A request is wrapped 
> under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can 
> handle this command and passes the command to the corresponding object which executes the command.


## Programming Example
Create a command interface.
```java
public interface Order {
    void execute();
}
```
Create a request class.
```java
public class Stock {
    
    private String name ="ABC";
    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+" Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+" Quantity: " + quantity +" ] sold");
    }
    
}
```

Create concrete classes implementing the Order interface.
```java
public class SellStock implements Order{
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }
    public void execute(){
        stock.sell();
    }
}
```
```java
public class BuyStock implements Order{
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }
    public void execute(){
        stock.buy();
    }
}
```

Create command invoker class.
```java
public class Broker {

    private List<Order>orderList = new ArrayList<Order>();
    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
```

The test in main
```java
public class CommandPatternsDemo
{
    public static void main( String[] args )
    {
        Stock stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
```

The Console Output
```
Stock [ Name: ABC Quantity: 10 ] bought
Stock [ Name: ABC Quantity: 10 ] sold
```