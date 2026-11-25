class Solution {
    public int trap(int[] height) {
        int left = 0, right = 1;
        int mostWater = 0;
        while (right < height.length) {
            if (height[left] <= height[right]) {
                int block = 0;
                int leftSide = left+1;
                while (leftSide < right) {
                    block += height[leftSide];
                    leftSide++;
                }
                //System.out.println(block);
                mostWater += (height[left] * (right - left - 1)) - block;
                left = right;
            }
            right++;
        }
        right--;
        int r1 = right-1;
        while (left < right && r1 >= left) {
            //r1 = right-1;
            if (height[r1] > height[right]) {
                int block = 0;
                int leftSide = right-1;
                while (leftSide > r1) {
                    block += height[leftSide];
                    leftSide--;
                }
                //System.out.println(block);
                mostWater += (height[right] * (right - r1 - 1)) - block;
                right = r1;
            }
            r1--;
        }
        return mostWater;
    }
}
