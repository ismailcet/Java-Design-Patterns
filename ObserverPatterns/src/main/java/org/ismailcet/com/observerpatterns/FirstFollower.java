package org.ismailcet.com.observerpatterns;

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
