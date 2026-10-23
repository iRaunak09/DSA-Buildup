import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean b = false;
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if(n <= 2 && n > 0){
            b = true;
        }else if (n > 2){
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    b = false;
                    break;
                }
            }
        }

        if(b){
            System.out.println("Prime");
        }else {
            System.out.println("Not prime");
        }
    }
}
