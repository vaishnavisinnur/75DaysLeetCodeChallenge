class Solution {
    public boolean containsDuplicate(int[] nums) {        
        Set<Integer> mySet = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(!mySet.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}

/*using HashMap--> but this is not optimal it takes 16 ms to run and it beats only 45%

Map<Integer, Integer> myMap = new HashMap<>();
for(int num : nums){
    if(myMap.containskey(nums[i])){
        return true;
    }else{
        myMap.put(nums[i],i);
    }
    return false;
}
*/
