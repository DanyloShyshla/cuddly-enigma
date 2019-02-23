package ua.lviv.iot;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.models.*;

import java.lang.reflect.GenericArrayType;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBabyShop {

    public static final int TEST_INT = 1;

    @Test
    void ThermometerTest() {
        Thermometer thermometerObject = new Thermometer();
        thermometerObject.setColor("Red");
        assertEquals("Red", thermometerObject.getColor());
    }

}