package designPattern.methodFactory;

public class MainClass {
    public static void main(String[] args) {
    AnimalFactory ani = new AnimalFactory();
    Pet p = ani.getPet("Cat");
        System.out.println(p.getSound());
    }
}
