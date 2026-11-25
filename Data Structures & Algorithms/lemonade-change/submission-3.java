class Solution {
    public boolean lemonadeChange(int[] bills) {
        return solution1(bills);
    }

    boolean solution1(int[] bills) {
        int fives = 0, tens = 0;
        for (int num : bills) {
            if (num == 5) {
                fives++;
            } else if (num == 10) {
                if (fives-- <= 0) return false;
                tens++;
            } else {
                if (tens > 0 && fives > 0) {
                    tens--;
                    fives--;
                } else if (fives >= 3) {
                    fives -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    boolean solution2(int[] bills) {
        int[] change = new int[2];
        for (int num : bills) {
            if (num == 5) {
                change[0]++;
            } else if (num == 10) {
                if (change[0]-- <= 0) {
                    return false;
                }
                change[1]++;
            } else {
                if (change[1] > 0 && change[0] > 0) {
                    change[1]--;
                    change[0]--;
                } else if (change[0] > 2) {
                    change[0] = change[0] - 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}