public class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int r = numbers.length - 1;

        for (int l = 0; l < r; ) {
            int curSum = numbers[l] + numbers[r];

            if (curSum > target) {
                r--;
            } else if (curSum < target) {
                l++;
            } else {
                return new int[] { l + 1, r + 1 };
            }
        }

        return new int[0];
    }
}