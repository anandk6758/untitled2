package designPattern.abstractFactory;

public class ClientClass {
    public static void main(String[] args) {
        ClientClass c = new ClientClass();
        Car cr = c.getType("BenQ");
        System.out.println(cr.getDesign().getSpec());

    }

    public Car getType(String s) {
        Car car = null;
        if (s.equals("BenQ")) {
            car = new BenQ();
        }
        return car;
    }
}
