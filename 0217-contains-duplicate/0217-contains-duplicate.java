class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Map<Integer, Integer> myMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(myMap.containsKey(nums[i])){
                return true;
            }
            else{
                myMap.put(nums[i] , i);
            }
        }
        return false;
    }
}
