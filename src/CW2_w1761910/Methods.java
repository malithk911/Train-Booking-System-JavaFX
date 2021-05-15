package CW2_w1761910;
import java.io.*;
import java.util.*;

public class Methods {
    public static int waitingRoomCount;

    public static void menuSystem() throws IOException, ClassNotFoundException {
        System.out.println("\n\n\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━  B O O K  Y O U R  T R A I N  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" +
                "\n\n SELECT OPTION" +
                "\n\n ⚫ View All Seats - V" +
                "\n ⚫ Add Customer  - A" +
                "\n ⚫ Delete Customer - D" +
                "\n ⚫ Save to file - S" +
                "\n ⚫ Load from file - L" +
                "\n ⚫ Run simulation - R" +
                "\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("\nᐅᐅ Enter an option :-  ");
        String userInput = keyboardInput.next();

        switch (userInput) {
            case "A":
            case "a":
                addToQueue();
                break;
            case "V":
            case "v":
                viewQueue();
                break;
            case "D":
            case "d":
                deleteFromQueue();
                menuSystem();
                break;
            case "S":
            case "s":
                writeFile();
                menuSystem();
                break;
            case "L":
            case "l":
                loadFile();
                menuSystem();
                break;
            case "R":
            case "r":
                runSimulation();
                break;
            case "Q":
            case "q":
                TrainStation.getWindow().close();
                System.exit(0);
                break;
            default:
                System.out.println("\nENTER A VALID OPTION.");
                menuSystem();
                break;
        }
    }

    public static void creatingWaitingRoom() throws IOException {
        File readFile = new File("src/w1761910/DataFiles/DataFile1.txt");
        BufferedReader br = new BufferedReader(new FileReader(readFile));
        String str;
        int count = 0;

        while ((str = br.readLine()) != null) { // while every line is not null, keep reading line by line
            if(str.equals("")){ // if line is an empty string
                TrainStation.getWaitingRoom()[count] = null; // set element with index [count] of waiting room as null
                TrainStation.getButtons()[count].setDisable(true); // disable unreserved buttons
            } else{ // if line is a booked customer and it equals to the user input booking ID
                Passenger passenger = new Passenger(); // create passenger object
                passenger.setName(str); // set name of passenger object as string value obtained from file
                TrainStation.getWaitingRoom()[count] = passenger; // set element with index [count] of waiting room as str
                TrainStation.getButtons()[count].setDisable(false); // enable button
                TrainStation.getButtons()[count].setText(str); // set button text as booking ID of customer
            }
            count++;
        }
        System.out.println("\nWaiting room - " + Arrays.toString(TrainStation.getWaitingRoom()));
    }

    public static void addToQueue() {
        TrainStation.getWindow().setIconified(false);
    }

    public static void viewQueue() {
        // sorting train queue according to seat number
        for (int i = 0; i < TrainStation.getTrainQueue().getQueueArray().length; i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if(TrainStation.getTrainQueue().getQueueArray()[i] != null && TrainStation.getTrainQueue().getQueueArray()[j] != null) {
                    String s = TrainStation.getTrainQueue().getQueueArray()[j].getName();
                    String s2 = TrainStation.getTrainQueue().getQueueArray()[i].getName();
                    if (s.substring(s.length() - 2).compareTo(s2.substring(s2.length() - 2)) > 0) { // compare unicode value of elements in array list (ASCII should be > 0)
                        // sort in alphabetical order
                        Passenger temp1 = TrainStation.getTrainQueue().getQueueArray()[j]; // assign getNames().get(j) to temp variable
                        TrainStation.getTrainQueue().getQueueArray()[j] = TrainStation.getTrainQueue().getQueueArray()[i];
                        TrainStation.getTrainQueue().getQueueArray()[i] = temp1;
                    }
                }
            }
        }

        // displaying passenger in queue slot according sorted order
        for(int i = 0; i < TrainStation.getTrainQueue().getQueueArray().length; i++) {
            if(TrainStation.getTrainQueue().getQueueArray()[i] != null){
                // display passenger ID in queue slot
                TrainStation.getLabels()[i].setText(TrainStation.getTrainQueue().getQueueArray()[i].getName());
                TrainStation.getLabels()[i].setStyle("-fx-border-color: #14A467; -fx-border-radius: 5px;");
            } else {
                TrainStation.getLabels()[i].setText("Empty"); // display as empty queue slot
            }
        }
        TrainStation.getWindow().setScene(TrainStation.getScene2()); // set scene as scene 3
        TrainStation.getWindow().setIconified(false);
    }

