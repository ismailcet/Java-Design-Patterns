package org.ismailcet.adapterpatterns;

public class BirdAdaptor implements ToyDuck{

    Bird bird;

    public BirdAdaptor(Bird bird) {
        this.bird = bird;
    }

    public void squeak() {
        bird.makeSound();
    }
}
