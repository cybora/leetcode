class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int toBeFound = target - nums[i];
            if (map.containsKey(toBeFound)) {
                return new int[] {i, map.get(toBeFound)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Could not be found");
    }
}
