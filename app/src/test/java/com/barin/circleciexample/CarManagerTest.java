package com.barin.circleciexample;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class CarManagerTest {

  private CarManager carManager;

  @Before public void setUp() {
    carManager = new CarManager();
  }

  @Test public void addCar() throws Exception {
    carManager.addCar(new Car());
    assertTrue(carManager.getCars().size() == 1);
  }
}