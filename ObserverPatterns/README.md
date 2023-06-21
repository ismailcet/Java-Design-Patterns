# Observer Pattern

## Explanation

---

> Observer Pattern is one of the behavioral design pattern. Observer design pattern is useful when you are interested in
> the state of an object and want to get notified whenever there is any change. In observer pattern, the object that watch 
> on the state of another object are called Observer and the object that is being watched is called Subject.


## Programmatic Example

First of all, Create Subject Class
```java
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private String topic;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
        notifyAllObservers();
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update();
        }
    }
}
```

Now, we create Observer interface
```java
public interface Observer {
    public void update();
}
```
And Create concrete observer classes
```java
public class FirstFollower implements Observer{
    private Subject subject;
    public FirstFollower(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Topic is updated !This msg for FirstFollower ");
    }
}

```
```java

public class SecondFollower implements Observer{
    private Subject subject;
    public SecondFollower(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Topic is updated !This msg for SecondFollower ");
    }
}
```
```java
public class ThirdFollower implements Observer{
    private Subject subject;
    public ThirdFollower(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Topic is updated !This msg for ThirdFollower ");
    }
}
```

Let`s try in main method
```java
public class ObserverDesignPatternDemo {
    public static void main( String[] args ) {
        Subject subject = new Subject();

        new FirstFollower(subject);
        new SecondFollower(subject);
        new ThirdFollower(subject);

        System.out.println("First Updated =>");
        subject.setTopic("Topic is changed ! ");

        System.out.println("Second Updated =>");
        subject.setTopic("Topic is twice changed ! ");
    }
}
```

The Console Output
```
First Updated =>
Topic is updated !This msg for FirstFollower 
Topic is updated !This msg for SecondFollower 
Topic is updated !This msg for ThirdFollower 
Second Updated =>
Topic is updated !This msg for FirstFollower 
Topic is updated !This msg for SecondFollower 
Topic is updated !This msg for ThirdFollower 
```