package cpit251_group2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DomesticServieceWorkerApp {

    public static String readLine;
    public static Scanner input = new Scanner(System.in); // read input from the client

    public static void main(String[] args) throws FileNotFoundException, IOException {

        ////////////////////////////// Application login interface /////////////////////////////////////////////////////
        //String state = "true"; // make the app open
        while (true) {

            System.out.println("----- Domestic Serviece Worker -----");
            System.out.println("----- Welcome Dear Client -----");
            String serviece;
            System.out.println("\nYou need a serviece? yes/no");
            serviece = input.next();

            if (serviece.matches("yes")) {
                UserInformation();
                System.out.println("\nThis is our services ");
                WorkerMenu(mainMenu());
                System.exit(0);

            } else if (serviece.matches("no")) {
                System.out.println("\nThank you for visitting. You can find us whenever you need us "
                        + "\n                 ----- bye bye !! ----- ");
                System.exit(0);
            } else {
                System.out.println("The data entered is Incorrect! \n Please choose yes or no ! \n ");
            }
        }
    } // end main method //

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////// Methods //////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void UserInformation() throws FileNotFoundException {
        ////////////////////////////// User Info /////////////////////////////////////////////////////
        Client client;

        PrintWriter output = new PrintWriter("client.txt");
        System.out.println("Please enter your information :-\n");
        System.out.println("Please enter your Full Name: ");
        input.nextLine();
        String username = input.nextLine(); // Variable to receive username from client

        output.println(username);
        System.out.println("Please enter your Email: ");
        String email = input.next(); // variable to receive email from client
        output.println(email);
        System.out.println("Please enter your Phone Number: ");
        String phone = input.next(); // Variable to receive phone from client
        output.println(phone);
        client = new Client(username, email, phone);
        System.out.println(client.toString());
        output.close();
    }

    private static String mainMenu() throws IOException {
        String Schoice; // user choice of serviece 

        System.out.println("\nPlease select your service from the Main Menu below :");
        System.out.println("a : Plumber ");
        System.out.println("b : Electrician ");
        System.out.println("c : Carpenter");
        System.out.println("d : Exit");
        Schoice = input.next();
        WorkerMenu(Schoice);
        System.exit(0);
        return Schoice;
    }

    private static void WorkerMenu(String Schoice) throws FileNotFoundException, IOException {

        /////////////////////////// Save worker information from the file ////////////////////////////////////////////
        String WorkerName; // name
        String workerPhone; // phone
        String workerEmail; // email
        String price; // price per houre
        String workerEvaluation; // Evaluation
        ////////////////////////////////// Save customer choice into variables ///////////////////////////////////////
        String Wchoice; // user choice of Worker
        String Wname = null; // Worker name
        String Wtime = null; // user choice of visit time
        String SchoiceW = null; // Convert the customer's choice into a word
        /////////////////////////////////////// Variable from Worker class ///////////////////////////////////////////
        Worker worker; // send worker information to Worker class
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        if (Schoice.matches("a")) {
            SchoiceW = "Plumber";

            System.out.println("Here is a list of Plumber Workers availble ");
            System.out.println("1 . Ahmed Fadel ( 10:00AM ) ***");
            System.out.println("2 . Ahmed Fadel ( 11:00AM ) ***");
            System.out.println("3 . Mohammad Khan ( 4:00PM )****");
            System.out.println("4 . Mohammad Khan ( 6:00PM )****");

            Wchoice = input.next();

            if (Wchoice.matches("1")) {
                Wname = "Ahmed Fadel";
                Wtime = "10:00AM";

            } else if (Wchoice.matches("2")) {
                Wname = "Ahmed Fadel";
                Wtime = "11:00AM";

            } else if (Wchoice.matches("3")) {
                Wname = "Mohammad Khan";
                Wtime = "4:00PM";

            } else if (Wchoice.matches("4")) {
                Wname = "Mohammad Khan";
                Wtime = "6:00PM";

            } else {
                System.out.println("\n Please Choose from the list !! \n");
                WorkerMenu(Schoice);
            }

        } else if (Schoice.matches("b")) {
            SchoiceW = "Electrician";
            System.out.println("Here is a list of Electrician Workers availble ");
            System.out.println("1 . Saleh Saad ( 11:00AM ) *****");
            System.out.println("2 . Raj Babo ( 12:00PM ) **");
            System.out.println("3 . Ali Eqbal ( 8:00PM ) ***");
            Wchoice = input.next();
            if (Wchoice.matches("1")) {
                Wname = "Saleh Saad";
                Wtime = "11:00AM";

            } else if (Wchoice.matches("2")) {
                Wname = "Raj Babo";
                Wtime = "12:00PM";

            } else if (Wchoice.matches("3")) {
                Wname = "Ali Eqbal";
                Wtime = "8:00PM";

            } else {
                System.out.println("\n Please Choose from the list !! \n");
                WorkerMenu(Schoice);
            }

        } else if (Schoice.matches("c")) {
            SchoiceW = "Carpenter";

            System.out.println("Here is a list of Carpenter Workers availble ");
            System.out.println("1 . Khalel Samer ( 1:00PM ) ****");
            System.out.println("2 . Mohammed Ali ( 7:30PM ) ***");
            Wchoice = input.next();

            if (Wchoice.matches("1")) {
                Wname = "Khalel Samer";
                Wtime = "1:00PM";

            } else if (Wchoice.matches("2")) {
                Wname = "Mohammed Ali";
                Wtime = "7:30PM";

            } else {
                System.out.println("\n Please Choose from the list !! \n");
                WorkerMenu(Schoice);
            }
        } else if (Schoice.matches("d")) {
            System.out.println("\nThank you for visitting. You can find us whenever you need us "
                    + "\n                 ----- bye bye !! ----- ");
            System.exit(0);

        } else {

            System.out.println("\n Please Choose from the list !! \n");
            mainMenu();
        }
        if (Schoice.matches("a") || Schoice.matches("b") || Schoice.matches("c")) {
            ////////////////////////////// Read workers Informations and print it to the cilent //////////////////////////////
            Scanner scanner = new Scanner(new File("Workers_DS.txt"));
            while (scanner.hasNextLine()) {
                readLine = scanner.nextLine();
                if ((readLine.matches(Wname))) {
                    WorkerName = readLine;

                    readLine = scanner.next();
                    workerPhone = readLine;

                    readLine = scanner.next();
                    workerEmail = readLine;

                    readLine = scanner.next();
                    price = readLine;

                    readLine = scanner.next();
                    workerEvaluation = readLine;

                    worker = new Worker(WorkerName, workerPhone, workerEmail, price, Wtime, workerEvaluation);

                    //////////////////////////// Confirmation of the request by the client ////////////////////////////
                    if (confirmationRequest()) {
                        ////////////////////////////////////////// print Invoice //////////////////////////////////////////
                        System.out.println("\n ----------------------------- Invoice -----------------------------");
                        System.out.println("\n ------------- The service you choice is: " + SchoiceW + " -------------");
                        System.out.println(worker.toString());
                        break;
                    } else {
                        System.out.println("\n Thank you for browsing our Application. Please visit us when you need our services.");
                        System.exit(0);
                    }

                } else {
                    readLine = scanner.nextLine();
                }
            }
            scanner.close();
        }
        System.out.println(" --------------- Thank you for using our Servecies ----------------");
        System.out.println(" ------------------------------------------------------------------");
        System.exit(0);

    } // end WorkerMenu method //

    private static boolean confirmationRequest() {
        System.out.println(" Do you want to confirm your order? \n yes to confirm, no to exit the program");
        String Choose = input.next();
        if (Choose.matches("yes")) {
            return true;
        } else {
            return false;
        }
    }

} // end DomesticServieceWorkerApp class //
