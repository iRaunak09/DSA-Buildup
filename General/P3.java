import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Ente a number");
            num = sc.nextInt();
        }while(num % 10 != 0);

        System.out.println("You entered a multiple of 10");
    }
}
