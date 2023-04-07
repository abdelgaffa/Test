import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addCar(new Car("sedan", "gasoline", "automatic", "red", "Toyota Corolla", 25000, 5, 180, 8.5));
        inventory.addCar(new Car("SUV", "Gasoline", "Automatic", "Red", "Toyota RAV4", 25000, 8, 120, 8.0));
        inventory.addCar(new Car("Hatchback", "Gasoline", "Manual", "White", "Honda Civic", 20000,10, 570,9.0));
        inventory.addCar(new Car("coupe", "gasoline", "manual", "white", "Nissan 370Z", 40000, 2, 250, 10.0));
        inventory.addCar(new Car("station wagon", "diesel", "automatic", "blue", "Volvo V90", 55000, 5, 210, 6.0));
        inventory.addCar(new Car("hatchback", "diesel", "manual", "black", "Volkswagen Golf", 28000, 5, 190, 5.0));
        inventory.addCar(new Car("minivan", "hybrid", "automatic", "silver", "Toyota Sienna", 35000, 7, 150, 6.5));
        inventory.addCar(new Car("coupe", "gasoline", "manual", "white", "Nissan 370Z", 40000, 2, 250, 10.0));
        inventory.addCar(new Car("station wagon", "diesel", "automatic", "blue", "Volvo V90", 55000, 5, 210, 6.0));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the car catalog!");
        System.out.println("Enter your search parameters (press Enter to skip):");

        System.out.print("Body type: ");
        String bodyType = scanner.nextLine();

        System.out.print("Engine type: ");
        String engineType = scanner.nextLine();

        System.out.print("Transmission: ");
        String transmission = scanner.nextLine();

        System.out.print("Color: ");
        String color = scanner.nextLine();

        System.out.print("Number of passengers: ");
        String numPassengersInput = scanner.nextLine();
        int numPassengers = numPassengersInput.isEmpty() ? 0 : Integer.parseInt(numPassengersInput);

        System.out.print("Maximum speed: ");
        String maxSpeedInput = scanner.nextLine();
        int maxSpeed = maxSpeedInput.isEmpty() ? 0 : Integer.parseInt(maxSpeedInput);

        System.out.print("Fuel consumption: ");
        String fuelConsumptionInput = scanner.nextLine();
        double fuelConsumption = fuelConsumptionInput.isEmpty() ? 0.0 : Double.parseDouble(fuelConsumptionInput);

        List<Car> searchResult = inventory.search(bodyType, engineType, transmission, color, numPassengers, maxSpeed, fuelConsumption);

        if (searchResult.isEmpty()) {
            System.out.println("Sorry, no cars match your search criteria.");
        } else {
            System.out.println("Here are the cars that match your search criteria:");
            for (Car car : searchResult) {
                System.out.println(car.getDescription());
            }
        }
    }
}



