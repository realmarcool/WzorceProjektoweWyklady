package com.company.Budowniczy;

public class Car {
    private String name;
    private CarModel carModel;
    private CarType carType;

    public Car(String name, CarModel carModel, CarType carType) {
        this.name = name;
        this.carModel = carModel;
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carModel=" + carModel +
                ", carType=" + carType +
                '}';
    }
}
