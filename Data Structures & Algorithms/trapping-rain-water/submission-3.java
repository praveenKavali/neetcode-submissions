class Solution {
    public int trap(int[] height) {
        return solution2(height);
    }

    int solution2(int[] height) {
        if (height == null || height.length < 3) return 0;
        int left = 0, right = height.length-1;
        int leftMax = height[left], rightMax = height[right];
        int trappedWater = 0;
        while (left < right) {
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, height[left]);
                trappedWater += leftMax - height[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, height[right]);
                trappedWater += rightMax - height[right];
            }
        }
        return trappedWater;
    }

    int solution1(int[] height) {
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
