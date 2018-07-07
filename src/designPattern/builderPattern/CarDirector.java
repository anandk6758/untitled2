package designPattern.builderPattern;

public class CarDirector {

public static void main(String[] args) {
CarEngineer engineer = new CarEngineer();
engineer.buildCar();
    System.out.println(engineer.getCar().getBase());
    System.out.println(engineer.getCar().getColor());
    System.out.println(engineer.getCar().getEngine());
    System.out.println(engineer.getCar().getInterior());
}




}
