package w1761910;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class AllMethods {
    static final int seatCapacity = 42; // global constant for seat capacity

    // seat arrays Colombo - Badulla
    private static final String[] seats1 = new String[42];
    private static final String[] seats2 = new String[42];
    private static final String[] seats3 = new String[42];
    private static final String[] seats4 = new String[42];
    private static final String[] seats5 = new String[42];
    private static final String[] seats6 = new String[42];
    private static final String[] seats7 = new String[42];

    // seat arrays Badulla - Colombo
    private static final String[] seats8 = new String[42];
    private static final String[] seats9 = new String[42];
    private static final String[] seats10 = new String[42];
    private static final String[] seats11 = new String[42];
    private static final String[] seats12 = new String[42];
    private static final String[] seats13 = new String[42];
    private static final String[] seats14 = new String[42];

    // menu system
    public static void menuSystem() throws IOException {
        System.out.println("\n\n\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━  B O O K  Y O U R  T R A I N  ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━" +
                "\n\n BOOK YOUR TRAIN SEATS " +
                "\n\n ⚫ View All Seats - V" +
                "\n ⚫ Add Customer  - A" +
                "\n ⚫ View Empty Seats - E" +
                "\n ⚫ Delete Customer - D" +
                "\n ⚫ Find customer - F" +
                "\n ⚫ Save to file - S" +
                "\n ⚫ Load program data from file - L" +
                "\n ⚫ Sort seats alphabetically - O" +
                "\n ⚫ Close program - Q" +
                "\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");

        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("\nᐅᐅ Enter an option :-  ");
        String userInput = keyboardInput.next();

        switch (userInput) {
            case "A":
            case "a":
                addCustomer();
                break;
            case "V":
            case "v":
                viewSeats();
                break;
            case "E":
            case "e":
                emptySeats();
                break;
            case "D":
            case "d":
                deleteCustomer();
                menuSystem();
                break;
            case "F":
            case "f":
                findCustomer();
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
            case "O":
            case "o":
                sortNames();
                menuSystem();
                break;
            case "Q":
            case "q":
                Main.getWindow().close();
                System.exit(0);
                break;
            default:
                System.out.println("\nENTER A VALID OPTION.");
                menuSystem();
                break;
        }
    }

    // add customer
    public static void addCustomer() {
        Main.getWindow().setScene(Main.getScene1()); // change the scene
        Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
    }

    // view all seats
    public static void viewSeats() {
        for (int i = 0; i < seatCapacity; i++) {
            if (seats1[i] != null) {
                Main.getLabels()[i].setVisible(true); // set visibility of labels
            }
        }
        Main.getWindow().setScene(Main.getScene2()); // change the scene
        Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
    }

    // view empty seats
    public static void emptySeats() throws IOException {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter date to view empty seats:- ");
        String dateInput = keyboardInput.next();
        System.out.println("Enter route:- ");
        String routeInput = keyboardInput.next();
        routeInput = routeInput.toLowerCase();

/* ------------------------------------------- COLOMBO - BADULLA ---------------------------------------------------- */

        if(routeInput.equals("colombo-badulla")){
            switch (dateInput) {
                case "20.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats1[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "21.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats2[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "22.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats3[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "23.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats4[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "24.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats5[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "25.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats6[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "26.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats7[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;
                default:
                    System.out.println("\nInvalid Input");
                    menuSystem();
            }
        }

/* ------------------------------------------- BADULLA - COLOMBO ---------------------------------------------------- */

        else if (routeInput.equals("badulla-colombo")){
            System.out.println("\n" + routeInput);
            switch (dateInput) {
                case "20.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats8[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "21.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats9[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "22.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats10[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "23.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats11[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "24.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats12[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "25.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats13[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;

                case "26.03.2020":
                    for (int j = 0; j < seatCapacity; j++) { // reset visibility first to all visible
                        Main.getLabels()[j].setVisible(true);
                    }
                    for (int i = 0; i < seatCapacity; i++) {
                        if (seats14[i] != null) {
                            // set visibility of labels, here the labels of the seats which are booked are set to be non visible
                            Main.getLabels()[i].setVisible(false);
                        }
                    }
                    Main.getWindow().setScene(Main.getScene2()); // change the scene
                    Main.getWindow().setIconified(false); // setIconified(false) maximizes the GUI window
                    break;
            }

        } else {
            System.out.println("\nInvalid Input.");
            menuSystem();
        }

    }

    // save bookings to text file
    public static void writeFile() throws IOException {

        /* ------------------------------------------ COLOMBO-BADULLA ------------------------------------------------------- */
        String text = "";
        System.out.println(Arrays.toString(seats1));

        for (int i = 0; i < seats1.length; i++) { // for loop to iterate through seats array
            if (seats1[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text = text + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text = text + seats1[i]; // write seats[i] to file
                } else {
                    text = text + seats1[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer1 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile1.txt"));
        writer1.write(text); // write text to file
        writer1.close(); // close file


        String text2 = "";
        System.out.println(Arrays.toString(seats2));

        for (int i = 0; i < seats2.length; i++) { // for loop to iterate through seats array
            if (seats2[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text2 = text2 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text2 = text2 + seats2[i]; // write seats[i] to file
                } else {
                    text2 = text2 + seats2[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer2 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile2.txt"));
        writer2.write(text2); // write text to file
        writer2.close(); // close file


        String text3 = "";
        System.out.println(Arrays.toString(seats3));

        for (int i = 0; i < seats3.length; i++) { // for loop to iterate through seats array
            if (seats3[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text3 = text3 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text3 = text3 + seats3[i]; // write seats[i] to file
                } else {
                    text3 = text3 + seats3[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer3 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile3.txt"));
        writer3.write(text3); // write text to file
        writer3.close(); // close file


        String text4 = "";
        System.out.println(Arrays.toString(seats4));

        for (int i = 0; i < seats4.length; i++) { // for loop to iterate through seats array
            if (seats4[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text4 = text4 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text4 = text4 + seats4[i]; // write seats[i] to file
                } else {
                    text4 = text4 + seats4[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer4 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile4.txt"));
        writer4.write(text4); // write text to file
        writer4.close(); // close file


        String text5 = "";
        System.out.println(Arrays.toString(seats5));

        for (int i = 0; i < seats5.length; i++) { // for loop to iterate through seats array
            if (seats5[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text5 = text5 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text5 = text5 + seats5[i]; // write seats[i] to file
                } else {
                    text5 = text5 + seats5[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer5 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile5.txt"));
        writer5.write(text5); // write text to file
        writer5.close(); // close file


        String text6 = "";
        System.out.println(Arrays.toString(seats6));

        for (int i = 0; i < seats6.length; i++) { // for loop to iterate through seats array
            if (seats6[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text6 = text6 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text6 = text6 + seats6[i]; // write seats[i] to file
                } else {
                    text6 = text6 + seats6[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer6 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile6.txt"));
        writer6.write(text6); // write text to file
        writer6.close(); // close file


        String text7 = "";
        System.out.println(Arrays.toString(seats7));

        for (int i = 0; i < seats7.length; i++) { // for loop to iterate through seats array
            if (seats7[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text7 = text7 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text7 = text7 + seats7[i]; // write seats[i] to file
                } else {
                    text7 = text7 + seats7[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer7 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile7.txt"));
        writer7.write(text7); // write text to file
        writer7.close(); // close file


        /* --------------------------------------------- BADULLA - COLOMBO -------------------------------------------------- */

        String text8 = "";
        System.out.println(Arrays.toString(seats8));

        for (int i = 0; i < seats8.length; i++) { // for loop to iterate through seats array
            if (seats8[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text8 = text8 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text8 = text8 + seats8[i]; // write seats[i] to file
                } else {
                    text8 = text8 + seats8[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer8 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile8.txt"));
        writer8.write(text8); // write text to file
        writer8.close(); // close file


        String text9 = "";
        System.out.println(Arrays.toString(seats9));

        for (int i = 0; i < seats9.length; i++) { // for loop to iterate through seats array
            if (seats9[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text9 = text9 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text9 = text9 + seats9[i]; // write seats[i] to file
                } else {
                    text9 = text9 + seats9[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer9 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile9.txt"));
        writer9.write(text9); // write text to file
        writer9.close(); // close file


        String text10 = "";
        System.out.println(Arrays.toString(seats10));

        for (int i = 0; i < seats10.length; i++) { // for loop to iterate through seats array
            if (seats10[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text10 = text10 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text10 = text10 + seats10[i]; // write seats[i] to file
                } else {
                    text10 = text10 + seats10[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer10 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile10.txt"));
        writer10.write(text10); // write text to file
        writer10.close(); // close file


        String text11 = "";
        System.out.println(Arrays.toString(seats11));

        for (int i = 0; i < seats11.length; i++) { // for loop to iterate through seats array
            if (seats11[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text11 = text11 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text11 = text11 + seats11[i]; // write seats[i] to file
                } else {
                    text11 = text11 + seats11[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer11 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile11.txt"));
        writer11.write(text11); // write text to file
        writer11.close(); // close file


        String text12 = "";
        System.out.println(Arrays.toString(seats12));

        for (int i = 0; i < seats12.length; i++) { // for loop to iterate through seats array
            if (seats12[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text12 = text12 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text12 = text12 + seats12[i]; // write seats[i] to file
                } else {
                    text12 = text12 + seats12[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer12 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile12.txt"));
        writer12.write(text12); // write text to file
        writer12.close(); // close file


        String text13 = "";
        System.out.println(Arrays.toString(seats13));

        for (int i = 0; i < seats13.length; i++) { // for loop to iterate through seats array
            if (seats13[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text13 = text13 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text13 = text13 + seats13[i]; // write seats[i] to file
                } else {
                    text13 = text13 + seats13[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer13 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile13.txt"));
        writer13.write(text13); // write text to file
        writer13.close(); // close file


        String text14 = "";
        System.out.println(Arrays.toString(seats14));

        for (int i = 0; i < seats14.length; i++) { // for loop to iterate through seats array
            if (seats14[i] == null) { // if seats[i] is null,
                if (i != 41) { // if i != 41 then write blank line
                    text14 = text14 + "\n";
                }
            } else {
                if (i == 41) { // else if i = 41,
                    text14 = text14 + seats14[i]; // write seats[i] to file
                } else {
                    text14 = text14 + seats14[i] + "\n"; // write seats[i] and go to the next line
                }
            }
        }
        // BufferedWriter class to write to file in specified path
        BufferedWriter writer14 = new BufferedWriter(new FileWriter("src\\w1761910\\DataFiles\\DataFile14.txt"));
        writer14.write(text14); // write text to file
        writer14.close(); // close file
    }

    // load data from file to data structure
    public static void loadFile () throws IOException {

/* -------------------------------------------- COLOMBO - BADULLA -------------------------------------------------- */

        File myFile1 = new File("src\\w1761910\\DataFiles\\DataFile1.txt");
        BufferedReader br1 = new BufferedReader(new FileReader(myFile1));
        String st1;
        int count1 = 0;

        while ((st1 = br1.readLine()) != null) { // read file, line by line
            if (st1.equals("")) {  // if the line is empty then set seats[count] as null
                seats1[count1] = null;
            } else {
                seats1[count1] = st1; // add text in file to seats[count]
                Main.getButtons()[count1].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
                Main.getLabels()[count1].setVisible(false);
            }
            count1++;
        }
        System.out.println(Arrays.toString(seats1));



        File myFile2 = new File("src\\w1761910\\DataFiles\\DataFile2.txt");
        BufferedReader br2 = new BufferedReader(new FileReader(myFile2));
        String st2;
        int count2 = 0;

        while ((st2 = br2.readLine()) != null) { // read file, line by line
            if (st2.equals("")) {  // if the line is empty then set seats[count] as null
                seats2[count2] = null;
            } else {
                seats2[count2] = st2; // add text in file to seats[count]
                Main.getButtons()[count2].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count2++;
        }
        System.out.println(Arrays.toString(seats2));



        File myFile3 = new File("src\\w1761910\\DataFiles\\DataFile3.txt");
        BufferedReader br3 = new BufferedReader(new FileReader(myFile3));
        String st3;
        int count3 = 0;

        while ((st3 = br3.readLine()) != null) { // read file, line by line
            if (st3.equals("")) {  // if the line is empty then set seats[count] as null
                seats3[count3] = null;
            } else {
                seats3[count3] = st3; // add text in file to seats[count]
                Main.getButtons()[count3].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count3++;
        }
        System.out.println(Arrays.toString(seats3));


        File myFile4 = new File("src\\w1761910\\DataFiles\\DataFile4.txt");
        BufferedReader br4 = new BufferedReader(new FileReader(myFile4));
        String st4;
        int count4 = 0;

        while ((st4= br4.readLine()) != null) { // read file, line by line
            if (st4.equals("")) {  // if the line is empty then set seats[count] as null
                seats1[count4] = null;
            } else {
                seats1[count4] = st4; // add text in file to seats[count]
                Main.getButtons()[count4].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count4++;
        }
        System.out.println(Arrays.toString(seats4));


        File myFile5 = new File("src\\w1761910\\DataFiles\\DataFile5.txt");
        BufferedReader br5 = new BufferedReader(new FileReader(myFile5));
        String st5;
        int count5 = 0;

        while ((st5 = br5.readLine()) != null) { // read file, line by line
            if (st5.equals("")) {  // if the line is empty then set seats[count] as null
                seats5[count5] = null;
            } else {
                seats5[count5] = st5; // add text in file to seats[count]
                Main.getButtons()[count5].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count5++;
        }
        System.out.println(Arrays.toString(seats5));


        File myFile6 = new File("src\\w1761910\\DataFiles\\DataFile6.txt");
        BufferedReader br6 = new BufferedReader(new FileReader(myFile6));
        String st6;
        int count6 = 0;

        while ((st6 = br6.readLine()) != null) { // read file, line by line
            if (st6.equals("")) {  // if the line is empty then set seats[count] as null
                seats1[count6] = null;
            } else {
                seats1[count6] = st6; // add text in file to seats[count]
                Main.getButtons()[count6].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count6++;
        }
        System.out.println(Arrays.toString(seats6));


        File myFile7 = new File("src\\w1761910\\DataFiles\\DataFile7.txt");
        BufferedReader br7 = new BufferedReader(new FileReader(myFile7));
        String st7;
        int count7 = 0;

        while ((st7 = br7.readLine()) != null) { // read file, line by line
            if (st7.equals("")) {  // if the line is empty then set seats[count] as null
                seats7[count7] = null;
            } else {
                seats7[count7] = st7; // add text in file to seats[count]
                Main.getButtons()[count7].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count7++;
        }
        System.out.println(Arrays.toString(seats7));

/* ----------------------------------------- BADULLA - COLOMBO ----------------------------------------------------- */

        File myFile8 = new File("src\\w1761910\\DataFiles\\DataFile8.txt");
        BufferedReader br8 = new BufferedReader(new FileReader(myFile8));
        String st8;
        int count8 = 0;

        while ((st8 = br8.readLine()) != null) { // read file, line by line
            if (st8.equals("")) {  // if the line is empty then set seats[count] as null
                seats8[count8] = null;
            } else {
                seats8[count8] = st8; // add text in file to seats[count]
                Main.getButtons()[count8].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count8++;
        }
        System.out.println(Arrays.toString(seats8));


        File myFile9 = new File("src\\w1761910\\DataFiles\\DataFile9.txt");
        BufferedReader br9 = new BufferedReader(new FileReader(myFile9));
        String st9;
        int count9 = 0;

        while ((st9 = br9.readLine()) != null) { // read file, line by line
            if (st9.equals("")) {  // if the line is empty then set seats[count] as null
                seats9[count9] = null;
            } else {
                seats9[count9] = st9; // add text in file to seats[count]
                Main.getButtons()[count9].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count9++;
        }
        System.out.println(Arrays.toString(seats9));


        File myFile10 = new File("src\\w1761910\\DataFiles\\DataFile10.txt");
        BufferedReader br10 = new BufferedReader(new FileReader(myFile10));
        String st10;
        int count10 = 0;

        while ((st10 = br10.readLine()) != null) { // read file, line by line
            if (st10.equals("")) {  // if the line is empty then set seats[count] as null
                seats10[count10] = null;
            } else {
                seats10[count10] = st10; // add text in file to seats[count]
                Main.getButtons()[count10].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count10++;
        }
        System.out.println(Arrays.toString(seats10));


        File myFile11 = new File("src\\w1761910\\DataFiles\\DataFile11.txt");
        BufferedReader br11 = new BufferedReader(new FileReader(myFile11));
        String st11;
        int count11 = 0;

        while ((st11 = br11.readLine()) != null) { // read file, line by line
            if (st11.equals("")) {  // if the line is empty then set seats[count] as null
                seats11[count11] = null;
            } else {
                seats11[count11] = st11; // add text in file to seats[count]
                Main.getButtons()[count11].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count11++;
        }
        System.out.println(Arrays.toString(seats11));


        File myFile12 = new File("src\\w1761910\\DataFiles\\DataFile12.txt");
        BufferedReader br12 = new BufferedReader(new FileReader(myFile12));
        String st12;
        int count12 = 0;

        while ((st12 = br12.readLine()) != null) { // read file, line by line
            if (st12.equals("")) {  // if the line is empty then set seats[count] as null
                seats12[count12] = null;
            } else {
                seats12[count12] = st12; // add text in file to seats[count]
                Main.getButtons()[count12].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count12++;
        }
        System.out.println(Arrays.toString(seats12));


        File myFile13 = new File("src\\w1761910\\DataFiles\\DataFile13.txt");
        BufferedReader br13 = new BufferedReader(new FileReader(myFile13));
        String st13;
        int count13 = 0;

        while ((st13 = br13.readLine()) != null) { // read file, line by line
            if (st13.equals("")) {  // if the line is empty then set seats[count] as null
                seats13[count13] = null;
            } else {
                seats13[count1] = st13; // add text in file to seats[count]
                Main.getButtons()[count13].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count13++;
        }
        System.out.println(Arrays.toString(seats13));


        File myFile14 = new File("src\\w1761910\\DataFiles\\DataFile14.txt");
        BufferedReader br14 = new BufferedReader(new FileReader(myFile14));
        String st14;
        int count14 = 0;

        while ((st14 = br14.readLine()) != null) { // read file, line by line
            if (st14.equals("")) {  // if the line is empty then set seats[count] as null
                seats14[count14] = null;
            } else {
                seats14[count14] = st14; // add text in file to seats[count]
                Main.getButtons()[count14].setStyle("-fx-background-color: #14A467; "); // change button color if seat is booked
            }
            count14++;
        }
        System.out.println(Arrays.toString(seats14));
    }

    // delete customer from seat
    public static void deleteCustomer() {
        Scanner keyboardInput = new Scanner(System.in);

        try {
            System.out.println("\nᐅᐅ Enter date:- ");
            String deleteDate = keyboardInput.nextLine(); // input date

            System.out.println("\nᐅᐅ Enter route:- ");
            String deleteRoute = keyboardInput.nextLine(); // input route
            deleteRoute = deleteRoute.toLowerCase(); // convert string to lower case

            System.out.println("\nᐅᐅ Enter your booking ID (example - 20.03.2020nameA1 ) :- ");
            String deleteName = keyboardInput.nextLine(); // input user ID

/* ----------------------------------------------- COLOMBO - BADULLA ------------------------------------------------ */

            if (deleteRoute.equals("colombo-badulla")) { // if route is colombo - badulla
                System.out.println("\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━\n" + "\tCOLOMBO - BADULLA\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
                switch (deleteDate) {
                    case "20.03.2020":
                        for (int i = 0; i < seats1.length; i++) {
                            if (seats1[i] != null && seats1[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats1[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats1));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "21.03.2020":
                        for (int i = 0; i < seats2.length; i++) {
                            if (seats2[i] != null && seats2[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats2[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats2));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "22.03.2020":
                        for (int i = 0; i < seats3.length; i++) {
                            if (seats3[i] != null && seats3[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats3[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats3));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "23.03.2020":
                        for (int i = 0; i < seats4.length; i++) {
                            if (seats4[i] != null && seats4[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats4[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats4));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "24.03.2020":
                        for (int i = 0; i < seats5.length; i++) {
                            if (seats5[i] != null && seats5[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats5[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats5));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "25.03.2020":
                        for (int i = 0; i < seats6.length; i++) {
                            if (seats6[i] != null && seats6[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats6[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats6));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "26.03.2020":
                        for (int i = 0; i < seats7.length; i++) {
                            if (seats7[i] != null && seats7[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats7[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats7));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                }

/* ------------------------------------------------ BADULLA - COLOMBO ----------------------------------------------- */

            } else if (deleteRoute.equals("badulla-colombo")){ // if route is badulla - colombo
                switch (deleteDate) {
                    case "20.03.2020":
                        for (int i = 0; i < seats8.length; i++) {
                            if (seats8[i] != null && seats8[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats8[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats8));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "21.03.2020":
                        for (int i = 0; i < seats9.length; i++) {
                            if (seats9[i] != null && seats9[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats9[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats9));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "22.03.2020":
                        for (int i = 0; i < seats10.length; i++) {
                            if (seats10[i] != null && seats10[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats10[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats10));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "23.03.2020":
                        for (int i = 0; i < seats11.length; i++) {
                            if (seats11[i] != null && seats11[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats11[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats11));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "24.03.2020":
                        for (int i = 0; i < seats12.length; i++) {
                            if (seats12[i] != null && seats12[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats12[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats12));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "25.03.2020":
                        for (int i = 0; i < seats13.length; i++) {
                            if (seats13[i] != null && seats13[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats13[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats13));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    case "26.03.2020":
                        for (int i = 0; i < seats14.length; i++) {
                            if (seats14[i] != null && seats14[i].equals(deleteName)) { // if seats[i] is not null and equal to user input
                                seats14[i] = null; // set seats[i] to null
                                Main.getButtons()[i].setStyle(null); // set style of buttons[i] as null
                                System.out.println("\n\nYou have successfully cancelled your reservation.\n\n");
                                System.out.println("\nUpdated:- " + Arrays.toString(seats14));
                            } else {
                                System.out.println("Invalid Input");
                                break;
                            }
                        }
                        break;
                    default:
                        System.out.println("\nInvalid Input.");
                        break;
                }
            }
        } catch (Throwable e) {
            System.out.println("\nINVALID INPUT.\n");
        }
    }

    // find customer's seat number
    public static void findCustomer(){
        Scanner keyboardInput = new Scanner(System.in);
        try {
            System.out.println("ᐅᐅ Enter booked date:- ");
            String bookedDate = keyboardInput.nextLine(); // input booked date

            System.out.println("ᐅᐅ Enter booked route :- ");
            String bookedRoute = keyboardInput.nextLine(); // input route
            bookedRoute = bookedRoute.toLowerCase(); // convert input to lower case

            System.out.println("ᐅᐅ Enter your booking ID (example - 20.03.2020nameA1 ) :- ");
            String customerName = keyboardInput.nextLine();  // input booking ID

/* ------------------------------------------- COLOMBO - BADULLA --------------------------------------------------- */

            if(bookedRoute.equals("colombo-badulla")){ // if route is colombo - badulla
                System.out.println("\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━\n" + "\tCOLOMBO - BADULLA\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
                switch (bookedDate) {
                    case "20.03.2020":
                        for (int i = 0; i < seats1.length; i++) { // iterate through array
                            if (seats1[i] != null && seats1[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "21.03.2020":
                        for (int i = 0; i < seats2.length; i++) { // iterate through array
                            if (seats2[i] != null && seats2[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "22.03.2020":
                        for (int i = 0; i < seats3.length; i++) { // iterate through array
                            if (seats3[i] != null && seats3[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "23.03.2020":
                        for (int i = 0; i < seats4.length; i++) { // iterate through array
                            if (seats4[i] != null && seats4[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "24.03.2020":
                        for (int i = 0; i < seats5.length; i++) { // iterate through array
                            if (seats5[i] != null && seats5[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "25.03.2020":
                        for (int i = 0; i < seats6.length; i++) { // iterate through array
                            if (seats6[i] != null && seats6[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "26.03.2020":
                        for (int i = 0; i < seats7.length; i++) { // iterate through array
                            if (seats7[i] != null && seats7[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                }

/* ------------------------------------------- BADULLA - COLOMBO --------------------------------------------------- */

            } else if (bookedRoute.equals("badulla-colombo")){ // if route is badulla - colombo
                System.out.println("\n\n━━━━━━━━━━━━━━━━━━━━━━━━━━━\n" + "\tBADULLA - COLOMBO\n" + "━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
                switch (bookedDate) {
                    case "20.03.2020":
                        for (int i = 0; i < seats8.length; i++) { // iterate through array
                            if (seats8[i] != null && seats8[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "21.03.2020":
                        for (int i = 0; i < seats9.length; i++) { // iterate through array
                            if (seats9[i] != null && seats9[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "22.03.2020":
                        for (int i = 0; i < seats10.length; i++) { // iterate through array
                            if (seats10[i] != null && seats10[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "23.03.2020":
                        for (int i = 0; i < seats11.length; i++) { // iterate through array
                            if (seats11[i] != null && seats11[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "24.03.2020":
                        for (int i = 0; i < seats12.length; i++) { // iterate through array
                            if (seats12[i] != null && seats12[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "25.03.2020":
                        for (int i = 0; i < seats13.length; i++) { // iterate through array
                            if (seats13[i] != null && seats13[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                    case "26.03.2020":
                        for (int i = 0; i < seats2.length; i++) { // iterate through array
                            if (seats2[i] != null && seats2[i].equals(customerName)) { // if seats[i] is equal to user input
                                System.out.println("\n\t" + customerName + " - " + " Seat " + Main.getButtons()[i].getText());
                            }
                        }
                        break;
                }
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    // sort customer names in alphabetical order
    public static void sortNames() {

        System.out.println("\n\n------------------------------- COLOMBO - BADULLA ----------------------------------------");

        for (int i = 0; i < Main.getNames1().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames1().get(j).compareTo(Main.getNames1().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp1 = Main.getNames1().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames1().set(j, Main.getNames1().get(i));
                    Main.getNames1().set(i, temp1);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (20.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames1().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames1().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames2().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames2().get(j).compareTo(Main.getNames2().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp2 = Main.getNames2().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames2().set(j, Main.getNames2().get(i));
                    Main.getNames2().set(i, temp2);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (21.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames2().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames2().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames3().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames3().get(j).compareTo(Main.getNames3().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp3 = Main.getNames3().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames3().set(j, Main.getNames3().get(i));
                    Main.getNames3().set(i, temp3);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (22.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames3().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames3().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames4().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames4().get(j).compareTo(Main.getNames4().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp4 = Main.getNames4().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames4().set(j, Main.getNames4().get(i));
                    Main.getNames4().set(i, temp4);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (23.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames4().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames4().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames5().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames5().get(j).compareTo(Main.getNames5().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp5 = Main.getNames5().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames5().set(j, Main.getNames5().get(i));
                    Main.getNames5().set(i, temp5);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (24.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames5().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames5().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames6().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames6().get(j).compareTo(Main.getNames6().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp6 = Main.getNames6().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames6().set(j, Main.getNames6().get(i));
                    Main.getNames6().set(i, temp6);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (25.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames6().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames6().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames7().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames7().get(j).compareTo(Main.getNames7().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp7 = Main.getNames7().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames7().set(j, Main.getNames7().get(i));
                    Main.getNames7().set(i, temp7);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (26.03.2020)  :- \n");
        for (int m = 0; m <= Main.getNames7().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames7().get(m) + "\n"); // print in alphabetical order
        }


System.out.println("\n\n------------------------------- BADULLA - COLOMBO ----------------------------------------");

        for (int i = 0; i < Main.getNames8().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames8().get(j).compareTo(Main.getNames8().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp8 = Main.getNames8().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames8().set(j, Main.getNames8().get(i));
                    Main.getNames8().set(i, temp8);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (20.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames8().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames8().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames9().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames9().get(j).compareTo(Main.getNames9().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp9 = Main.getNames9().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames9().set(j, Main.getNames9().get(i));
                    Main.getNames9().set(i, temp9);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (21.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames9().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames9().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames10().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames10().get(j).compareTo(Main.getNames10().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp10 = Main.getNames10().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames10().set(j, Main.getNames10().get(i));
                    Main.getNames10().set(i, temp10);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (22.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames10().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames10().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames11().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames11().get(j).compareTo(Main.getNames11().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp11 = Main.getNames11().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames11().set(j, Main.getNames11().get(i));
                    Main.getNames11().set(i, temp11);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (23.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames11().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames11().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames12().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames12().get(j).compareTo(Main.getNames12().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp12 = Main.getNames12().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames12().set(j, Main.getNames12().get(i));
                    Main.getNames12().set(i, temp12);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (24.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames12().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames12().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames13().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames13().get(j).compareTo(Main.getNames13().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp13 = Main.getNames13().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames13().set(j, Main.getNames13().get(i));
                    Main.getNames13().set(i, temp13);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (25.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames13().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames13().get(m) + "\n"); // print in alphabetical order
        }

/* ----------------------------------------------------------------------------------------------------------------- */
        for (int i = 0; i < Main.getNames14().size(); i++) { // iterate through names array list
            for (int j = 0; j < i + 1; j++) {
                if (Main.getNames14().get(j).compareTo(Main.getNames14().get(i)) > 0) { // compare unicode value of elements in array list
                    // sort in alphabetical order
                    String temp14 = Main.getNames14().get(j); // assign getNames().get(j) to temp variable
                    Main.getNames14().set(j, Main.getNames14().get(i));
                    Main.getNames14().set(i, temp14);
                }
            }
        }
        System.out.println("\n♦ Customer names sorted (26.03.2020) :- \n");
        for (int m = 0; m <= Main.getNames14().size() - 1; m++){
            System.out.print((m+1) + ". " + Main.getNames14().get(m) + "\n"); // print in alphabetical order
        }
    }

/* ---------------------------------------------- Getters / Setters ------------------------------------------------- */

    // getters for seat arrays
    public static String[] getSeats1() {
        return seats1;
    }

    public static String[] getSeats2() {
        return seats2;
    }

    public static String[] getSeats3() {
        return seats3;
    }

    public static String[] getSeats4() {
        return seats4;
    }

    public static String[] getSeats5() {
        return seats5;
    }

    public static String[] getSeats6() {
        return seats6;
    }

    public static String[] getSeats7() {
        return seats7;
    }

    public static String[] getSeats8() {
        return seats8;
    }

    public static String[] getSeats9() {
        return seats9;
    }

    public static String[] getSeats10() {
        return seats10;
    }

    public static String[] getSeats11() {
        return seats11;
    }

    public static String[] getSeats12() {
        return seats12;
    }

    public static String[] getSeats13() {
        return seats13;
    }

    public static String[] getSeats14() {
        return seats14;
    }
}