    public static void deleteFromQueue() {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("\nᐅᐅ Enter booking ID to delete from queue:- ");
        String deleteFromQueue = keyboardInput.nextLine();
        System.out.println("\n");

        for (int i = 0; i < TrainStation.getTrainQueue().getQueueArray().length; i++){
            if(TrainStation.getTrainQueue().getQueueArray()[i] != null){
                if(TrainStation.getTrainQueue().getQueueArray()[i].getName().equals(deleteFromQueue)){
                    // shift element to the left by one after deletion
                    for(int j = i; j < TrainStation.getTrainQueue().getQueueArray().length - 1; j++){
                        TrainStation.getTrainQueue().getQueueArray()[j] = TrainStation.getTrainQueue().getQueueArray()[j+1];
                    }
                    System.out.println("Passenger deleted : " + deleteFromQueue);
                    break;
                }
            } else {
                System.out.println("\nInvalid Input.\n");
                break;
            }
        }

        // reset text in queue slots in the GUI
        for(int m = 0; m < TrainStation.getLabels().length; m++){
            if(TrainStation.getLabels()[m].getText() != null){
                TrainStation.getLabels()[m].setText(null);
                TrainStation.getLabels()[m].setStyle(null);
            }
        }
    }

    public static void writeFile() throws IOException {
        // create object file from fileOutputStream stream class
        FileOutputStream file = new FileOutputStream(new File("src\\CW2_w1761910\\QueueData.txt"));
        ObjectOutput o = new ObjectOutputStream(file); // create object O from objectOutputStream

        o.writeObject(TrainStation.getTrainQueue()); // write array object to file

        System.out.println("\nQueue after written - " + Arrays.toString(TrainStation.getTrainQueue().getQueueArray()));

        o.close();
        file.close();
    }

