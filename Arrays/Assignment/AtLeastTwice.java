public class AtLeastTwice {

    public static boolean atLeastTwice(int nums[]){
        boolean b = false;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }else {
                    if(nums[i] == nums[j]){
                        return true;
                    }
                }

            }
        }
        
        return b;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(atLeastTwice(nums));
    }
}
