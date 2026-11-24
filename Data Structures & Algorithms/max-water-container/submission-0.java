class Solution {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length-1;
        int mostWater = 0;
        while (left < right) {
            int leftHeight = heights[left];
            int rightHeight = heights[right];
            if (leftHeight > rightHeight) {
                mostWater = Math.max(mostWater, (rightHeight * (right - left)));
                right--;
            } else {
                mostWater = Math.max(mostWater, (leftHeight * (right - left)));
                left++;
            }
        }
        return mostWater;
    }
}
