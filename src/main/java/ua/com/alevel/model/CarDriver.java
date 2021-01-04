package ua.com.alevel.model;

/**
 * @author Iehor Funtusov, created 04/01/2021 - 8:56 PM
 */

public interface CarDriver {

    void drive();

    default void defaultDrive() {
        System.out.println("CarDriver.defaultDrive");
    }
}
