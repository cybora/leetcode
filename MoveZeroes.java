class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroPos = 0;

        for (int num: nums) {
            if (num != 0) {
                nums[nonZeroPos++] = num;
            }
        }

        while (nonZeroPos < nums.length) {
            nums[nonZeroPos++] = 0;
        }
    }
}
