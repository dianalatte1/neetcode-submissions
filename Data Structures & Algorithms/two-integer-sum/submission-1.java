class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> numbers = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int actualNumber = nums[i];
            int complement = target - actualNumber;
            if(numbers.containsKey(complement)){
                return new int[] {numbers.get(complement), i};
            }
            numbers.put(actualNumber, i);

        }

        return new int[]{};

        
    }
}
