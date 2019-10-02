package car_types;

import car_components.Door;
import car_components.Engine;
import car_components.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;
    Engine engine;
    Door frontDoor;
    Door frontDoor2;
    Door backDoor;
    Door backDoor2;
    Door boot;
    ArrayList<Door> doors;
    Tyre frontTyre;
    Tyre frontTyre2;
    Tyre backTyre;
    Tyre backTyre2;
    Tyre spareTyre;
    ArrayList<Tyre> tyres;

    @Before
    public void before(){
        engine = new Engine("electric/fuel", 60);
        frontDoor = new Door("front");
        frontDoor2 = new Door("front");
        boot = new Door("boot");
        frontTyre = new Tyre("Dunlop", 15.5);
        frontTyre2 = new Tyre("Dunlop", 15.5);
        backTyre = new Tyre("Dunlop", 15.5);
        backTyre2 = new Tyre("Dunlop", 15.5);
        spareTyre = new Tyre("Dunlop", 15.5);
        doors = new ArrayList<Door>();
        tyres = new ArrayList<Tyre>();
        this.doors.add(frontDoor);
        this.doors.add(frontDoor2);
        this.doors.add(boot);
        this.tyres.add(frontTyre);
        this.tyres.add(frontTyre2);
        this.tyres.add(backTyre);
        this.tyres.add(backTyre2);
        this.tyres.add(spareTyre);


        hybridCar = new HybridCar("Tesla MiniCar", engine, doors, tyres, 3, "Bubblegum Pink", 69999.95, 100.0, 1.5);
    }

    @Test
    public void hasMakeModel() {
        assertEquals("Tesla MiniCar", hybridCar.getMakeModel());
    }

    @Test
    public void hasEngine() {
        assertEquals("electric/fuel", hybridCar.getEngine().getType());
    }

    @Test
    public void has5doors() {
        assertEquals(3, hybridCar.doorCount());
    }

    @Test
    public void has5tyres() {
        assertEquals(5, hybridCar.tyreCount());
    }

    @Test
    public void hasMaxDoors() {
        assertEquals(3, hybridCar.getMaxDoors());
    }

    @Test
    public void hasColour() {
        assertEquals("Bubblegum Pink", hybridCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(69999.95, hybridCar.getPrice(), 0.0);
    }

    @Test
    public void hasEngineKW() {
        assertEquals(100.0, hybridCar.getEngineKW(), 0.0);
    }

    @Test
    public void hasEngineSize() {
        assertEquals(1.5, hybridCar.getEngineSize(), 0.0);
    }

}
