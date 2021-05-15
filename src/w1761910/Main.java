package w1761910;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main extends Application {
    private static Stage window;
    private static Scene scene1;
    private static Scene scene2;
    private static Scene scene3;
    private static Label[] labels = new Label[42];
    private static Button[] buttons = new Button[42];
    private static TextField userInput;
    private static ChoiceBox <String > dateList;
    private static ChoiceBox <String> route;
    static int num;

    private static ArrayList<String> names1 = new ArrayList<>();
    private static ArrayList<String> names2 = new ArrayList<>();
    private static ArrayList<String> names3 = new ArrayList<>();
    private static ArrayList<String> names4 = new ArrayList<>();
    private static ArrayList<String> names5 = new ArrayList<>();
    private static ArrayList<String> names6 = new ArrayList<>();
    private static ArrayList<String> names7 = new ArrayList<>();

    private static ArrayList<String> names8 = new ArrayList<>();
    private static ArrayList<String> names9 = new ArrayList<>();
    private static ArrayList<String> names10 = new ArrayList<>();
    private static ArrayList<String> names11 = new ArrayList<>();
    private static ArrayList<String> names12 = new ArrayList<>();
    private static ArrayList<String> names13 = new ArrayList<>();
    private static ArrayList<String> names14 = new ArrayList<>();

    public static void main (String [] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Primary stage
        window = primaryStage;
        window.setTitle("2018412 - Malith Kulathilake CourseWork 1");

        // grid 1
        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(20, 20, 20, 20));
        grid1.setVgap(30); // set vertical gap
        grid1.setHgap(10); // set horizontal gap
        grid1.setAlignment(Pos.CENTER); // center position

        // grid 2
        GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(20, 20, 20, 20));
        grid2.setVgap(10); // set vertical gap
        grid2.setHgap(10); // set horizontal gap
        grid2.setAlignment(Pos.CENTER); // center position

        // grid 3
        GridPane grid3 = new GridPane();
        grid3.setPadding(new Insets(20, 20, 20, 20));
        grid3.setVgap(10); // set vertical gap
        grid3.setHgap(10); // set horizontal gap
        grid3.setAlignment(Pos.CENTER); // center position

        // letter array
        String [] letters = {"A", "B", "C", "D", "E", "F", "G"};

        // seat icon
        Image seatIcon = new Image(getClass().getResourceAsStream("Webp.net-resizeimage (1).png"));

/* --------------------------------------------- Button layout ----------------------------------------------------- */

        int index = 0;

        for (int i = 1; i < 8; i++) { // column
            for (int j = 1; j < 8; j++) { // row
                if (i % 4 == 0) { // if column index % 4 == 0 then create empty Vbox and assign to the grid.
                    VBox emptyBox1 = new VBox(10);
                    emptyBox1.setPadding(new Insets(25)); // set padding to Vbox.
                    GridPane.setConstraints(emptyBox1, i, j); // assign to column and row of grid.
                    grid1.getChildren().addAll(emptyBox1); // add Vbox to grid.

                    VBox emptyBox2 = new VBox(10);
                    emptyBox2.setPadding(new Insets(25));
                    GridPane.setConstraints(emptyBox2, i, j);
                    grid2.getChildren().addAll(emptyBox2);

                } else { // if column index % 4 != 0 then create button and assign to the grid.
                    Button button = new Button(letters[j - 1] + i);
                    button.setGraphic(new ImageView(seatIcon)); // set image for button.
                    button.setMinSize(70, 70); // set min size for button.
                    GridPane.setConstraints(button, i, j); // assign to column and row of grid.
                    grid1.getChildren().addAll(button); // add button to grid.

                    Label label = new Label(letters[j-1] + i);
                    label.setGraphic(new ImageView(seatIcon)); // set image for label
                    label.setMinSize(70, 70); // set min size for label
                    GridPane.setConstraints(label, i, j); // assign column and row of grid
                    grid2.getChildren().addAll(label); // add label to grid

                    labels[index] = label; // array of labels
                    buttons[index] = button; // array of buttons
                    index++;

                }
            }
        }

