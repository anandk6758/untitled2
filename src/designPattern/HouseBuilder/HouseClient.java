package designPattern.HouseBuilder;

public class HouseClient {

    public static void main(String[] args) {
        HouseDirector d = new HouseDirector();
        HouseBuilder woodBuilder = new WoodBuilder();
        House woodHouse = d.constructHouse(woodBuilder);
        System.out.println(woodHouse.getRepresentation());
        HouseBuilder brickBuilder = new WoodBuilder();
        House brickHouse = d.constructHouse(brickBuilder);
        System.out.println(brickHouse.getRepresentation());
    }

}
