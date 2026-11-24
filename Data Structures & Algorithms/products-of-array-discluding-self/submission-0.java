class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length-1;
        int[] preProduct = new int[len+1];
        int prefix = 1;
        for (int i=0; i<=len; i++) {
            preProduct[i] = prefix;
            prefix *= nums[i];
        }
        prefix = 1;
        for (int i=len; i>=0; i--) {
            preProduct[i] *= prefix;
            prefix *= nums[i];
        }
        return preProduct;
    }
}  
