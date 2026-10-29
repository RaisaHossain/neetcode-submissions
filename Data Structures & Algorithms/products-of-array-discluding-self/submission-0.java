class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int length = nums.length;
        int before = 1;
        int after = 1;
        int[] productArray = new int[length];
        for (int i = 0; i < nums.length; i++)
        {
            productArray[i] = before;
            before *= nums[i];
        }
        for(int i = length - 1; i >= 0; i--){
            productArray[i] *= after;
            after *= nums[i];
        }
        return productArray;    
    }
}  
