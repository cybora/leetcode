class Solution {
    public int[] findErrorNums(int[] nums) {
       int[] integers = new int[nums.length + 1];
        int dup = -1;
        int missing = -1;
        for (int i: nums) {
            if (integers[i] != 0) {
                dup = i;
            }
            integers[i] = i;
        }

        for (int i = 1; i < nums.length + 1; i++) {
            if (integers[i] == 0) {
                missing = i;
            }
        }

        return new int[]{dup,missing};
    }
}