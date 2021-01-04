package ua.com.alevel.service;

import ua.com.alevel.model.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iehor Funtusov, created 04/01/2021 - 8:59 PM
 */
public class CarService {

    public void init() {
        List<AbstractCar> cars = new ArrayList<>();
        cars.add(new Nissan());
        cars.add(new Toyota());
        cars.add(new RollsRoyce());
        cars.add(new Jaguar());
        cars.add(getCar());
        cars.forEach(abstractCar -> {
            abstractCar.drive();
            abstractCar.remont();
            abstractCar.defaultDrive();
            if (abstractCar instanceof Toyota) {
                Toyota toyota = (Toyota) abstractCar;
                toyota.drive("Camry");
            }
            if (abstractCar.getClass().isAssignableFrom(Toyota.class)) {
                Toyota toyota = (Toyota) abstractCar;
                toyota.drive("Corolla");
            }
        });
    }

    private AbstractCar getCar() {
        return new AbstractCar() {
            @Override
            public void drive() {
                System.out.println("Ukraine.drive");
            }

            @Override
            public void remont() {
                System.out.println("Ukraine.remont");
            }
        };
    }
}
