public class AtLeastTwice {

    public static boolean atLeastTwice(int nums[]){

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }

            }
        }
        
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 4, 2};
        System.out.println(atLeastTwice(nums));
    }
}
