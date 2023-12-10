import java.util.Scanner;

// Create all classes based on my UML.
public abstract class Vehicle {
    // Fields
    protected String make;
    private String type;
    private String model;
    private String color;
    private int year;
    private int doors;
    private String engineType;
    private String transmission;
    
    public Vehicle(String type, String model, String color, int year, int doors, String engineType, String transmission) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.year = year;
        this.doors = doors;
        this.engineType = engineType;
        this.transmission = transmission;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
}

// Create one class per Vehicle (Make + Type + Model)
class Chevrolet extends Vehicle {
    Chevrolet() {
    }
    Chevrolet(String type, String model, String color, int year, int doors, String engineType, String transmission) {
        super("Chevrolet", type, model, color, year, doors, engineType, transmission);
    }
}

class Ford extends Vehicle {
    Ford() {
    }

    Ford(String type, String model, String color, int year, int doors, String engineType, String transmission) {
        super("Ford", type, model, color, year, doors, engineType, transmission);
    }
}

class Honda extends Vehicle {
    Honda() {
    }

    Honda(String type, String model, String color, int year, int doors, String engineType, String transmission) {
        super("Honda", type, model, color, year, doors, engineType, transmission);
    }
}

class Hyundai extends Vehicle {
    Hyundai() {
    }

    Hyundai(String type, String model, String color, int year, int doors, String engineType, String transmission) {
        super("Hyundai", type, model, color, year, doors, engineType, transmission);
    }
}

class Toyota extends Vehicle {
    Toyota() {
    }

    Toyota(String type, String model, String color, int year, int doors, String engineType, String transmission) {
        super("Toyota", type, model, color, year, doors, engineType, transmission);
    }
}
