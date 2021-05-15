package CW2_w1761910;
import java.io.Serializable;

public class PassengerQueue implements Serializable {  // this class is serializable

    private Passenger[] queueArray = new Passenger[42];  // queue array
    private int first = 0;
    private int last = 0;

    public void add(Passenger next) {
        // adding passenger to queue array
        for (int i = 0; i < queueArray.length; i++) {
            if (queueArray[i] == null) { // if queue slot is empty
                queueArray[i] = next; // add passenger to queue slot
                break;
            }
        }
    }

    public boolean isEmpty() {
        // if all 42 slots empty
        int count = getLength();
        boolean bol = false;

        if (count == 0) { // if count == 0 then queue is empty
            bol = true;
        }
        return bol;
    }

    public boolean isFull() {
        // if all 42 slots full
        int count = getLength();
        boolean bol = false;

        if (count == 42) { // if count == 42 then queue is full
            bol = true;
        }
        return bol;
    }

    public int getLength() {
        // get length of the queue array
        int count = 0;
        for (int i = 0; i < queueArray.length; i++) {
            if (queueArray[i] != null) {
                count++;
            }
        }
        System.out.println("Length - " + count);
        return count;
    }

    public Passenger[] getQueueArray() {
        // get queue array
        return this.queueArray;
    }

    public void remove(Passenger removeElement) {
        // remove passenger from queue array
        for (int i = 0; i < queueArray.length; i++) {
            if (queueArray[i] != null) {
                if (queueArray[i].getName().equals(removeElement.getName())) {
                    queueArray[i] = null;
                }
            }
        }
    }

    public int getMaxStay() {
        return 1;
    }

    public int getFirst() {
        return this.first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getLast() {
        return this.last;
    }

    public void setLast(int last) {
        this.last = last;
    }

}

