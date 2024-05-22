/*  O(n^2) - not optimal
    use 2 forloops to traverse nums array
    use count to track occurence of i
    if count is bigger then previous i/intial then beiggest = i
*/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int biggest = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                }
                if(count > biggest){
                    biggest = nums[i];
                }
            }
        }
        return biggest;
    }
}
