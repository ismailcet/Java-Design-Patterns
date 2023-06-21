package org.ismailcet.com.observerpatterns;

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
