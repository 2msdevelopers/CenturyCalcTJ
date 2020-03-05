package cc;

public class Year {

    int year = 0;


    public int getCentury() {
        /*if (year <= 100) {
            return 1;
        } else {
            return (year /100)+1;
        }*/

        if (year <= 0) {
            return 0;
        } else if (year <= 100) {
            return 1;
        } else if (year % 100 == 0){
            return (year /100);
        } else {
            return (year / 100) + 1;
        }
    }

    public void displayYear () {
        System.out.println("The Year is " + year);
    }

    public void displayCentury () {
        /*String str1 = getCentury();
            if (str1.contains(1)) {
                System.out.println("The Century is " + getCentury() + "st");
            } else if (str1.contains(2)) {
                System.out.println("The Century is " + getCentury() + "nd");
            } else if (str1.contains(3)) {
                System.out.println("The Century is " + getCentury() + "rd");
            } else {
                System.out.println("The Century is " + getCentury() + "th");
            }
        }*/

        if (getCentury() == 1 || getCentury() == 21) {
            System.out.println("The Century is " + getCentury() + "st");
        } else if (getCentury() == 2 || getCentury() == 22) {
            System.out.println("The Century is " + getCentury() + "nd");
        } else if (getCentury() == 3 || getCentury() == 23) {
            System.out.println("The Century is " + getCentury() + "rd");
        //} else if (getCentury() == 21) {
            //System.out.println("The Century is " + getCentury() + "st");
        } else {
            System.out.println("The Century is " + getCentury() + "th");
        }
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
