package ua.com.alevel.model;

/**
 * @author Iehor Funtusov, created 04/01/2021 - 8:56 PM
 */
public class RollsRoyce extends BritishCar {
    @Override
    public void drive() {
        System.out.println("RollceRoys.drive");
    }

    @Override
    public void remont() {
        System.out.println("RollceRoys.remont");
    }
}
