package Arrays;

public class PairsInArray {

    public static void pairsInArray(int arr[]){
        int current;
        int np = 0;

        for(int i = 0; i < arr.length; i++){
            current = arr[i];
            for(int j = i + 1; j < arr.length; j++){
                System.out.print("(" + current + "," + arr[j] + ") ");
                np++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs: " + np);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        pairsInArray(arr);
    }
}

// Time Complexity -> O(n^2)