package designPattern.HouseBuilder;

public abstract class HouseBuilder {
    public House house;
    public Floor floor;
    public Walls walls;
    public Roof roof;

    public abstract House createHouse();
    public abstract Floor createFloor();
    public abstract Roof createRoof();
    public abstract Walls createWalls();
}
