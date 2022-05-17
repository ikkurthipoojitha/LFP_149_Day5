import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args){
        float harmonic = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = sc.nextInt();

        // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
        for (int i = 2; i <= number; i++) {
            harmonic += (float)1 / i;
        }
        System.out.print(harmonic);

    }
}
