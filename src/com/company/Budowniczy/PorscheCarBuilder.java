package com.company.Budowniczy;

public class PorscheCarBuilder extends CarBuilder {
    private CarType carType;
    private CarModel carModel = CarModel.PORSCHE;

    public CarBuilder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }
    public CarBuilder setCarModel(CarModel carModel) {
        this.carModel = carModel;
        return this;
    }

    @Override
    public Car build() {
        return new Car(carName, carModel, carType);
    }
}
