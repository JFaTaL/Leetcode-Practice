class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++){
            if(table.containsKey(nums[i])){
                table.put(nums[i], table.get(nums[i]) + 1);
            }
            else{
                table.put(nums[i], 1);
            }
        }

        int n = nums.length / 2;
        for(Map.Entry<Integer, Integer> entry : table.entrySet()){
            if(entry.getValue() > n){
                return entry.getKey();
            }
        }
        return 0;
    }
}
