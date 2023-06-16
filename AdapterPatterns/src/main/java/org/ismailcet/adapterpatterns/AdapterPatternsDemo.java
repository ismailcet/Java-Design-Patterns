package org.ismailcet.adapterpatterns;

/**
 * Hello world!
 *
 */
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
