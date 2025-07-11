import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>(); // valor -> índice

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            System.out.println("Numero (key): " + nums[i] + ", complement: " + complement + ", indice (valor): " + i
                    + ", HashMap: " + numMap);

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i }; // retorna [índice do complemento, índice atual]
                // return new int[] { complement, nums[i] }; // retorna [valor do complemento,
                // valor atual]
            }

            numMap.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution found");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] result1 = solution.twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        // int[] result2 = solution.twoSum(new int[] { 3, 2, 4 }, 6);
        // System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // [1, 2]

        // int[] result3 = solution.twoSum(new int[] { 3, 3 }, 6);
        // System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // [0, 1]
    }
}
