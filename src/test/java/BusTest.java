import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person1;
    Person person2;
    Person person3;

    @Before
    public void before() {
        bus = new Bus(2);
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
    }

    @Test
    public void parametersStartAtDefault() {
        assertEquals(2, bus.getCapacity());
        assertEquals(null, bus.getDestination());
        assertEquals(0, bus.getPassengerCount());
    }

    @Test
    public void canAddPassenger() {
        bus.addPassenger(person1);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void capacityCheckTrue() {
        assertEquals(true, bus.capacityCheck());
    }

    @Test
    public void capacityCheckFalse() {
        bus.addPassenger(person1);
        bus.addPassenger(person2);
        bus.addPassenger(person3);

        assertEquals(false, bus.capacityCheck());
    }

    @Test
    public void getPeopleOnBusTrue() {
        bus.getOnBus(person1);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void getPeopleOnBusFalse(){
        bus.getOnBus(person1);
        bus.getOnBus(person2);
        bus.getOnBus(person3);

        assertEquals(2 , bus.getPassengerCount());
    }

    @Test
    public void removePassenger() {
        bus.getOnBus(person1);
        bus.removePassenger();
        assertEquals(0, bus.getPassengerCount());
    }
}
