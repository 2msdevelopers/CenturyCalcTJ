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
            System.out.println("The Century is " + century + "st");
        } else if (century == 2 || century == 22) {
            System.out.println("The Century is " + century + "nd");
        } else if (century == 3 || century == 23) {
            System.out.println("The Century is " + century + "rd");
        //} else if (century == 21) {
            //System.out.println("The Century is " + century + "st");
        } else {
            System.out.println("The Century is " + century + "th");
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
