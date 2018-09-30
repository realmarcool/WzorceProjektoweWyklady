package com.company.Budowniczy;

public abstract class CarBuilder {
    protected String carName;

    public CarBuilder setCarName(String carName){
        this.carName = carName;
        return this;
    }
    public abstract Car build();
}
