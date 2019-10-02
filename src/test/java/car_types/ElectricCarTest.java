package car_types;

import car_components.Door;
import car_components.Engine;
import car_components.Tyre;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    ElectricCar electricCar;
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
        engine = new Engine("electric", 60);
        frontDoor = new Door("front");
        frontDoor2 = new Door("front");
        backDoor = new Door("back");
        backDoor2 = new Door("back");
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
        this.doors.add(backDoor);
        this.doors.add(backDoor2);
        this.doors.add(boot);
        this.tyres.add(frontTyre);
        this.tyres.add(frontTyre2);
        this.tyres.add(backTyre);
        this.tyres.add(backTyre2);
        this.tyres.add(spareTyre);


        electricCar = new ElectricCar("Tesla FastCar", engine, doors, tyres, 5, "Inside Kiwi Green", 49999.95, 200.0);
    }

    @Test
    public void hasMakeModel() {
        assertEquals("Tesla FastCar", electricCar.getMakeModel());
    }

    @Test
    public void hasEngine() {
        assertEquals("electric", electricCar.getEngine().getType());
    }

    @Test
    public void has5doors() {
        assertEquals(5, electricCar.doorCount());
    }

    @Test
    public void has5tyres() {
        assertEquals(5, electricCar.tyreCount());
    }

    @Test
    public void hasMaxDoors() {
        assertEquals(5, electricCar.getMaxDoors());
    }

    @Test
    public void hasColour() {
        assertEquals("Inside Kiwi Green", electricCar.getColour());
    }

    @Test
    public void hasPrice() {
        assertEquals(49999.95, electricCar.getPrice(), 0.0);
    }

    @Test
    public void hasEngineKW() {
        assertEquals(200.0, electricCar.getEngineKW(), 0.0);
    }

}
