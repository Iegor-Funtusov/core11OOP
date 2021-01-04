package ua.com.alevel.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Iehor Funtusov, created 04/01/2021 - 8:52 PM
 */

@Getter
@Setter
public abstract class AbstractCar implements CarDriver, CarRemont {

    private String name;
}
