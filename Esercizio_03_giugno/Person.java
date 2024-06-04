import Annotazioni.DeprecatedCustom;
import Annotazioni.Info;

@Info(author="Elisabetta", version="2")
public class Person {
    private String name;
    private double age;
    
    public Person(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @DeprecatedCustom(messaggio= "Metodo deprecato")
    public double getAge() {
        return age;
    }


    public String setInfo() {
        return  "Person {"
                + "Name: " + name
                + ", Age: " + age
                +  '}';  
    }

    
}
