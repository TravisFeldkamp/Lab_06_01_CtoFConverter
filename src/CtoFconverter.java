import java.util.Scanner;// importing the scanner for user input

public class CtoFconverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fTemp = 0;//variable for fahrenheit
        double cTemp = 0;//variable for celsius
        String trash = "";//variable for if there is a bad input

        System.out.println("Enter the temperature in celsius ");
        if(in.hasNextDouble()) {//if a double is input continue with this code
            cTemp = in.nextDouble();//cTemp is declared as the user input
            fTemp = cTemp * 1.8 + 32;//using user input and equation for c to F to get F
            System.out.println("The temperature in fahrenheit is " + fTemp);//output to user with the temp in F
        }

        else {//if an invalid input occurs run this code block
            trash = in.nextLine();// incorrect input stored as trash variable
            System.out.println("That was not a correct input: " + trash) ;//output to user saying they entered a wrong input
            System.out.println("Run the program again and enter a valid temperature!");//output to user to try again
            System.exit(0);//kills program



        }
            if (fTemp == 32)// after temp is found see if it is equal to 32
                System.out.println("This is the freezing point");//if it is equal to 32 output this to user
            else if (fTemp == 212) {//check if temp is = 212
                System.out.println("This is the boiling point");//if true output this.

            }


    }
}