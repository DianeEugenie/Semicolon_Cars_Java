package car_components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoorTest {

    Door door;

    @Before
    public void before(){
        door = new Door("front");
    }

    @Test
    public void hasType(){
        assertEquals("front", door.getType());
    }
}
