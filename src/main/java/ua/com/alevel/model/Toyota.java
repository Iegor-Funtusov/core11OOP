package ua.com.alevel.model;

/**
 * @author Iehor Funtusov, created 04/01/2021 - 8:54 PM
 */
public class Toyota extends JapanCar {

    private String some = "some global";
    private static String strings;

    private Integer integer;
    private int i;

    static {
        strings = "";
    }

    @Override
    public void drive() {
        String some = "some local";
        System.out.println("some local = " + some);
        System.out.println("some global = " + this.some);
        System.out.println("Toyota.drive");
        this.remont();
        System.out.println("integer = " + integer);
        System.out.println("i = " + i);
    }

    public void drive(String name) {
        super.setName(name);
        System.out.println("name = " + super.getName());
        test();
    }

    @Override
    public void remont() {
        System.out.println("Toyota.remont");
    }

    public static void test() {
        System.out.println("Toyota.test");
    }
}
