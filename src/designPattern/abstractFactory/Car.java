package designPattern.abstractFactory;

abstract class Car {
    public abstract Parts getTyre();
    public abstract Parts getWheels();
    public abstract Parts getEngine();
    public abstract Parts getDesign();

}
