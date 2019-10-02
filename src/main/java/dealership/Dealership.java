package dealership;

import car_types.Car;
import car_types.ElectricCar;
import car_types.FuelCar;
import car_types.HybridCar;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private Dealer dealer;
    private Till till;
    private ArrayList<Car> cars;
    private ArrayList<Customer> customers;

    public Dealership(String name, Dealer dealer, Till till) {
        this.name = name;
        this.dealer = dealer;
        this.till = till;
        this.cars = new ArrayList<Car>();
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Till getTill() {
        return till;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public int carCount() {
        return this.cars.size();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public Car removeCar(Car car) {
        int index = this.cars.indexOf(car);
        Car removedCar = this.cars.remove(index);
        return removedCar;
    }

    public void sellCar(Car car, Customer customer) {
        if(customer.getFunds() >= car.getPrice()) {
            Car soldCar = this.removeCar(car);
            double carPrice = customer.buyCar(soldCar);
            this.till.setFunds(this.till.getFunds() + carPrice);
        }
    }

    public void buyCar(Car car) {
        if(this.getTill().getFunds() >= (car.getPrice() - 5000)) {
            this.addCar(car);
            this.getTill().setFunds(this.getTill().getFunds() - (car.getPrice() - 5000));
        }
    }
}
