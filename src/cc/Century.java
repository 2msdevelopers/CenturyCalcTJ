package cc;

import java.util.Scanner;

public class Century {

    public Century() {
        // TODO Auto-generated constructor stub
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        //Scanner
        Scanner readme = new Scanner(System.in);
        System.out.println("Enter year then press enter to find century:");
        //two variables to hold numbers
        int year1, display;
        year1 = readme.nextInt();
        display = year1;
        //System.out.println("Total = " + year);

        //int count = 0;
        int givenYear = year1;

        //for (int i=startYear; i<= endYear; i++) {

        //blankLine("counter "+ count++);
        Year year = new Year(year1);
        year.displayYear();
        year.displayCentury();
        //blankLine();
    }
}

// private static void blankLine() {
// System.out.println();
//
//  private static void blankLine(String string) {
//     System.out.println(string);
//   }
//}