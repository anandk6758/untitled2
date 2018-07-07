package designPattern.HouseBuilder;

public class WoodBuilder extends HouseBuilder{
    @Override
    public House createHouse() {
        return new WoodeHouse();
    }

    @Override
    public Floor createFloor() {
        return new WoodFloor();
    }

    @Override
    public Roof createRoof() {
        return new WoodenRoof();
    }

    @Override
    public Walls createWalls() {
        return new WoodenWalls();
    }
}
