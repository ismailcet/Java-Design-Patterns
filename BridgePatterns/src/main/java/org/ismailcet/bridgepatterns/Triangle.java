package org.ismailcet.bridgepatterns;

public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.println("Square drawn" + color.fill());
    }
}
