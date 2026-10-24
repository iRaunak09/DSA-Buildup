// package Functions and Methods;
import java.util.Scanner;

public class DecToBin {

    public static int decToBin(int n){
        int temp = n;
        int rem;
        int bin = 0;
        int counter = 0;

        while(temp > 0){
            rem = temp % 2;
            bin = bin + rem * (int)Math.pow(10, counter);
            temp /= 2;
            counter++;
        }

        return bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal value: ");
        int n = sc.nextInt();
        System.out.println(decToBin(n));
    }
}
