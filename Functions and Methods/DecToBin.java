// package Functions and Methods;
import java.util.Scanner;

public class DecToBin {

    public static int decToBin(int n){
        int temp = n;
        int rem;
        int revBin = 0;

        while(temp > 0){
            rem = temp % 2;
            revBin = revBin * 10 + rem;
            temp /= 2;
        }

        int bin = revNum(revBin);
        return bin;
    }

    public static int revNum(int n){
        int temp = n;
        int digit;
        int reverse = 0;

        while (temp != 0){
            digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal value: ");
        int n = sc.nextInt();
        System.out.println(decToBin(n));
    }
}
