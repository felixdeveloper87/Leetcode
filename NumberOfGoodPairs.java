import java.util.HashMap;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            if (map.containsKey(num)) {
                count += map.get(num);
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
            System.out.println("num atual" + num);
            System.out.println(map);
            System.out.println(count);
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs sol = new NumberOfGoodPairs();
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        System.out.println(sol.numIdenticalPairs(nums));
    }
}
