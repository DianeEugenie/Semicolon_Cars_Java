package car_types;

import car_components.Door;
import car_components.Engine;
import car_components.Tyre;

import java.util.ArrayList;

public abstract class Car {

    private String makeModel;
    private Engine engine;
    private ArrayList<Door> doors;
    private ArrayList<Tyre> tyres;
    private int maxDoors;
    private int reqTyres;
    private String colour;
    private double price;

    public Car(String makeModel,
               Engine engine,
               ArrayList<Door> doors,
               ArrayList<Tyre> tyres,
               int maxDoors,
               String colour,
               double price){
        this.makeModel = makeModel;
        this.engine = engine;
        this.doors = doors;
        this.tyres = tyres;
        this.maxDoors = maxDoors;
        this.reqTyres = 5;
        this.colour = colour;
        this.price  = price;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public ArrayList<Door> getDoors() {
        return doors;
    }

    public ArrayList<Tyre> getTyres() {
        return tyres;
    }

    public int getMaxDoors() {
        return maxDoors;
    }

    public int getReqTyres() {
        return reqTyres;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }

    public int doorCount(){
        return this.doors.size();
    }
    public int tyreCount(){
        return this.tyres.size();
    }
}
