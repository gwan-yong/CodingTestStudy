class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> numsSet = new HashSet<>();
        int result = k;
        for(int i = 0; i < nums.length;i++){
            numsSet.add(nums[i]);
        }
        
        while(numsSet.contains(result)){
            result += k;
        }
        return result;
        
    }
}