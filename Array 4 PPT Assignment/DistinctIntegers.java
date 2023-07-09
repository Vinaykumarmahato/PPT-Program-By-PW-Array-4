import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctIntegers {
    public List<List<Integer>> findDistinct(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        Set<Integer> symmetricDifference = new HashSet<>(set1);
        symmetricDifference.addAll(set2);
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        List<Integer> result1 = new ArrayList<>(symmetricDifference);
        result1.removeAll(intersection);

        List<Integer> result2 = new ArrayList<>(symmetricDifference);
        result2.removeAll(set1);

        List<List<Integer>> result = new ArrayList<>();
        result.add(result1);
        result.add(result2);

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        DistinctIntegers solution = new DistinctIntegers();
        List<List<Integer>> distinctIntegers = solution.findDistinct(nums1, nums2);
        System.out.println(distinctIntegers);
    }
}
