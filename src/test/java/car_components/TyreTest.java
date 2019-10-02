package car_components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Dunlop", 15.5);
    }

    @Test
    public void hasMake() {
        assertEquals("Dunlop", tyre.getMake());
    }

    @Test
    public void hasSize() {
        assertEquals(15.5, tyre.getSize(), 0.0);
    }
}
