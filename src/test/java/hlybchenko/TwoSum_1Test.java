package hlybchenko;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

class TwoSum_1Test {
    TwoSum_1 twoSum1 = new TwoSum_1();

    @Test
    void twoSum() {
        // case #1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        assertArrayEquals(expected1, twoSum1.twoSum(nums1, target1));
        System.out.println("\u001B[32m" + "\tTwoSum_1Test -> Case #1 SUCCESS!" + "\u001B[0m");

        // case #2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        assertArrayEquals(expected2, twoSum1.twoSum(nums2, target2));
        System.out.println("\u001B[32m" + "\tTwoSum_1Test -> Case #2 SUCCESS!" + "\u001B[0m");

        // case #3
        int[] nums3 = {1, 2, 3};
        int target3 = 7;
        int[] expected3 = {};
        assertArrayEquals(expected3, twoSum1.twoSum(nums3, target3));
        System.out.println("\u001B[32m" + "\tTwoSum_1Test -> Case #3 SUCCESS!" + "\u001B[0m");

        // case #4
        int[] nums4 = {2, 5, 5, 11};
        int target4 = 7;
        int[] expected4 = {0, 1};
        assertArrayEquals(expected4, twoSum1.twoSum(nums4, target4));
        System.out.println("\u001B[32m" + "\tTwoSum_1Test -> Case #4 SUCCESS!" + "\u001B[0m");

    }
}