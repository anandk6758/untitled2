package designPattern.abstractFactory;

public class Parts {

    public String instance;

    public Parts(String s){

        instance = s;
    }

    public String getSpec(){
        return instance;
    }
}
