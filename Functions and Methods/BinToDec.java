// package Functions and Methods;
import java.util.Scanner;

public class BinToDec {

    public static int binToDec(int n){
        int counter = 0;
        int digit;
        int decimal = 0;
        int temp = n;

        while (temp > 0){
            digit = temp % 10;
            if(digit == 1){
                decimal += Math.pow(2, counter);
            }
            counter++;
            temp /= 10;

        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        System.out.println(binToDec(n));

    }
}
