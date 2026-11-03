public class TrappingRainwater {

    public static int trappedWater(int height[]){
        int leftMaxArr[] = new int[height.length];
        int rightMaxArr[] = new int[height.length];
        int n = height.length;
        int trappedWater = 0;

        // Calculate left max array (inclues the comparison with current height of the bar also, not strictly to the left)
        leftMaxArr[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMaxArr[i] = Math.max(leftMaxArr[i - 1], height[i]);
        }

        // Calculate right max array(includes the current elemets's height aslo for comparison)
        rightMaxArr[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMaxArr[i] = Math.max(height[i], rightMaxArr[i + 1]);
        } 

        // loop
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMaxArr[i], rightMaxArr[i]);
            trappedWater += waterLevel - height[i];
        }

        return trappedWater;
    }    

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}

// Time complexity -> O(n)
