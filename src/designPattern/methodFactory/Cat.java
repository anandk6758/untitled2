package designPattern.methodFactory;

public class Cat implements Pet {
    @Override
    public String getSound() {
        return "meow";
    }
}
