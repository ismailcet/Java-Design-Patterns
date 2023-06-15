package org.ismailcet.facadepatterns;

public class CarFacade {
    private Engine engine = new Engine();
    private Lights lights = new Lights();


    public void startCar(){
        engine.on();
        lights.on();
    }

    public void stopCar(){
        engine.off();
        lights.off();
    }
}
