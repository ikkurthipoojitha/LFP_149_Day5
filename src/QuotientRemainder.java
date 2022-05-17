import java.util.*;

public class QuotientRemainder {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter numbers");
        int dividend = s.nextInt();
        int divisor = s.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("quotient :"+ quotient);
        System.out.println("remainder :"+ remainder);
    }
}
