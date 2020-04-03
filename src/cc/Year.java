package cc;

import java.util.InputMismatchException;

public class Year {

    int year = 0;


    public int getCentury() {

        try {
            if (year == 0) {
                return 0;
            } else if (year < 0) {
                //throw new added to prevent negative numbers being entered into the century calculator.
                throw new IllegalArgumentException("Value must be non-negative.");
            } else if (year <= 100) {
                return 1;
            } else if (year % 100 == 0) {
                return (year / 100);
            } else {
                return (year / 100) + 1;
            }
        } catch (IllegalArgumentException i) {
            System.out.println("The year entered must not be negative.");
        }
    return 0; }

    public void displayYear () {
        System.out.println("The year you have entered is: " + year);
    }

    public void displayCentury () {
        //Block comment below was an attempt to handle the endings on different centuries opted for the below option which will need updating to allow for all numbers
        /*Interger parse.int

          System.out.println("The Century is " + getCentury() + "st");
            } else if (str1.contains(2)) {
                System.out.println("The Century is " + getCentury() + "nd");
            } else if (str1.contains(3)) {
                System.out.println("The Century is " + getCentury() + "rd");
            } else {
                System.out.println("The Century is " + getCentury() + "th");
            }
        }*/
        int century = getCentury();

            if (century == 1 || century == 21) {
                System.out.println("The century for the given year is: " + century + "st");
            } else if (century == 2 || century == 22) {
                System.out.println("The century for the given year is: " + century + "nd");
            } else if (century == 3 || century == 23) {
                System.out.println("The century for the given year is: " + century + "rd");
                //} else if (century == 21) {
                //System.out.println("The Century is " + century + "st");
            } else if (century == 0){
                System.out.println("The century for the given year is not available.");
            } else {
                System.out.println("The century for the given year is: " + century + "th");
            }

            System.out.println("Would you like to enter a new year? (Y/N)");
        }

    public long getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Year() {
        // TODO Auto-generated constructor stub
    }

    public Year(int startYear) {
        year = startYear;
    }
}
