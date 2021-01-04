package ua.com.alevel;

import ua.com.alevel.service.CarService;

/**
 * @author Iehor Funtusov, created 04/01/2021 - 8:51 PM
 */
public class Main {

    public static void main(String[] args) {
        CarService service = new CarService();
        service.init();
    }
}
