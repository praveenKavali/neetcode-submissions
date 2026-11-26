class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int len = flowerbed.length;
        for (int i=0; i<len; i++) {
            if (flowerbed[i] != 1) {
                if (i == 0) {
                    if (i == len-1) {
                        n--;
                    } else if (flowerbed[i+1] != 1) {
                        n--;
                        flowerbed[i] = 1;
                    }
                } else if (i == len-1 && flowerbed[i-1] != 1) {
                    n--;
                } else if (i != 0 && i != len-1) {
                    if (flowerbed[i-1] != 1 && flowerbed[i+1] != 1) {
                        n--;
                        flowerbed[i] = 1;
                    }
                }
            }
        }
        return n <= 0;
    }
}