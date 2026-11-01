public class ReverseArray {

    public static void reverseArray(int arr[]){

        int first = 0;
        int last = arr.length - 1;
        int temp;

        while(first < last){
            // swapping 
            temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;

        }

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        reverseArray(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }   
}

// Time Complexity -> O(n)
// Space Complexity -> O(1)
