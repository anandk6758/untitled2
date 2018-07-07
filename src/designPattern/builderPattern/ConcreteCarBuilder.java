package designPattern.builderPattern;

public class ConcreteCarBuilder implements AbstractCarBuilder{
ConcreteProductCar car = null;

public ConcreteCarBuilder(){
    this.car = new ConcreteProductCar();
}

    @Override
    public void buildBase() {
        this.car.setBase("low cost base");
    }

    @Override
    public void buidInterior() {
        this.car.setColor("low cost color");
    }

    @Override
    public void buildColor() {
        this.car.setInterior("low cost interior");

    }

    @Override
    public void buildEngine() {

        this.car.setEngine("Low cost engine");

    }

    public ConcreteProductCar gatCar() {

        return this.car;
    }


}
