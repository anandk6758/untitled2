package designPattern.abstractFactory;

public class BenQ extends Car {

    @Override
    public Parts getTyre() {
        return new Parts("BenQ tyre");
    }

    @Override
    public Parts getWheels() {
        return new Parts("BenQ wheel");
    }


    @Override
    public Parts getEngine() {
        return new Parts("BenQ engine");
    }

    @Override
    public Parts getDesign() {
        return new Parts("BenQ design");
    }


}
