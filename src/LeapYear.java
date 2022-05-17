import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int number = s.nextInt();
        boolean leap = false;
        int length = 0;
        long temp = 1;
        while (temp <= number) {
            length++;
            temp *= 10;
        }
        //System.out.println(length);

        if (length == 4){
            if (number % 4 == 0) {

                if (number % 100 == 0) {

                    if (number % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }

                else
                    leap = true;
            }

            else
                leap = false;

            if (leap)
                System.out.println(number + " is a leap year.");
            else
                System.out.println(number + " is not a leap year.");
        }
        else {
            System.out.println("not a 4 digit number, cant calculate leap year");

        }
    }
}
