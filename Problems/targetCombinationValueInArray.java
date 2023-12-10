import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class targetCombinationValueInArray {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input array from the user
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array separated by space: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Take target value from the user
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Find and print the combinations
        List<List<Integer>> result1 = findCombinations(nums, target);
        List<Integer> mergedArray = mergeAndSort(result1);
        // List<List<Integer>> result2 = findCombinations(mergedArray, target * 2);

        // Print the results
        System.out.println("First Combination For \"" + target + "\": " + result1);
        System.out.println("Merge Into a single Array: " + mergedArray);
        // System.out.println("Second Combination For \"" + (target * 2) + "\": " + result2);

        scanner.close();
    }

    private static List<List<Integer>> findCombinations(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> seen = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;
            if (seen.containsKey(complement)) {
                result.add(Arrays.asList(complement, num));
            }
            seen.put(num, complement);
        }

        return result;
    }

    private static List<Integer> mergeAndSort(List<List<Integer>> lists) {
        List<Integer> mergedArray = new ArrayList<>();
        for (List<Integer> list : lists) {
            mergedArray.addAll(list);
        }
        mergedArray.sort(null);
        return mergedArray;
    }

    private static List<List<Integer>> findCombinations(List<Integer> nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> seen = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;
            if (seen.containsKey(complement)) {
                result.add(Arrays.asList(complement, num));
            }
            seen.put(num, complement);
        }

        return result;
    }
 
}
