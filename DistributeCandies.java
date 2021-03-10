class Solution {
    public int distributeCandies(int[] candyType) {
        int amountCanEat = candyType.length / 2;
        Set<Integer> uniqueCandies = new HashSet<>();
        for (int j : candyType) {
            uniqueCandies.add(j);
        }
        
        return Math.min(uniqueCandies.size(), amountCanEat);
    }
}