package org.ismailcet.facadepatterns;

/**
 * Hello world!
 *
 */
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
