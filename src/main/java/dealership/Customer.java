package dealership;

import car_types.Car;

import java.util.ArrayList;

public class Customer {

    private double funds;
    private String name;
    private ArrayList<Car> cars;

    public Customer(String name, double funds) {
        this.name = name;
        this.funds = funds;
        this.cars = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public double buyCar(Car car) {
        if(this.funds >= car.getPrice()) {
            this.cars.add(car);
            this.funds -= car.getPrice();
            return car.getPrice();
        }
        return 0;
    }
}
