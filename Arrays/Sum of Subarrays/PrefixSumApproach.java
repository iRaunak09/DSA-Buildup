public class PrefixSumApproach {

    public static void prefixSum(int arr[]){
        int start = 0;
        int end = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int pref[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            pref[i] = i == 0 ? arr[i] : pref[i - 1] + arr[i];
        }

        for(int i = 0; i < arr.length; i++){
            start = i;
            for(int j = i; j < arr.length; j++){
                end = j;
                sum = i == 0 ? pref[j] : pref[j] - pref[i - 1];

                if(sum > max){
                    max = sum;
                }
            }
        }

        System.out.println(max);

        
        // for(int i = 0; i < pref.length; i++){
        //     System.out.println(pref[i]);
        // }
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        prefixSum(arr);
    }    
}

// Time Complexity -> O(n * n)

