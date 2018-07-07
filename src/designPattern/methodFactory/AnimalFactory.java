package designPattern.methodFactory;

public class AnimalFactory {
    public Pet getPet(String s){
        Pet pet = null;
        if(s.equals("Dog")){

            pet = new Dog();
        }
        if(s.equals("Cat")){
            pet = new Cat();
        }
        return pet;
    }
}
