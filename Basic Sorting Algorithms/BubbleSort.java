public class BubbleSort {
    
    public static void bubbleSort(int[] nums){
        int n = nums.length;

        for(int turn = 0; turn < n - 1; turn++){
            for(int j = 0; j < n - 1 - turn; j++){
                if(nums[j + 1] < nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5,9,4,3,1,2};
        bubbleSort(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i] + " ");
        }
    }    
}
