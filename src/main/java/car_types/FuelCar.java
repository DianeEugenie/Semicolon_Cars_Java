package car_types;

import car_components.Door;
import car_components.Engine;
import car_components.Tyre;

import java.util.ArrayList;

public class FuelCar extends Car {

    private double engineSize;


    public FuelCar(String makeModel, Engine engine, ArrayList<Door> doors, ArrayList<Tyre> tyres, int maxDoors, String colour, double price, double engineSize) {
        super(makeModel, engine, doors, tyres, maxDoors, colour, price);
        this.engineSize = engineSize;
    }


    public double getEngineSize() {
        return engineSize;
    }
}
