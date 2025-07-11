package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), 0, result);
        return result;

    }

    private void backtrack(int[] candidates, int target, List<Integer> current, int index, List<List<Integer>> result) {
        if (target == 0) { // found a valid combination
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) { // invalid path
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            current.add(candidates[i]); // Choose this candidate
            System.out.println(candidates[i]);
            backtrack(candidates, target - candidates[i], current, i, result); // Recurse without moving i
            current.remove(current.size() - 1); // Backtrack (undo last choice)
        }
    }

    public static void main(String[] args) {
        CombinationSum solution = new CombinationSum();

        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;

        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println(result); // Output: [[2, 2, 3], [7]]
    }

}
