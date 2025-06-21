Subsets

Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        generateSubsets(nums,0,subset,result);
        return result;
    }

    public void generateSubsets(int[] nums,int index,List<Integer>subset,List<List<Integer>> result){
        result.add(new ArrayList<>(subset));

        for(int i = index ;  i<nums.length ; i++){
            subset.add(nums[i]);
           generateSubsets(nums,i +1,subset,result);
           subset.remove(subset.size()-1);

        }
    }


}