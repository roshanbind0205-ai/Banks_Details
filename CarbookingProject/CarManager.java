package CarbookingProject;

import java.util.ArrayList;

public class CarManager {

    private ArrayList<Car> cars;
    private int nextId = 1;

    public CarManager() {
        cars = CarStorage.loadCars();
        if (!cars.isEmpty()) {
            nextId = cars.get(cars.size() - 1).getId() + 1;
        }
    }

    public void addCar() {
        Car c = new Car(nextId++);
        cars.add(c);
        CarStorage.saveCars(cars);
        System.out.println("Car added!");
    }

    public void listCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars  avlable.");
            return;
        }
        for (Car c : cars) {
            System.out.println(c);
        }
    }
        public void deleteCar(int id) {
        cars.removeIf(c -> c.getId() == id);
        CarStorage.saveCars(cars);
        System.out.println("Car deleted!");
        
    }
}
