# Decorator Pattern

## Explanation

---

> Decorator pattern allows us to add a new functionality to existing objects without changing its structure at all.
> Simply, it allows to do runtime modification to te objects

## Programmatic Example

Creating an interface named 'Shape'
```java
public interface Shape {
    void draw();
}
```

Create concrete classes implementing the same interface. Rectangle.java and Circle.java are as follows
```java

public class Rectangle implements Shape{
    public void draw() {
        System.out.println("Shape : Rectangle");
    }
}
s
public class Circle implements Shape{
    public void draw() {
        System.out.println("Shape : Circle");
    }
}

```
Create an abstract decorator class implementing the Shape interface.
```java

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        setRedBorder(decoratorShape);
    }

    private void setRedBorder(Shape decoratorShape){
        System.out.println("Border Color : Red");
    }
}

```
Using the RedShapeDecorator to decorate Shape objects.
```java

public class DecoratorPatternsDemo
{
    public static void main( String[] args ) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal circle");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}

```