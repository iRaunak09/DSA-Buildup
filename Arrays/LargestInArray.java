// package Arrays;

public class LargestInArray {

    public static int getLargest(int arr[]){
        int largest = Integer.MIN_VALUE;

        // Linear Search
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,6,9,5};
        int largest = getLargest(arr); 
        System.out.println(largest);
    }
}

// Time Complexity -> O(n)
