package dealership;

import car_components.Door;
import car_components.Engine;
import car_components.Tyre;
import car_types.Car;
import car_types.ElectricCar;
import car_types.FuelCar;
import car_types.HybridCar;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;

    ElectricCar electricCar;
    FuelCar fuelCar;
    HybridCar hybridCar;

    Engine electricEngine;
    Engine fuelEngine;
    Engine hybridEngine;
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

    ArrayList<Car> cars;
    Dealer dealer;
    Till till;
    Customer customer;

    @Before
    public void before(){

        electricEngine = new Engine("electric", 60);
        fuelEngine = new Engine("fuel", 60);
        hybridEngine = new Engine("hybrid", 60);

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

        electricCar = new ElectricCar("Tesla FastCar", electricEngine, doors, tyres, 5, "Inside Kiwi Green", 49999.95, 200.0);
        hybridCar = new HybridCar("Tesla MiniCar", hybridEngine, doors, tyres, 5, "Bubblegum Pink", 69999.95, 100.0, 1.5);
        fuelCar = new FuelCar("VW Golf", fuelEngine, doors, tyres, 5, "Sunshine yellow", 25000.50, 2.0);


        dealer = new Dealer("Sir Walter Sellsman");
        till = new Till(50000.00);
        customer = new Customer("Jessy Buyman", 70000.00);

        dealership = new Dealership("SemiColon Cars", dealer, till);

    }


    @Test
    public void hasName() {
        assertEquals("SemiColon Cars", dealership.getName());
    }

    @Test
    public void hasDealer() {
        assertEquals("Sir Walter Sellsman", dealership.getDealer().getName());
    }

    @Test
    public void hasTill(){
        assertEquals(50000.00, dealership.getTill().getFunds(), 0.0);
    }

    @Test
    public void hasNoCars() {
        assertEquals(0, dealership.carCount());
    }

    @Test
    public void canAddCarsToStock() {
        dealership.addCar(hybridCar);
        assertEquals(1, dealership.carCount());
    }

    @Test
    public void canRemoveCar() {
        dealership.addCar(electricCar);
        dealership.removeCar(electricCar);
        assertEquals(0, dealership.carCount());
    }

    @Test
    public void canSellCarToCustomer() {
        dealership.addCar(fuelCar);
        dealership.addCar(electricCar);

        dealership.sellCar(fuelCar, customer);
        assertEquals(1, dealership.carCount());
        assertEquals(44999.50, customer.getFunds(), 0.0);
        assertEquals(75000.50, dealership.getTill().getFunds(), 0.0);
    }

    @Test
    public void canBuyACar() {
        dealership.buyCar(fuelCar);

        assertEquals(1, dealership.carCount());
        assertEquals(29999.50, dealership.getTill().getFunds(), 0.0);
    }
}
