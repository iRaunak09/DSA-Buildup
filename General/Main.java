public class Main {
    public static void main(String[] args) {
        int a = 121;
        int b = 9;
        int c = 60;

        // Approach1

        // if(a > b){
        //     if(a > c){
        //     }else {
        //         System.out.println(c);
        //     }
        // }else {
        //     if(b > c){
        //         System.out.println(b);
        //     }else {
        //         System.out.println(c);
        //     }
        // }

        // Approach2
        if(a >= b && a >= c){
            System.out.println(a);
        }else if(b >= c){
            System.out.println(b);
        }else {
            System.out.println(c);
        }

    }
}
