import java.util.Arrays;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int p1 = 0;
        int p2 = n;

        for (int i = 0; i < nums.length; i += 2) {
            result[i] = nums[p1];
            result[i + 1] = nums[p2];
            p1++;
            p2++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        ShuffleArray solution = new ShuffleArray();
        int[] shuffledArray = solution.shuffle(nums, n);
        System.out.println(Arrays.toString(shuffledArray));
    }
}
