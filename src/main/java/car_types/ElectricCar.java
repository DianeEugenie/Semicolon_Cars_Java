package car_types;

import car_components.Door;
import car_components.Engine;
import car_components.Tyre;

import java.util.ArrayList;

public class ElectricCar extends Car{

    private double engineKW;

    public ElectricCar(String makeModel, Engine engine, ArrayList<Door> doors, ArrayList<Tyre> tyres, int maxDoors, String colour, double price, double engineKW) {
        super(makeModel, engine, doors, tyres, maxDoors, colour, price);
        this.engineKW = engineKW;

    }

    public double getEngineKW() {
        return engineKW;
    }
}
