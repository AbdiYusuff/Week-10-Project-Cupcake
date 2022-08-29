import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

//Create a new file named Order.java.
//
//        In this file, create a public constructor function named Order
//        with the following parameters: an ArrayList of Cupcake objects
//        named cupcakeMenu, and an ArrayList of Drink objects named drinkMenu.
public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink> drinkMenu){

        //**************************Greeting***********************************

        //    Print “Hello customer. Would you like to place an order? (Y or N)”.
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");

        //    Create a Scanner object to accept the users input, and assign the input to a
//    String variable named placeOrder.
        Scanner input = new Scanner(System.in);
        String placeOrder = input.nextLine();

        //    Create an Arraylist of Objects and name it order.
        //    Note: we are creating an ArrayList of Objects so any objects can be
        //    added to the ArrayList - they do not have to all be the same type.
        ArrayList<Object> order = new ArrayList<Object>();

        //    Set up a conditional statement as follows:
        //    Checks if placeOrder equals Y ignoring capitalization.
//    Leave the inside of the block blank for now.
//    In the else block, print “Have a nice day then.”

        if(placeOrder.equalsIgnoreCase("Y")){


//**************************************************************************
//********************************Inside the If Statement***********************
//Add LocalDate.now() to order.
            order.add(LocalDate.now());

//        Add LocalTime.now() to order.
            order.add(LocalTime.now());
//
//        Print “Here is the menu.”
            System.out.println("Here is the menu");
//
//        Print “CUPCAKES:”
            System.out.println("Cupcakes");
//
//        Create an int variable named itemNumber and set it equal to 0.
            int itemNumber = 0;
//
//        Create a for loop that iterates through each index of the cupcakeMenu ArrayList.
            for(int i = 0; i<drinkMenu.size(); i++)
            {
                //Inside the for loop, increment itemNumber by one.
                itemNumber++;
                //        Print itemNumber.
                System.out.println(itemNumber + ".");

                //        Output the type of cupcake at cupcakeMenu at i by calling the type() method.
                cupcakeMenu.get(i).type();
//
//        Print “Price: “ with the price being the price of that cupcake.
                System.out.println("Price: " + cupcakeMenu.get(i).getPrice());
//
//        Print a new line.
                System.out.println();
//
//        Print “DRINKS:”
                System.out.println("DRINKS");
//
//        Create a for loop that iterates through each index of the drinkMenu ArrayList.
                for(int j = 0; j < drinkMenu.size(); j++){
                    //        Print itemNumber.
                    System.out.println(itemNumber);

                    //        Output the type of drink at drinkMenu at i by calling the type() method.
                    drinkMenu.get(j).type();

                    //        Print “Price: “ with the price being the price of that drink.
                    System.out.println("Price: " + drinkMenu.get(j).getPrice());

                    //        Print a new line.
                    System.out.println();
                }
            }
        } else
        { System.out.println("Have a nice day then.");}

//        Create a boolean variable named ordering and set it equal to true.
        boolean ordering = true;
//
//                Create a while loop that continues as long as the value of ordering is true.
        while (ordering = true){ continue;}
//
//                Print “What would you like to order? Please use the number associated with each item to order.”
        System.out.println("What would you like to order?" + "\nPlease use the number associated with each item to order");
//
//        Create an int variable named orderChoice and set it equal to input.nextInt().
        int orderChoice = input.nextInt();
//
//                Call input.nextLine() to correct the terminal scanner input location.
        input.nextLine();
//
//                Create an if statement that checks if orderChoice equals 1. If so, add the first item from
//                the cupcakeMenu ArrayList to the order ArrayList and print “Item added to order”.
        if(orderChoice == 1){
            order.add(cupcakeMenu.get(0));
            System.out.println("Item added to order");
        }
//
//        Add an else if statement that checks if orderChoice equals 2. If so, add the second item
//        from the cupcakeMenu ArrayList to the order ArrayList and print “Item added to order”.
        else if(orderChoice == 2){
            order.add(cupcakeMenu.get(1));
            System.out.println("Item added to order");}
//
//        Do the same for orderChoice being equal to 3, 4, 5, or 6 with the appropriate item
//        being added to the order ArrayList.
        else if(orderChoice == 3){
            order.add(cupcakeMenu.get(2));
            System.out.println("Item added to order");}
        else if(orderChoice == 4){
            order.add(cupcakeMenu.get(3));
            System.out.println("Item added to order");}
        else if(orderChoice == 5){
            order.add(cupcakeMenu.get(4));
            System.out.println("Item added to order");}
        else if(orderChoice == 6){
            order.add(cupcakeMenu.get(5));
            System.out.println("Item added to order");}
//
//        Finally, add an else statement if the user’s input is something else. In the else block,
//        print “Sorry, we don’t seem to have that on the menu.”
        else{System.out.println("Sorry, we don't seem to have that on the menu");}

//
//        Print “Would you like to continue ordering? (Y/N)”
        System.out.println("Would you like to continue ordering? (Y/N)");
//
//        Set the String object named placeOrder equal to input.nextLine().
        placeOrder = input.nextLine();
//
//                Create an if statement that checks if placeOrder does NOT equal Y ignoring capitalization.
//                If so, set ordering equal to false.
        if(!placeOrder.equalsIgnoreCase("Y")){ordering = false;}


        //**********************************************************************************************
        //******************************* Part 4 *****************************************************

//        **************************** Receipt ********************************************************

//        Let’s generate a receipt of all the items the customer ordered. We will start in Order.java after the while loop.
//
//                Print the first item in the order ArrayList.
        System.out.println(order.get(0));

//        Print the second item in the order ArrayList.
        System.out.println(order.get(1));

//Create a double variable named subtotal and initialize it to 0.0.
        double subTotal = 0.0;

//    Create a for loop that starts at i = 2 and continues incrementing by 1, while i is less than the order size.
        for(int i = 2; i<order.size();i++) {
//            In the for loop:
//Check if order at i is equal to cupcakeMenu at 0. If so:
//Get the value of cupcakeMenu at index 0, and run the type() method on the Cupcake object.

            if (order.get(i).equals(cupcakeMenu.get(1))) {
                cupcakeMenu.get(0).type();

                //Using the getPrice() method, print the price of that cupcake.
                System.out.println(cupcakeMenu.get(0).getPrice());

                //Set subtotal equal to subtotal plus the price of the cupcake.
                subTotal = subTotal + cupcakeMenu.get(0).getPrice();
            }

//            Repeat this step, checking if the order at i is equal to
//            cupcakeMenu at index 1, 2, drinkMenu at index 0, 1, or 2,
//            and printing the price and updating the subtotal accordingly.
            else if (order.get(i).equals(cupcakeMenu.get(1))) {

                // Print the type of cupcake at cupcakeMenu index 0
                cupcakeMenu.get(1).type();

                // Print the price of cupcake at cupcakeMenu index 0
                System.out.println(cupcakeMenu.get(1).getPrice());

                //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                subTotal = subTotal + cupcakeMenu.get(1).getPrice();

            }
            //check if order at i is equal to cupcakeMenu at 2
            else if (order.get(i).equals(cupcakeMenu.get(2))) {
                // Print the type of cupcake at cupcakeMenu index 0
                cupcakeMenu.get(2).type();

                // Print the price of cupcake at cupcakeMenu index 0
                System.out.println(cupcakeMenu.get(2).getPrice());

                //Set subtotal equal to subtotal plus cupcakeMenu getPrice at 0
                subTotal = subTotal + cupcakeMenu.get(2).getPrice();
            }
            // Check if order at i is equal to drinkMenu at 0
            else if (order.get(i).equals(drinkMenu.get(0))) {
                // Print the type of drink at drinkMenu index 0
                drinkMenu.get(0).type();

                // Print the price of drink at drinkMenu index 0
                System.out.println(drinkMenu.get(0).getPrice());

                //Set subtotal equal to subtotal plus drinkMenu getPrice at 0
                subTotal = subTotal + drinkMenu.get(0).getPrice();
            }
            // Check if order at i is equal to drinkMenu at 1
            else if (order.get(i).equals(drinkMenu.get(1))) {
                // Print the type of drink at drinkMenu index 1
                drinkMenu.get(1).type();

                // Print the price of drink at drinkMenu index 0
                System.out.println(drinkMenu.get(1).getPrice());

                //Set subtotal equal to subtotal plus drinkMenu getPrice at 0
                subTotal = subTotal + drinkMenu.get(1).getPrice();
            }
            // Check if order at i is equal to drinkMenu at 2
            else if (order.get(i).equals(drinkMenu.get(2))) {
                // Print the type of drink at drinkMenu index 2
                drinkMenu.get(2).type();

                // Print the price of drink at drinkMenu index 2
                System.out.println(drinkMenu.get(2).getPrice());

                //Set subtotal equal to subtotal plus drinkMenu getPrice at 2
                subTotal = subTotal + drinkMenu.get(2).getPrice();

            }
        }
        // Print subtotal
        System.out.println("$" + subTotal + "\n");

        // Create a new CreateFile()
        new CreateFile();
        // Create a new WriteToFile() with the parameter order
        new WriteToFile(order);

        }

    // Create a class named CreateFile
        class CreateFile {

        // Create a public constructor function
            public CreateFile(){
                // Create a try catch block, with a catch parameter of IOException e
                try{
                    // Create a File object named salesData and set it equal to a new File
                    // with the parameter "salesData.txt"
                    File salesData = new File("SalesData.txt");

                    // Create an if statement with that parameter salesData.createNewFile()
                    // .createNewFile() will return true if a new file is created
                    if(salesData.createNewFile()){
                        System.out.println("File created: " + salesData.getName());
                    } else {System.out.println("File already exists");}

                }
                catch (IOException e){System.out.println("An error occurred");}

            }
        }

//        Create a class named WriteToFile after the class CreateFile.

    class WriteToFile {
        //Create a public constructor function named WriteToFile(), with ArrayList<Object> order as the parameter.
        public WriteToFile(ArrayList<Object> order){

            //Create a try catch block, with a catch parameter of IOException e.
            try{
                //In the try block, create a new FileWriter object named fw, and set it equal to
// new FileWriter object whose constructor parameters are the name of the object, “salesData.txt”,
// and the boolean true, which is an option that allows for appending to the file.
                FileWriter fw = new FileWriter("salesData.txt", true);

                //Create a new PrintWriter object named salesWriter, and set it equal to new PrintWriter
// object whose constructor parameter is the FileWriter object fw created previously.
                PrintWriter salesWriter = new PrintWriter(fw);

                // Print each value in order.
                for (int i = 0; i < order.size(); i++) {
                    salesWriter.println(order.get(i));
                }

                // Stop the writer from continuing to run
                salesWriter.close();

                System.out.println("Successfully wrote to the file");


            }
            catch (IOException e)
            {
                System.out.println("An error occurred");
            }

        }
    }

}



