public class Subarrays {

    public static void printSubarrays(int arr[]){
        int start = 0;
        int end;
        int ts = 0;

        for(int i = 0; i < arr.length; i++){
            start = i;

            for(int j = i; j < arr.length; j++){
                end = j;
                System.out.print("[");

                for(int k = start; k <= end; k++){
                    System.out.print(" " + arr[k] + " ");
                }

                ts++;
                System.out.print("]");

            }
            System.out.println();
        }
        System.out.println("Total number of subarrays: " + ts);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubarrays(arr);
    }
}
