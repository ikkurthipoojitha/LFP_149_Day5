import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        System.out.println("enter a number");
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int result=1;
        System.out.println("2 power 0 is 1");
        for(int i=1;i<=n;i++){
            result = result * 2;
            System.out.println("2 power "+i+" is "+result);
        }

    }
}
