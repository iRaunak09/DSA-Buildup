// package Functions and Methods;
import java.util.Scanner;

// Check Prime using functions

public class CheckPrime {
    public static boolean checkPrime(int n){
        boolean isPrime = true;

        if(n == 0 || n < 0 || n == 1){
            isPrime = false;
        }else {
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(checkPrime(n)){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
