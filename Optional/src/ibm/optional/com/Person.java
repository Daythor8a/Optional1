package ibm.optional.com;

import java.util.Optional;

public class Person {
    private Car car;
    private int age;

    public Optional <Car> getCar(){
        return Optional.ofNullable(car);
    }
    public void setCar(Car car){
        this.car=car;
    }

    public int getAge(){
        return age;
    }
}
