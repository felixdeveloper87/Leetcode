package BackTracking;

import java.util.ArrayList; // aumenta e diminui dinamicamente
import java.util.List; // interface List to implement ArrayList
import java.util.Map; // interface Map to implement HashMap

public class LetterCombinations {
    private static final Map<Character, String> phoneMap = Map.of(
            '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();

        // Edge case: if input is null or empty, return empty list
        if (digits == null || digits.length() == 0) {
            return result;
        }
        // Start the backtracking algorithm
        backtrack(result, new StringBuilder(), digits, 0);
        return result;
    }

    /**
     * Recursive backtracking method to generate combinations.
     * 
     * @param result  The final list where combinations are collected.
     * @param current The current combination being built (as a StringBuilder for
     *                performance).
     * @param digits  The full input digit string.
     * @param index   The current position in the digits string.
     */
    private void backtrack(List<String> result, StringBuilder current, String digits, int index) {
        // Base case: if the current combination length matches the input digits length
        if (index == digits.length()) {
            result.add(current.toString()); // Add complete combination to result list
            return; // Return to explore other combinations (backtrack)
        }
        // Get the letters corresponding to the current digit
        String letters = phoneMap.get(digits.charAt(index));

        // Loop through each possible letter for this digit
        for (char letter : letters.toCharArray()) {
            current.append(letter); // Choose: add the letter to the current combination
            backtrack(result, current, digits, index + 1); // Explore: move to the next digit
            current.deleteCharAt(current.length() - 1); // Unchoose: remove last letter (backtrack)
        }
    }

    public static void main(String[] args) {
        LetterCombinations sol = new LetterCombinations();

        System.out.println(sol.letterCombinations("233"));
        // System.out.println(sol.letterCombinations(""));
        // System.out.println(sol.letterCombinations("2"));
    }

}
