class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        List<Integer> missingNumbers =  new ArrayList<>();
        for(int num : nums){
            set.add(num);
        }
        
        for (int i = 1; i <= nums.length; i++) {
        if (!set.contains(i)) {
            missingNumbers.add(i);
        }
    }
        return missingNumbers;
    }
}