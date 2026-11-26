class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int len = flowerbed.length;
        for (int i=0; i<len; i++) {
            if (flowerbed[i] != 1 
                && (i == 0 || flowerbed[i-1] != 1) 
                && (i == len-1 || flowerbed[i+1] != 1)) {
                flowerbed[i] = 1;
                n--;
            }
            if (n == 0) return true;
        }
        return n <= 0;
    }
}