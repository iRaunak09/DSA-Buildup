// package Patterns;

public class InvertedStar {
    public static void main(String[] args) {
        // for(int i = 4; i > 0; i--){
        //     for(int j = 0; j < i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // Another version 
        int n = 7;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
