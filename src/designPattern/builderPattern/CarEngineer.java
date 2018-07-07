package designPattern.builderPattern;

public class CarEngineer {
    ConcreteCarBuilder car = new ConcreteCarBuilder();

    public ConcreteProductCar getCar(){
        return this.car.gatCar();
    }

    public void buildCar(){
        this.car.buidInterior();
        this.car.buildBase();
        this.car.buildColor();
        this.car.buildEngine();
    }



}
