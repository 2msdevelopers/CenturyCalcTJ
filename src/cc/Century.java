package cc;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Century {

    public Century() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Scanner to take year entered and output year.java
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter year then press enter to find century:");
        int year1;
        char choice;

        //try catch to prevent invalid characters being entered and allowing for a handling process
        try {
            year1 = readme.nextInt();
            Year year = new Year(year1);
            year.displayYear();
            year.displayCentury();
        } catch (InputMismatchException ex) {
            //println's below because there is already an error message in the if statement if y or n not entered
            /*System.out.println("This value is not valid, please enter a year.");
            System.out.println("Would you like to enter a new year? (Y/N)");*/
        }
        //do while loop to allow for the program to continue running as long as the user wishes along with continued inputmismatch handling
        do {
        {
            choice = readme.next().charAt(0);
        }
        {
            if ((choice == 'y') || (choice == 'Y')) {
                System.out.println("Please enter the new year you wish to find the century for:");
                    try {
                        year1 = readme.nextInt();
                        Year year = new Year(year1);
                        year.displayYear();
                        year.displayCentury();
                    } catch (InputMismatchException ex) {
                        //println's below because there is already an error message in the if statement if y or n not entered
                        /*System.out.println("This value is not valid, please enter a year.");
                        System.out.println("Would you like to enter a new year? (Y/N)");*/
                    }
            } else if ((choice == 'n') || (choice == 'N')) {
                break;
                //System.out.println("Thank you for using this tool.");
            } else {
                System.out.println("This character is invalid, would you like to enter a new year? (Y/N)");
            }
        }
    } while (true);
        System.out.println("Thank you for using this tool.");
}
}