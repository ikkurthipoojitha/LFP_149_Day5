package Functional;

import java.util.Arrays;
import java.util.Scanner;

public class Triplets {
    static void findTriplets(int arr[], int n)
    {
        boolean found = false;

        Arrays.sort(arr);

        for (int i=0; i<n-1; i++)
        {
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];
            while (l < r)
            {
                if (x + arr[l] + arr[r] == 0)
                {
                    System.out.print(x + " ");
                    System.out.print(arr[l]+ " ");
                    System.out.println(arr[r]+ " ");

                    l++;
                    r--;
                    found = true;
                }


                else if (x + arr[l] + arr[r] < 0)
                    l++;

                else
                    r--;
            }
        }

        if (found == false)
            System.out.println(" No Triplet Found");
    }

     public static void main (String[] args) {

        Scanner s = new Scanner(System.in);
         //int n=s.nextInt();
         //int[] arr = new int[10];
        // System.out.println("Enter the elements of the array: ");

         //for(int i=0; i<n; i++)
         //{
         //  arr[i]=s.nextInt();
         //}
         int arr[] = {-1,1,-2,3};
         int n = arr.length;
         findTriplets(arr, n);
    }
}

