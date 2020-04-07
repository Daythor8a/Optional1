package ibm.optional.com;

import java.util.Optional;

public class Car {

    private Insurance insurance;
    public Optional <Insurance> getInsurance(){
        return Optional.ofNullable(insurance);
    }
    public void setInsurance(Insurance insurance){
        this.insurance=insurance;
    }
}
