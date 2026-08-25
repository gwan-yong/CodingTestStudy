class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numsIdxSet = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int num = nums[i];
            if(numsIdxSet.containsKey(target-num)){
                return new int[] {i,numsIdxSet.get(target-num)};
            }
            numsIdxSet.put(num,i);
        }
        return new int[] {};
    }
}