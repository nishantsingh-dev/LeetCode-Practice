 Letter Combinations of a Phone Number


Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

class Solution {
    public List<String> letterCombinations(String digits) {
         String[] digitToLetters = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    List<String> result = new ArrayList<>();
    if (digits == null || digits.length() == 0) {
            return result;
        }

    StringBuilder combination = new StringBuilder();
    int index =0;

    generateCombination(digits, result, index ,combination, digitToLetters);

    return result;
    }

    private void generateCombination(String digits, List<String>result,int index ,StringBuilder combination, String[] digitToLetters){

        if(combination.length()== digits.length()){
            result.add(combination.toString());
            return;
        }

        char digit =digits.charAt(index);
        String letters=digitToLetters[digit-'0'];

        for(char ch: letters.toCharArray()){
            combination.append(ch);
            generateCombination(digits, result, index+1 ,combination, digitToLetters);
            combination.deleteCharAt(combination.length()-1);
        }

        
    }


}