/* ----------------------------------------------- Console buttons ------------------------------------------------- */

        // console button for view seats
        Button consoleButton = new Button("Menu");
        GridPane.setConstraints(consoleButton, 4, 12); // assign to column and row of grid.
        consoleButton.setMinSize(100, 40); // set button size
        consoleButton.setStyle("-fx-background-color: #98D8D6"); // set button color
        grid2.getChildren().addAll(consoleButton); // add to grid
        consoleButton.setOnAction(e -> { // lambda function for console button
            window.setIconified(true); // setIconified(true) minimizes the GUI window
            try {
                AllMethods.menuSystem(); // open console when clicked
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        // console button for add customer
        Button consoleButton2 = new Button("Menu");
        GridPane.setConstraints(consoleButton2, 4, 12); // assign to column and row of grid.
        consoleButton2.setMinSize(100, 40); // set button size
        consoleButton2.setStyle("-fx-background-color: #98D8D6");
        grid1.getChildren().addAll(consoleButton2); // add to grid
        consoleButton2.setOnAction(e -> { // lambda function for console button
            window.setIconified(true); // setIconified(true) minimizes the GUI window
            try {
                AllMethods.menuSystem(); // open console when clicked
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

/* ----------------------------------- Scene 2 - User details and confirmation screen ------------------------------ */

        // user input text field
        userInput = new TextField(); // text field to get user input
        GridPane.setConstraints(userInput, 5, 6); // assign to column and row of grid.
        grid3.getChildren().addAll(userInput); // add text field to grid

        // drop down menu to select date
        dateList = new ChoiceBox<>();
        dateList.getItems().add("20.03.2020"); // adding values
        dateList.getItems().add("21.03.2020");
        dateList.getItems().add("22.03.2020");
        dateList.getItems().add("23.03.2020");
        dateList.getItems().add("24.03.2020");
        dateList.getItems().add("25.03.2020");
        dateList.getItems().add("26.03.2020");

        // set default value
        dateList.setValue("20.03.2020");
        GridPane.setConstraints(dateList, 5, 3); // assign to column and row of grid.
        grid3.getChildren().addAll(dateList); // add to grid

        // drop down list to select route
        route = new ChoiceBox<>(); // choiceBox object
        route.getItems().add("COLOMBO-BADULLA"); // adding values
        route.getItems().add("BADULLA-COLOMBO");

        // set default value
        route.setValue("COLOMBO-BADULLA"); // set default value to drop down list
        GridPane.setConstraints(route, 5,1); // drop down list placement in grid
        grid3.getChildren().addAll(route);

        // confirm button
        Button confirmButton = new Button("Confirm"); // create button with text
        confirmButton.setStyle("-fx-background-color: #98D8D6"); // set button color
        confirmButton.setMinSize(100, 20); // set button size
        GridPane.setConstraints(confirmButton, 4,12); // set button placement in grid
        grid3.getChildren().addAll(confirmButton);

        // message label 1
        Label enterNameLabel = new Label("Enter Name: "); // create label with text
        enterNameLabel.setStyle("-fx-border-color: #14A467; -fx-border-radius: 5px;"); // set label border color and style
        enterNameLabel.setPadding(new Insets(6)); // set padding
        GridPane.setConstraints(enterNameLabel, 4, 6); // label placement in grid
        grid3.getChildren().addAll(enterNameLabel);

        // message label 2
        Label dateLabel = new Label("Select Date: "); // create label with text
        dateLabel.setStyle("-fx-border-color: #14A467; -fx-border-radius: 5px;"); // set label border color and style
        dateLabel.setPadding(new Insets(6)); // set padding
        GridPane.setConstraints(dateLabel, 4, 3); // label placement in grid
        grid3.getChildren().addAll(dateLabel);

        // message label 3
        Label routeLabel = new Label("Select Route: "); // create label with text
        routeLabel.setStyle("-fx-border-color: #14A467; -fx-border-radius: 5px;"); // set label border color and style
        routeLabel.setPadding(new Insets(6)); // set padding
        GridPane.setConstraints(routeLabel, 4, 1); // label placement in grid
        grid3.getChildren().addAll(routeLabel);

/* ------------------------------------ Seat selection - Scene 1 --------------------------------------------------- */

        for(int j = 0; j < buttons.length; j++){ // for loop to iterate through array of buttons
            int finalJ = j;
            buttons[j].setOnAction(e -> { // lambda function for button click
                window.setScene(scene3); // change scene when button is clicked
                num = finalJ;
                buttons[num].setStyle("-fx-background-color: #14A467; "); // change color of button when clicked
            });
        }

/* -------------------------------------------- COLOMBO - BADULLA -------------------------------------------------- */
        // confirm button click event
        confirmButton.setOnAction( e -> {
            if(!userInput.getText().isEmpty()){ // checks if user has entered a name or not, if not user must enter a name
                if(route.getValue().equals("COLOMBO-BADULLA")){ // if route is from colombo - badulla
                    switch (dateList.getValue()) {
                        case "20.03.2020":
                            //AllMethods.getSeats1()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            // add customer name and seat number to array
                            AllMethods.getSeats1()[num] = userInput.getText() + " " + buttons[num].getText();
                            names1.add(userInput.getText()); // add name to list
                            System.out.println("\n20.03.2020 : " + Arrays.toString(AllMethods.getSeats1()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats1()[num]); // print booking ID of customer
                            break;
                        case "21.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats2()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names2.add(userInput.getText()); // add name to list
                            System.out.println("\n21.03.2020 : " + Arrays.toString(AllMethods.getSeats2()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats2()[num]); // print booking ID of customer
                            break;
                        case "22.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats3()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names3.add(userInput.getText()); // add name to list
                            System.out.println("\n22.03.2020 : " + Arrays.toString(AllMethods.getSeats3()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats3()[num]); // print booking ID of customer
                            break;
                        case "23.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats4()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names4.add(userInput.getText()); // add name to list
                            System.out.println("\n23.03.2020 : " + Arrays.toString(AllMethods.getSeats4()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats4()[num]); // print booking ID of customer
                            break;
                        case "24.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats5()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names5.add(userInput.getText()); // add name to list
                            System.out.println("\n24.03.2020 : " + Arrays.toString(AllMethods.getSeats5()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats5()[num]); // print booking ID of customer
                            break;
                        case "25.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats6()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names6.add(userInput.getText()); // add name to list
                            System.out.println("\n25.03.2020 : " + Arrays.toString(AllMethods.getSeats6()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats6()[num]); // print booking ID of customer
                            break;
                        case "26.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats7()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names7.add(userInput.getText()); // add name to list
                            System.out.println("\n26.03.2020 : " + Arrays.toString(AllMethods.getSeats7()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats7()[num]); // print booking ID of customer
                            break;
                    }
                }
                /* -------------------------------------------- BADULLA - COLOMBO -------------------------------------------------- */

                else if(route.getValue().equals("BADULLA-COLOMBO")){ // if route is from badulla - colombo
                    switch (dateList.getValue()) {
                        case "20.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats8()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names8.add(userInput.getText()); // add name to list
                            System.out.println("\n\n20.03.2020 : " + Arrays.toString(AllMethods.getSeats8()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats8()[num]); // print booking ID of customer
                            break;
                        case "21.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats9()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names9.add(userInput.getText()); // add name to list
                            System.out.println("\n21.03.2020 : " + Arrays.toString(AllMethods.getSeats9()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats9()[num]); // print booking ID of customer
                            break;
                        case "22.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats10()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names10.add(userInput.getText()); // add name to list
                            System.out.println("\n22.03.2020 : " + Arrays.toString(AllMethods.getSeats10()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats10()[num]); // print booking ID of customer
                            break;
                        case "23.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats11()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names11.add(userInput.getText()); // add name to list
                            System.out.println("\n23.03.2020 : " + Arrays.toString(AllMethods.getSeats11()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats11()[num]); // print booking ID of customer
                            break;
                        case "24.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats12()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names12.add(userInput.getText()); // add name to list
                            System.out.println("\n24.03.2020 : " + Arrays.toString(AllMethods.getSeats12()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats12()[num]); // print booking ID of customer
                            break;
                        case "25.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats13()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names13.add(userInput.getText()); // add name to list
                            System.out.println("\n25.03.2020 : " + Arrays.toString(AllMethods.getSeats13()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats13()[num]); // print booking ID of customer
                            break;
                        case "26.03.2020":
                            // add date, customer name and seat number to array
                            AllMethods.getSeats14()[num] = dateList.getValue() + " " + userInput.getText() + " " + buttons[num].getText();
                            names14.add(userInput.getText()); // add name to list
                            System.out.println("\n26.03.2020 : " + Arrays.toString(AllMethods.getSeats14()));
                            window.setScene(scene1); // set scene as scene 1
                            System.out.println("\nYour booking ID :- " + AllMethods.getSeats14()[num]); // print booking ID of customer
                            break;
                    }
                }
            }
        });

        // scenes
        scene1 = new Scene(grid1, 900, 950); // placing grid layout in scene and giving the size of the scene 900 x 950
        scene2 = new Scene(grid2, 900, 800); // placing grid layout in scene and giving the size of the scene as 900 x 900
        scene3 = new Scene(grid3, 500, 500);  // placing grid layout in scene and giving the size of the scene as 500 x 500

        window.setScene(scene1);
        window.show();
        window.setIconified(true); // setIconified(true) minimizes the GUI window
        AllMethods.menuSystem(); // run all methods class during launch
    }



    /* --------------------------------------------- Getters / Setters ------------------------------------------------- */

    // getters and setters
    public static Stage getWindow() {
        return window;
    }

    public static Scene getScene1() {
        return scene1;
    }

    public static Scene getScene2() {
        return scene2;
    }

    public static Label[] getLabels() {
        return labels;
    }

    public static Button[] getButtons() {
        return buttons;
    }

    public static ArrayList<String> getNames1() {
        return names1;
    }

    public static ArrayList<String> getNames2() {
        return names2;
    }

    public static ArrayList<String> getNames3() {
        return names3;
    }

    public static ArrayList<String> getNames4() {
        return names4;
    }

    public static ArrayList<String> getNames5() {
        return names5;
    }

    public static ArrayList<String> getNames6() {
        return names6;
    }

    public static ArrayList<String> getNames7() {
        return names7;
    }

    public static ArrayList<String> getNames8() {
        return names8;
    }

    public static ArrayList<String> getNames9() {
        return names9;
    }

    public static ArrayList<String> getNames10() {
        return names10;
    }

    public static ArrayList<String> getNames11() {
        return names11;
    }

    public static ArrayList<String> getNames12() {
        return names12;
    }

    public static ArrayList<String> getNames13() {
        return names13;
    }

    public static ArrayList<String> getNames14() {
        return names14;
    }
}