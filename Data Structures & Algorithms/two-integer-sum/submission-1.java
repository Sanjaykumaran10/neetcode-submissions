class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> group=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int want=target-nums[i];
            if(group.containsKey(want)){
                return new int[]{group.get(want),i};
            }
            group.put(nums[i],i);
        }
        return new int[]{};
    }
}
