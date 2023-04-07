class Car {
    public String bodyType, engineType, transmission, color, model;
    public double price;
    public int numPassengers;
    public int maxSpeed;
    public double fuelConsumption;
    private boolean description;

    public Car(String bodyType, String engineType, String transmission,
               String color, String model, double price, int numPass, int maxspeed, double Fuel) {
        this.bodyType = bodyType;
        this.engineType = engineType;
        this.transmission = transmission;
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getNumPassengers() {
        return numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public boolean getDescription() {
        return description;
    }
}