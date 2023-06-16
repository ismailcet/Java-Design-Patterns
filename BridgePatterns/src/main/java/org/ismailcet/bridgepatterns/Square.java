package org.ismailcet.bridgepatterns;

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.println("Square drawn" + color.fill());
    }
}
