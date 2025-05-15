Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anaMap =new HashMap<>();

        for(String str : strs){
            String sorted = sortString(str);
            if(anaMap.containsKey(sorted)){
                anaMap.get(sorted).add(str);
            }else{
                anaMap.put(sorted,new ArrayList<>());
                anaMap.get(sorted).add(str);
            }
        }

        return new ArrayList<>(anaMap.values());
    }

    private String sortString(String str){
        char[] tempArray= str.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}