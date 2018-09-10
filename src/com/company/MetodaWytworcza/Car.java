package com.company.MetodaWytworcza;

public abstract class Car {

        protected CarName carName;

        public Car(CarName carName) {
            this.carName = carName;
        }

        public abstract String getDescription();
    }

