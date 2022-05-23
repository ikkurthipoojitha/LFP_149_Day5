package Functional;

import java.util.Scanner;
public class Distance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Distance from (0, 0) to (" +x + ", " + y + ") is " + distance);

    }
}

