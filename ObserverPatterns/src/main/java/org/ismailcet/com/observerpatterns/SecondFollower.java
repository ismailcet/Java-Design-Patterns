package org.ismailcet.com.observerpatterns;

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
