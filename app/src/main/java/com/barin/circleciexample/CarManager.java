package com.barin.circleciexample;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

  List<Car> cars = new ArrayList<>();

  public CarManager() {
  }

  public void addCar(Car car) {
    if (car != null) {
      cars.add(car);
    }
  }

  public List<Car> getCars() {
    return cars;
  }
}
