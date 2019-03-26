import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Person> que;

    public BusStop(String name) {
        this.name = name;
        this.que = new ArrayList<>();
    }

    public String getName () {
        return this.name;
    }

    public int getQueLength() {
        return this.que.size();
    }

    public void addPersonToQue(Person person) {
        this.que.add(person);
    }

    public Person removePersonFromQue() {
        return this.que.remove(0);
    }

}
