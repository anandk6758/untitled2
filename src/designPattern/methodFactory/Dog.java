package designPattern.methodFactory;

public class Dog implements Pet {
    @Override
    public String getSound(){
        return "Bow";
    }
}
