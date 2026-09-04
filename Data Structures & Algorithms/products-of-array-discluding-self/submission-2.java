class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftProduct = new int[nums.length];
        int n = nums.length;
        leftProduct[n-1]=1;
        for(int i=n-2; i>=0 ;i--){
            leftProduct[i]= nums[i+1]*leftProduct[i+1];
            
        }
        
        int[] ans =new int[n];
        int product=1;
        for(int i =0; i<n;i++){
            ans[i]= product * leftProduct[i];
            product = product *nums[i];
        }

        return ans;
    }
}  
