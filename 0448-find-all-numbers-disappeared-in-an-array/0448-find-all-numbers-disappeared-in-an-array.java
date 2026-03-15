class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        List<Integer> missingNumbers =  new ArrayList<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        //1,2,3,4,7,8
        for (int i = 1; i <= nums.length; i++) {
            int number = set.contains(i)?i : 0;
            
            if((number ^ i) != 0){
                missingNumbers.add(i);
            }
        
    }
        return missingNumbers;
    }
}