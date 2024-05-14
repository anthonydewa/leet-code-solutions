import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int curr_num = nums[i];

            hs.put(curr_num, i);
        }
        

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int lookup_value = target - nums[i];
            Integer val = hs.get(lookup_value);

            if (val != null && val != i) {
                res[0] = i;
                res[1] = val;
                break;
            }
        }

        return res;
    }
}