package org.ismailcet.com.strategypatterns;

/**
 * Hello world!
 *
 */
public class StrategyPatternDemo
{
    public static void main( String[] args )
    {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("1234", 25);
        Item item2 = new Item("4321", 54);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.pay(new PaypalStrategy("ismailcet3@gmail.com","deneme"));

        shoppingCart.pay(new CreditCartStrategy("name", "cardNumber", "123", "Ocak"));
    }
}
