package car_components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine("petrol",45);
    }

    @Test
    public void hasType() {
        assertEquals("petrol", engine.getType());
    }

    @Test
    public void hasHorsePower() {
        assertEquals(45, engine.getHorsePower());
    }

}


