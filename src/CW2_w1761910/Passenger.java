package CW2_w1761910;
import java.io.Serializable;

public class Passenger implements Serializable {  // this class is serializable
    private String name; // name
    private int secondsInQueue;  // seconds in queue

    public void setName (String name) {
        this.name = name;
    }

    public void setSecondsInQueue (int secondsInQueue) {
        this.secondsInQueue = secondsInQueue;
    }

    public int getSecondsInQueue() {
        return this.secondsInQueue;
    }

    public String getName() {
        return this.name;
    }
}