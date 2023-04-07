import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public List<Car> cars;

    public Inventory() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public List<Car> search(String bodyType, String engineType,
                            String transmission, String color, int numPassengers,
                            int maxSpeed, double fuelConsumption) {
        List<Car> result = new ArrayList<>();
        for (Car car : this.cars) {
            if (car.getBodyType().equals(bodyType)
                    && car.getEngineType().equals(engineType)
                    && car.getTransmission().equals(transmission)
                    && car.getColor().equals(color)
                    && car.getNumPassengers() == numPassengers
                    && car.getMaxSpeed() == maxSpeed
                    && car.getFuelConsumption() == fuelConsumption) {
                result.add(car);
            }
        }
        return result;
    }
}
