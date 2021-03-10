class Solution {
    public int missingNumber(int[] nums) {
        int length = nums.length;
        int sum = 0;
        for (int i: nums) {
            sum += i;
        }

        int gaussianSum = (length * (length + 1)) / 2;
        return gaussianSum - sum;
    }
}