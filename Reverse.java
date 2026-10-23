import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int temp = n;
        int digit;
        int reverse = 0;

        while (temp != 0){
            digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println(reverse);
    }
}
