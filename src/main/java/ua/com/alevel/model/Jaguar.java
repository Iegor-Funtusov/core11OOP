package ua.com.alevel.model;

/**
 * @author Iehor Funtusov, created 04/01/2021 - 8:55 PM
 */
public class Jaguar extends BritishCar {

    @Override
    public void drive() {
        System.out.println("Jaguar.drive");
    }

    @Override
    public void remont() {
        System.out.println("Jaguar.remont");
    }
}
