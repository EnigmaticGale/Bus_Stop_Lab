import java.util.ArrayList;

public class Bus {

    private int capacity;
    private String destination;
    private ArrayList<Person> passengers;

    public Bus (int capacity) {
        this.capacity = capacity;
        this.destination = destination;
        this.passengers = new ArrayList<>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getDestination() {
        return this.destination;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public void addPassenger (Person person) {
        this.passengers.add(person);
    }

    public boolean capacityCheck () {
        if (this.capacity <= getPassengerCount()) {
            return false;
        }
        return true;
    }

    public void getOnBus(Person person) {
        if (capacityCheck()) {
            addPassenger(person);
        }
    }

    public Person removePassenger() {
        return this.passengers.remove(0);
    }

    public void pickUpFromStop(BusStop busStop) {
        getOnBus(busStop.removePersonFromQue());
    }

}
