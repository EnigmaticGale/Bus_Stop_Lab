import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BusStopTest {

    BusStop busStop;
    Person person1;
    Person person2;
    Person person3;

    @Before
    public void before (){
        busStop = new BusStop("stop 1");
        person1 = new Person();
        person2 = new Person();
        person3 = new Person();
    }

    @Test
    public void getName(){
        assertEquals("stop 1", busStop.getName());
    }

    @Test
    public void getQueLength(){
        assertEquals(0, busStop.getQueLength());
    }

    @Test
    public void canAddPersonToQue() {
        busStop.addPersonToQue(person1);
        assertEquals(1, busStop.getQueLength());
    }

    @Test
    public void canRemovePersonFromQue() {
        busStop.addPersonToQue(person1);
        busStop.removePersonFromQue();
        assertEquals(0, busStop.getQueLength());
    }
}
