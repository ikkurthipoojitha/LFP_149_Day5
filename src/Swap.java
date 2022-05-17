import java.util.Scanner;

public class Swap {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("enter numbers");
        int one = s.nextInt();
        int two = s.nextInt();

        System.out.println("Before swap");
        System.out.println("First number = " + one);
        System.out.println("Second number = " + two);

        one = one - two;
        two = one + two;
        one = two - one;

        System.out.println("After swap");
        System.out.println("First number = " + one);
        System.out.println("Second number = " + two);



    }
}

