package designPattern.builderPattern;

public class ConcreteProductCar implements AbstractProductCar{

    private String base;
    private String interior;
    private String color;
    private String engine;

    @Override
    public void setBase(String base) {
    this.base = base;
    }

    @Override
    public void setInterior(String interior) {
    this.interior = interior;
    }

    @Override
    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public void setEngine(String engine) {
    this.engine = engine;
    }

    public String getBase() {
        return this.base;
    }

    public String getInterior() {
        return this.interior;
    }

    public String getColor() {
        return this.color;
    }

    public String getEngine() {
        return this.engine;
    }
}
