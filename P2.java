public class P2 {
    public static void main(String[] args) {
        int a = 11;
        int b = 9;
        int c = 60;

        if(a > b){
            if(a > c){
            }else {
                System.out.println(c);
            }
        }else {
            if(b > c){
                System.out.println(b);
            }else {
                System.out.println(c);
            }
        }


        // else if(b > c){
        //     if(b > a){
        //         System.out.println(b);
        //     }else {
        //         System.out.println(a);
        //     }
        // }
        // else if(c > a){
        //     if(c > b){
        //         System.out.println(c);
        //     }else {
        //         System.out.println(b);
        //     }
        // }


    }
}
