package CW2_w1761910;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Arrays;

public class TrainStation extends Application {

    private static Passenger[] waitingRoom = new Passenger[42];
    private static PassengerQueue trainQueue = new PassengerQueue();
    private static Stage window;
    private static Scene scene1;
    private static Scene scene2;
    private static Scene scene3;
    private static Button[] buttons = new Button[42];
    private static Label[] labels = new Label[42];
    private static ListView<String> listView = new ListView<>();
    int number = 0; // button click count
    int rand; // random number for Add() method

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // primary stage
        window = primaryStage;
        window.setTitle("2018412 - Malith Kulathilake CourseWork 2");

        // grid 1
        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(20, 20, 20,20));
        grid1.setHgap(10); // set vertical gap
        grid1.setVgap(10); // set horizontal gap
        grid1.setAlignment(Pos.CENTER); // center position

        // grid 2
        GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(20, 20, 20,20));
        grid2.setHgap(10); // set vertical gap
        grid2.setVgap(10); // set horizontal gap
        grid2.setAlignment(Pos.CENTER); // center position

        // grid 3
        GridPane grid3 = new GridPane();
        grid3.setPadding(new Insets(20, 20, 20,20));
        grid3.setHgap(10); // set vertical gap
        grid3.setVgap(10); // set horizontal gap
        grid3.setAlignment(Pos.CENTER); // center position
        listView.setMinSize(800,700);
        GridPane.setConstraints(listView, 4,1);
        grid3.getChildren().addAll(listView);

        // letter array to assign seat numbers
        String [] letters = {"A", "B", "C", "D", "E", "F", "G"};

        // seat icon
        Image seatIcon = new Image(getClass().getResourceAsStream("Webp.net-resizeimage (1).png"));
        Image userIcon = new Image(getClass().getResourceAsStream("Webp.net-resizeimage (2).png"));

        int index = 0;

        for (int i = 1; i < 8; i++) { // column
            for (int j = 1; j < 8; j++) { // row
                if (i == 4) { // if column index % 4 == 0 then create empty Vbox and assign to the grid.
                    VBox emptyBox1 = new VBox(10);
                    emptyBox1.setPadding(new Insets(25)); // set padding to Vbox.
                    GridPane.setConstraints(emptyBox1, i, j); // assign to column and row of grid.
                    grid1.getChildren().addAll(emptyBox1); // add Vbox to grid.

                } else { // if column index % 4 != 0 then create button and assign to the grid.
                    Button button = new Button(letters[j - 1] + i);
                    button.setGraphic(new ImageView(seatIcon)); // set image for button.
                    button.setStyle("-fx-border-color: #98D8D6; -fx-border-radius: 2px;");
                    button.setMinSize(240, 70); // set min size for button.
                    GridPane.setConstraints(button, i, j); // assign to column and row of grid.
                    grid1.getChildren().addAll(button); // add button to grid.

                    Label label = new Label();
                    label.setGraphic(new ImageView(userIcon)); // set image for label
                    label.setMinSize(270, 70); // set min size for label
                    GridPane.setConstraints(label, i, j); // assign column and row of grid
                    grid2.getChildren().addAll(label); // add label to grid

                    buttons[index] = button; // array of buttons
                    labels[index] = label;
                    index++;
                }
            }
        }

        Methods.creatingWaitingRoom(); // create waiting room when program loads
        rand = Methods.createRandNum(); // generate random number
        System.out.println("Random number : " + rand);

        // Random number label
        Label randNumLabel = new Label();
        randNumLabel.setMinSize(100,40); // set label size
        randNumLabel.setPadding(new Insets(10)); // set padding
        randNumLabel.setText("SELECT " + rand + " TO CHECK-IN"); // set label text
        randNumLabel.setFont(new Font("Arial", 17)); // set label font  and font size
        randNumLabel.setStyle("-fx-font-weight: bold"); // set font weight
        GridPane.setConstraints(randNumLabel, 4, 0); // label placement in grid
        grid1.getChildren().addAll(randNumLabel);

        // simulation report label
        Label simReportLabel = new Label();
        simReportLabel.setMinSize(150, 70); // set label size
        simReportLabel.setPadding(new Insets(10)); // set padding
        simReportLabel.setText("SIMULATION REPORT"); // set label text
        simReportLabel.setFont(new Font("Arial", 20)); // set label font  and font size
        simReportLabel.setStyle("-fx-font-weight: bold");  // set font weight
        GridPane.setConstraints(simReportLabel, 4, 0); // label placement in grid
        grid3.getChildren().addAll(simReportLabel);

        // check-in process
        for(int i = 0; i < buttons.length; i++) {
            int finalI = i;
            buttons[i].setOnAction(e -> { // set action event for each button in waiting room
                System.out.println("\nSeat- " + buttons[finalI].getText());
                buttons[finalI].setStyle("-fx-background-color:#91D3B4 ; "); // change button color
                buttons[finalI].setText(null); // remove button text
                buttons[finalI].setDisable(true); // disable button

                System.out.println("\nElement - " + waitingRoom[finalI]);

                if(trainQueue.isFull()){ // indicate if train queue is full
                    System.out.println("Train Queue is full.");
                } else {
                    trainQueue.add(waitingRoom[finalI]); // add passenger to train queue
                    waitingRoom[finalI] = null; // delete passenger from waiting room
                    number++; // increment number
                }

                System.out.println("\nTrain Queue - " + Arrays.toString(trainQueue.getQueueArray()));
                System.out.println("\nWaiting room - " + Arrays.toString(waitingRoom));

                if (number == rand) { // if number equals random number generated
                    Methods.viewQueue(); // call viewTrainQueue method
                    number = 0; // reset number to 0
                    rand = Methods.createRandNum(); // generate new random number
                    System.out.println("\nRandom number: " + rand);
                    randNumLabel.setText("Select " + rand + " to check-in"); // set text in random number label
                }
            });
        }

        // console button 1
        Button consoleButton = new Button("Menu"); // create button
        consoleButton.setMinSize(130, 40); // set size
        consoleButton.setStyle("-fx-background-color: #98D8D6"); // set color
        GridPane.setConstraints(consoleButton, 1, 13); // assign to column and row of grid
        grid1.getChildren().addAll(consoleButton); // add to grid.

        consoleButton.setOnAction(e -> { // lambda function for console button
            window.setIconified(true); // setIconified(true) minimizes the GUI window
            window.setScene(scene1);
            try {
                Methods.menuSystem(); // open console when clicked
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        });

        // console button 2
        Button consoleButton2 = new Button("Menu"); // create button
        consoleButton2.setMinSize(130, 40); // set size
        consoleButton2.setStyle("-fx-background-color: #98D8D6"); // set color
        GridPane.setConstraints(consoleButton2, 1,12); // assign to column and row of grid
        grid2.getChildren().addAll(consoleButton2); // add to grid.

        consoleButton2.setOnAction(e -> { // lambda function for console button
            window.setIconified(true); // setIconified(true) minimizes the GUI window
            window.setScene(scene1);
            try {
                Methods.menuSystem(); // open console when clicked
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        });

        // console button 3
        Button consoleButton3 = new Button("Menu"); // create button
        consoleButton3.setMinSize(130, 40); // set size
        consoleButton3.setStyle("-fx-background-color: #98D8D6"); // set color
        GridPane.setConstraints(consoleButton3, 4,4); // assign to column and row of grid
        grid3.getChildren().addAll(consoleButton3); // add to grid.

        consoleButton3.setOnAction(e -> { // lambda function for console button
            window.setIconified(true); // setIconified(true) minimizes the GUI window
            window.setScene(scene1);
            try {
                Methods.menuSystem(); // open console when clicked
            } catch (IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
        });

        // scenes
        scene1 = new Scene(grid1, 1800, 900);
        scene2 = new Scene(grid2, 1900,900);
        scene3 = new Scene(grid3);


        window.setScene(scene1);
        window.show();
        window.setIconified(true);
        Methods.menuSystem();
    }

/* --------------------------------------------- Getters / Setters ------------------------------------------------- */

    public static Stage getWindow() {
        return window;
    }

    public static Button[] getButtons() {
        return buttons;
    }

    public static Label[] getLabels() {
        return labels;
    }

    public static Passenger[] getWaitingRoom() {
        return waitingRoom;
    }

    public static Scene getScene2() {
        return scene2;
    }

    public static PassengerQueue getTrainQueue() {
        return trainQueue;
    }

    public static void setTrainQueue(PassengerQueue trainQueue) {
        TrainStation.trainQueue = trainQueue;
    }

    public static ListView<String> getListView() {
        return listView;
    }

    public static Scene getScene3() {
        return scene3;
    }
}