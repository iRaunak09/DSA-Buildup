public class SumOfSubarrays {

    public static void sumOfSubarrays(int arr[]){
        int start = 0;
        int end;
        int ts = 0;

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            start = i;

            for(int j = i; j < arr.length; j++){
                end = j;
                System.out.print("[");

                for(int k = start; k <= end; k++){
                    // System.out.print(" " + arr[k] + " ");
                    sum += arr[k];
                }

                ts++;
                System.out.print(sum);
                System.out.print("]");
                if(sum > max){
                    max = sum;
                }
                if(sum < min){
                    min = sum;
                }
                sum = 0;

            }
            System.out.println();
        }
        System.out.println("Total number of subarrays: " + ts);
        System.out.println("Maximum sum: " + max);
        System.out.println("Minimun sum: " + min);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        sumOfSubarrays(arr);
    }
}
