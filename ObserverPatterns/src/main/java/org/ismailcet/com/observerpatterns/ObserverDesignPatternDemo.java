package org.ismailcet.com.observerpatterns;

/**
 * Hello world!
 *
 */
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
