import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int square;
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                square = nums[left] * nums[left];
                left++;
            } else {
                square = nums[right] * nums[right];
                right--;
            }
            result[i] = square;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        SortedSquares solution = new SortedSquares();
        int[] sortedSquares = solution.sortedSquares(nums);
        System.out.println(Arrays.toString(sortedSquares));
    }
}
