Permutations

Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]



class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; 
        generatePermutations(nums, perm, result,used);

        return result;
    }

    private void generatePermutations(int[]nums, List<Integer>perm, List<List<Integer>>result,boolean[] used){
        if(perm.size()==nums.length){
            result.add(new ArrayList<>(perm));
        }

        for(int i= 0 ; i<nums.length ; i++){
            if(!used[i]){
                perm.add(nums[i]);
                used[i]= true;

                generatePermutations(nums, perm, result,used);
                perm.remove(perm.size()-1);
                used[i] = false;
            }
        }
    }
    


}