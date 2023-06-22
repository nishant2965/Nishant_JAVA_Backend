import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoNumbers(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;

        int[] result = findTwoNumbers(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
