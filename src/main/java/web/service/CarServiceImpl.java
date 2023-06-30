package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    private List<Car> cars = new ArrayList<>();;

    public CarServiceImpl() {
        cars.add(new Car("X7LLSRB1HAH548712", "Renault Duster", 2018));
        cars.add(new Car("Y7LLSRB1HAH548713", "Chery QQ", 2016));
        cars.add(new Car("Z7LLSRB1HAH548714", "Suzuki Jimny", 1998));
        cars.add(new Car("A7LLSRB1HAH548715", "BMW X6", 2000));
        cars.add(new Car("B7LLSRB1HAH548716", "Tesla Model X", 2023));
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }
}
