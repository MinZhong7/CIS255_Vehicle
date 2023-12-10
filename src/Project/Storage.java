import java.util.ArrayList;
import java.util.List;

public abstract class Storage<T> {
    private List<T> vehicles = new ArrayList<>();

    public void addVehicle(T vehicle) {
        vehicles.add(vehicle);
    }

    public List<T> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<T> vehicles) {
        this.vehicles = vehicles;
    }

    private Storage() {
        
    }
}
