import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Two Sum
        TwoSum ts = new TwoSum();
        int[] res = ts.twoSum(new int[] {3,3}, 6);
        System.out.println(Arrays.toString(res));
    }
}
