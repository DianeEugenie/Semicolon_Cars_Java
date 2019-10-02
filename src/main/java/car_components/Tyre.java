package car_components;

public class Tyre {

    private String make;
    private double size;

    public Tyre(String make, double size){
        this.make = make;
        this.size = size;
    }

    public String getMake() {
        return make;
    }

    public double getSize() {
        return size;
    }
}
