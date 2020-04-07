package ibm.optional.com;

import java.util.Optional;

public class Insurance {

    private String name;
    private Service service;

    public String getName(){
        return name;
    }
    /*
    public void setCar(Car car){
        this.name=name;
    }
    */
    public Optional<Service> getService(){
        return Optional.ofNullable(service);
    }

}
