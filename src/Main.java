import javax.annotation.processing.SupportedSourceVersion;
import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        //*******************************************Object Declaration***************************************
//In the file Main.java, inside public static void main(String[] args):
//
//        Create a new ArrayList which contains Cupcake objects and name it cupcakeMenu.
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
//
//                NOTE: If you have not imported java.util.ArrayList at the top of your file,
//                please do so now to avoid errors.
//
//        Create a new Cupcake object named cupcake.
        Cupcake cupcake = new Cupcake();
//
//        Create a new RedVelvet object named redVelvet.
        RedVelvet redVelvet = new RedVelvet();
//
//        Create a new Chocolate object named chocolate.
        Chocolate chocolate = new Chocolate();

        //        ******************************************Pricing***********************************
//        Print “We are in the middle of creating the cupcake menu. We currently
//        have three cupcakes on the menu but we need to decide on pricing.”
        System.out.println("We are in the middle of the cupcake menu" + "\n We currently " +
                        "have three cupcake on the menu but we need to decide on pricing");
//
//        Create a Scanner object named input so we can accept the user’s input.
//        Note: you may have to import a library if you haven’t yet!

        Scanner input = new Scanner(System.in);
//
//                Print “We are deciding on the price for our standard cupcake. Here is the description:”
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
//
//        Call the method cupcake.type() to get the description of the standard cupcake
        cupcake.type();

//
//        Print “How much would you like to charge for the cupcake?
//        (Input a numerical number taken to 2 decimal places)”.
        System.out.println("How much would you like to charge for the cupcake?\n" +
                "(Input a numerical number taken to 2 decimal places)");
//
//        Create a String variable named priceText and assign it to the value of input.nextLine().
        String priceText = input.nextLine();
//
//                Note: we are accepting the price as a String named priceText
//                so we can convert it into a double later, just for practice.
//
//                Create a double variable named price and set it equal to Double.parseDouble(priceText).
        Double price = Double.parseDouble(priceText);
//
//                Now that we have the decided price, we can call the method cupcake.setPrice()
//                with the parameter of price.
        cupcake.setPrice(price);
//
//                Repeat steps 3 - 9 for the redVelvet cupcake and chocolate cupcake.
//                That is, ask the user how much they would like to charge for the cupcake,
//                get the user input, and call setPrice() with the value of the user input.
//
//        ***********************  redVelvet  ***************************
        System.out.println("We are deciding on the price for our standard red Velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        redVelvet.setPrice(price);

//        ***********************  Chocolate ***************************
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description: ");
        chocolate.type();
        System.out.println("How much would you like to charge for the cupcake?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        chocolate.setPrice(price);
//
//                Now, add each of these Cupcake objects to the cupcakeMenu ArrayList.
        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);

//        *************************************************************************************
//        ****************************** Object Declaration ***********************************
//        In the file Main.java, inside public static void main(String[] args):
//
//        Create a new ArrayList which contains Drink objects and name it drinkMenu.
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
//
//        Create a new Drink object named water.
        Drink water = new Drink();
//
//                Create a new Soda object named soda.
        Soda soda = new Soda();
//
//                Create a new Milk object named milk.
        Milk milk = new Milk();
        //        *************************************************************************************
//        ****************************** Pricing ***********************************
//
//        Following the same instructions in Step 5 of Part 1 to ask users to price the water,
//                soda, and milk objects you’ve created.
//            ***********************  water ***************************
        System.out.println("We are deciding on the price for our water. Here is the description: ");
        water.type();
        System.out.println("How much would you like to charge for the water?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        water.setPrice(price);
        //            ***********************  soda ***************************
        System.out.println("We are deciding on the price for our soda. Here is the description: ");
        soda.type();
        System.out.println("How much would you like to charge for the soda?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        soda.setPrice(price);
        //            ***********************  milk ***************************
        System.out.println("We are deciding on the price for our milk. Here is the description: ");
        milk.type();
        System.out.println("How much would you like to charge for the milk?" +
                "\n(Input a numerical number taken to 2 decimal places)");
        priceText = input.nextLine();
        price = Double.parseDouble(priceText);
        milk.setPrice(price);
//
//        Then, add these objects to the ArrayList drinkMenu.
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupcakeMenu, drinkMenu);

    } }


//        In the file Main.java, but after public class Main:
//        Create a new class named Cupcake. This will be the class
//        all other cupcakes inherit from.
class Cupcake {

    //        Create a public double variable named price,
//        but do not assign it a value.
    public double price;

    //                Create a public function named getPrice that has no
//        parameters and returns the price.
    public double getPrice() {
        return price;
    }

    //                Create a public function named setPrice that takes in
//        one parameter, a double named price, and returns void.
    public void setPrice(double price) {

        //                In the setPrice function, assign this.price the value
//        of the parameter price.
        this.price = price;
    }

    //        Create a public function named type that prints “A basic,
//        generic cupcake, with vanilla frosting” and returns void.
    public void type() {
        System.out.println("A basic,\n" +
                "generic cupcake, with vanilla frosting");
    }

}

//        *******************************Cupcake Variants****************************************

    //        Create a new class named RedVelvet that inherits from the Cupcake class you created.
//        What methods does the RedVelvet class inherit from the Cupcake class?
    //getPrice() and setPrice() are inherited by RedVelvet
    class RedVelvet extends Cupcake{

        //        Because the getPrice() and setPrice() methods are inherited and have the same
//        behavior for all cupcakes, they do not need to be defined in the RedVelvet class.
//        However, the type() method should have different behavior.
//        Create a public function named type that returns void and prints “A red velvet
//        based cupcake, with cream cheese frosting.” This will override the behavior
//        of the inherited method.

        public void type() {
            System.out.println("A red velvet\n" +
                    "based cupcake, with cream cheese frosting.");
        }

    }

    //        Repeat these steps for a new class named Chocolate that inherits from the Cupcake class.
//        The type() method should return void and print “A chocolate based cupcake, with chocolate frosting.
    class Chocolate extends Cupcake{
        public void type(){
            System.out.println("A chocolate based cupcake, with chocolate frosting.");
        }
    }

//*****************************************Implementation of Parent Class*********************************************
//In Main.java, but after class Chocolate, create a new class named Drink,
// which the other drink classes will inherit from.
// It should have a public double variable named price that doesn’t have an initial value,
// and methods getPrice(), setPrice(), and type().
class Drink {
    // Create a public double variable named price, but do not assign it a value
    public double price;

    // Create a public function named getPrice that has no parameters and returns the price
    public double getPrice() {
        return price;
    }

    // Create a public function named setPrice that has one parameter, a double named price, and returns void
    public void setPrice(double price) {
        this.price = price;
    }

    // Create a public function named type that prints a description and returns void
    public void type()
    {
        System.out.println("A bottle of water");
    }
}
//        ***************************************************************************************
//        ************************** Child Classses ********************************************
class Soda extends Drink{
    //            Create a public function named type that returns void and prints “A bottle of soda.”
//            This will override the behavior of the inherited method.
    public void type() {
        System.out.println("A bottle of soda.");
    }
}

//        Repeat these steps for a new class named Milk that inherits from the Drink class.
//        The type() method should return void and print “A bottle of milk.”
class Milk extends Drink{
    public void type(){
        System.out.println("A bottle of milk");
    }
}













