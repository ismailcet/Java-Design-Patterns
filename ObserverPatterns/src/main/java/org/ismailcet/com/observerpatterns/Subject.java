package org.ismailcet.com.observerpatterns;

import java.util.ArrayList;
import java.util.List;

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
