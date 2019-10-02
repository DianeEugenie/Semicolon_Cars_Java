package car_types;

import car_components.Door;
import car_components.Engine;
import car_components.Tyre;

import java.util.ArrayList;

public class HybridCar extends Car{

    private double engineKW;
    private double engineSize;

    public HybridCar(String makeModel, Engine engine, ArrayList<Door> doors, ArrayList<Tyre> tyres, int maxDoors, String colour, double price, double engineKW, double engineSize) {
        super(makeModel, engine, doors, tyres, maxDoors, colour, price);
        this.engineKW = engineKW;
        this.engineSize = engineSize;

    }

    public double getEngineKW() {
        return engineKW;
    }

    public double getEngineSize() {
        return engineSize;
    }
}