    public static void loadFile() throws IOException, ClassNotFoundException {
        System.out.println("\nQueue - " + Arrays.toString(TrainStation.getTrainQueue().getQueueArray()));

        FileInputStream fi = new FileInputStream(new File("src\\CW2_w1761910\\QueueData.txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);

        TrainStation.setTrainQueue((PassengerQueue) oi.readObject());
        System.out.println("\nQueue after loaded - " + Arrays.toString(TrainStation.getTrainQueue().getQueueArray()));

        oi.close();
        fi.close();
    }

    public static int createRandNum(){
        Random random = new Random();
        int lengthOfWaitingRoom = 0;
        int randomNum;

        // count length of waiting room
        for(int i = 0; i < TrainStation.getWaitingRoom().length; i++){
            if(TrainStation.getWaitingRoom()[i] != null){
                lengthOfWaitingRoom++;
            }
        }
        System.out.println("\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("\tLENGTH OF WAITING ROOM: " + lengthOfWaitingRoom);
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        // generating random number according to the number of passengers in waiting room
        if(lengthOfWaitingRoom >= 6){ // if waiting room has more than 6 or 6 passengers
            randomNum = random.nextInt(6)+1;
        } else if (lengthOfWaitingRoom == 5){ // if waiting room has 5 passengers
            randomNum = random.nextInt(5)+1;
        } else if (lengthOfWaitingRoom == 4){ // if waiting room has 4 passengers
            randomNum = random.nextInt(4)+1;
        } else if (lengthOfWaitingRoom == 3) { // if waiting room has 3 passengers
            randomNum = random.nextInt(3)+1;
        } else if (lengthOfWaitingRoom == 2) { // if waiting room has 2 passengers
            randomNum = random.nextInt(2)+1;
        } else if (lengthOfWaitingRoom == 1) { // if waiting room has 1 passenger
            randomNum = 1;
        } else {
            randomNum = 0;
            System.out.println("\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("\tWAITING ROOM IS EMPTY");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.exit(0);
        }
        waitingRoomCount = lengthOfWaitingRoom;
        return randomNum; // return a random number
    }

    public static void runSimulation() throws IOException {
        int rand = createRandNum();
        int count = 0;
        int totalQueueSeconds = 0;
        Random randomNumber = new Random();
        ArrayList<Integer> waitingTimes = new ArrayList<>(); // list of all individual waiting times of passengers
        FileWriter fw = new FileWriter("src\\CW2_w1761910\\SimulationReport.txt");
        fw.write("\n━━━━━━━━━━━━━━━━━━━━━ SIMULATION REPORT ━━━━━━━━━━━━━━━━━━━━━\n");
        TrainStation.getListView().getItems().add("No. of passengers in waiting room : " + waitingRoomCount);  // adding stats to list view
        fw.write("\nNo. of passengers in waiting room : " + waitingRoomCount); // write stats to file

        // add passengers to train queue in groups according to random number
        for(int i = 0; i < TrainStation.getWaitingRoom().length; i++){
            if(TrainStation.getWaitingRoom()[i] != null){
                TrainStation.getTrainQueue().add(TrainStation.getWaitingRoom()[i]);
                count++;
                TrainStation.getWaitingRoom()[i] = null; // remove from waiting room
                if(count == rand){ // if count equals random number
                    TrainStation.getListView().getItems().add("No. of passengers added to queue : " + count); // adding stats to listView
                    fw.write("\nNo. of passengers added to queue : " + count); // write stats to file
                    break;
                }
            }
        }

        // sorting train queue according to seat number
        for (int i = 0; i < TrainStation.getTrainQueue().getQueueArray().length; i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if(TrainStation.getTrainQueue().getQueueArray()[i] != null && TrainStation.getTrainQueue().getQueueArray()[j] != null) {
                    String s = TrainStation.getTrainQueue().getQueueArray()[j].getName();
                    String s2 = TrainStation.getTrainQueue().getQueueArray()[i].getName();
                    if (s.substring(s.length() - 2).compareTo(s2.substring(s2.length() - 2)) > 0) { // compare unicode value of elements in array list (ASCII should be > 0)
                        Passenger temp1 = TrainStation.getTrainQueue().getQueueArray()[j]; // assign getNames().get(j) to temp variable
                        TrainStation.getTrainQueue().getQueueArray()[j] = TrainStation.getTrainQueue().getQueueArray()[i];
                        TrainStation.getTrainQueue().getQueueArray()[i] = temp1; // re-assign temporary variable
                    }
                }
            }
        }
        TrainStation.getListView().getItems().add(" ");  // adding a blank line to list view
        TrainStation.getListView().getItems().add("━━━━━━━━━━━━━━━━━━━━━ Passenger Statistics ━━━━━━━━━━━━━━━━━━━━━");
        fw.write("\n\n\n━━━━━━━━━━━━━━━━━━━━━ Passenger Statistics ━━━━━━━━━━━━━━━━━━━━━");

        // print statistics for individual passenger
        for(int i = 0; i < TrainStation.getTrainQueue().getQueueArray().length; i++){
            if(TrainStation.getTrainQueue().getQueueArray()[i] != null){

                int r1 = randomNumber.nextInt(6)+1; // generate random number
                int r2 = randomNumber.nextInt(6)+1; // generate random number
                int r3 = randomNumber.nextInt(6)+1; // generate random number
                int stayedInQueue = r1 + r2 + r3; // get total
                totalQueueSeconds = totalQueueSeconds + stayedInQueue;

                // set total time spent in queue as secondsInQueue for each passenger
                TrainStation.getTrainQueue().getQueueArray()[i].setSecondsInQueue(totalQueueSeconds);
                String s = TrainStation.getTrainQueue().getQueueArray()[i].getName();
                waitingTimes.add(stayedInQueue); // add individual waiting time to list

                // sort list using bubble sort
                for(int k = 0; k < waitingTimes.size(); k++) {
                    for (int m = 0; m < k + 1; m++) {
                        if (waitingTimes.get(m) > waitingTimes.get(k)) {
                            int temp = waitingTimes.get(m);
                            waitingTimes.set(m, waitingTimes.get(k));
                            waitingTimes.set(k, temp);
                        }
                    }
                }

                // individual waiting time
                TrainStation.getListView().getItems().add(" ");  // adding a blank line to list view
                TrainStation.getListView().getItems().add(s + " individual waiting time : " + stayedInQueue + " seconds");  // adding stats to list view
                fw.write("\n\n" + s + " individual waiting time : " + stayedInQueue + " seconds"); // write stats to file

                // total waiting time for each passenger
                TrainStation.getListView().getItems().add(s + " waited in queue for " + TrainStation.getTrainQueue().getQueueArray()[i].getSecondsInQueue() + " seconds");  // adding stats to list view
                fw.write("\n" + s + " waited in queue for " + TrainStation.getTrainQueue().getQueueArray()[i].getSecondsInQueue() + " seconds"); // write stats to file

                // queue position
                TrainStation.getListView().getItems().add(s + " in queue position : " + (i + 1));  // adding stats to list view
                fw.write("\n" + s + " in queue position : " + (i + 1)); // write stats to file
            }
        }

        TrainStation.getListView().getItems().add(" ");
        TrainStation.getListView().getItems().add("━━━━━━━━━━━━━━━━━━━━━━ Queue Statistics ━━━━━━━━━━━━━━━━━━━━━");
        fw.write("\n\n\n━━━━━━━━━━━━━━━━━━━━━━ Queue Statistics ━━━━━━━━━━━━━━━━━━━━━");

        TrainStation.getListView().getItems().add("Min waiting time of a passenger : " + waitingTimes.get(0) + " seconds"); // adding stats to list view
        fw.write("\n\nMin waiting time of a passenger : " + waitingTimes.get(0) + " seconds"); // write stats to file

        TrainStation.getListView().getItems().add("Max waiting time of a passenger : " + waitingTimes.get(waitingTimes.size()-1) + " seconds"); // adding stats to list view
        fw.write("\nMax waiting time of a passenger : " + waitingTimes.get(waitingTimes.size()-1) + " seconds"); // write stats to file

        int totalTime = 0; // addition of all the individual waiting times per scenario
        for(int i = 0; i < waitingTimes.size(); i++) {
            totalTime = totalTime + waitingTimes.get(i); // calculate the total waiting time of the queue
        }

        TrainStation.getListView().getItems().add("Total waiting time of queue : " + totalTime + " seconds"); // adding stats to list view
        fw.write("\nTotal waiting time of queue : " + totalTime + " seconds"); // write stats to file

        TrainStation.getListView().getItems().add("Average waiting time : " + totalTime/waitingTimes.size() + " seconds"); // adding stats to list view
        fw.write("\nAverage waiting time : " + totalTime/waitingTimes.size() + " seconds"); // write stats to file

        TrainStation.getListView().getItems().add(" ");
        TrainStation.getListView().getItems().add(" ");
        TrainStation.getListView().getItems().add("__________________________________________________ NEXT SIMULATION ___________________________________________________");
        TrainStation.getListView().getItems().add(" ");

    TrainStation.getWindow().setScene(TrainStation.getScene3()); // change scene
    TrainStation.getWindow().setIconified(false); // maximize window
    fw.close();
    }
}
