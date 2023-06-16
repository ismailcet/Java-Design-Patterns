package org.ismailcet.bridgepatterns;

/**
 * Hello world!
 *
 */
public class BridgePatternsDemo
{
    public static void main( String[] args ) {

        System.out.println("Square =>");
        Shape square = new Square(new Red());
        Shape square2 = new Square(new Blue());
        square.draw();
        square2.draw();

        System.out.println("Triangle =>");
        Shape triangle = new Triangle(new Red());
        Shape triangle2 = new Triangle(new Blue());
        triangle.draw();
        triangle2.draw();
    }
}
