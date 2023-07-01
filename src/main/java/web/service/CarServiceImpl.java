package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
public class CarServiceImpl implements CarService {
    private List<Car> carsList;

    public CarServiceImpl() {
    }

    public void setCars(List<Car> cars) {
        this.carsList = cars;
    }

    @Override
    public List<Car> getCars() {
        return carsList;
    }
}
