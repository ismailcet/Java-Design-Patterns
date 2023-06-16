# Bridge Pattern

## Explanation

---

> Decouple an abstraction from its implementation so that the two can vary independently. 


## Programmatic Example

We create a Color interface and implement a red and blue color.
```java

public interface Color {
    String fill();
}

public class Red implements Color{
    public String fill() {
        return "Color is Red ! ";
    }
}

public class Blue implements Color{
    public String fill() {
        return "Color is Blue ! ";
    }
}

```

And Shape abstract class and two extends type of shape ; Triangle and Square

```java

public abstract class Shape {
    protected  Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void draw();
}

public class Square extends Shape{

    public Square(Color color) {
        super(color);
    }

    public void draw() {
        System.out.println("Square drawn" + color.fill());
    }
}

public class Triangle extends Shape{

    public Triangle(Color color) {
        super(color);
    }

    public void draw() {
        System.out.println("Square drawn" + color.fill());
    }
}

```

And test in main function
```java
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
```

The Console Output

```
Square =>
Square drawnColor is Red ! 
Square drawnColor is Blue ! 
Triangle =>
Square drawnColor is Red ! 
Square drawnColor is Blue !
```