package hlybchenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArray_26Test {

    RemoveDuplicatesFromSortedArray_26 removeDuplicates = new RemoveDuplicatesFromSortedArray_26();

    @Test
    void removeDuplicates() {

        // case #1
        int[] nums1 = {1, 1, 2};
        int expected1 = 2;
        assertEquals(expected1, removeDuplicates.removeDuplicates(nums1));
        System.out.println("\u001B[32m" + "\tRemoveDuplicatesFromSortedArray_26Test -> Case #1 SUCCESS!" + "\u001B[0m");

        // case #2
        int[] nums2 = {0,0,1,1,1,2,2,3,3,4};
        int expected2 = 5;
        assertEquals(expected2, removeDuplicates.removeDuplicates(nums2));
        System.out.println("\u001B[32m" + "\tRemoveDuplicatesFromSortedArray_26Test -> Case #2 SUCCESS!" + "\u001B[0m");

        // case #3
        int[] nums3 = {1, 1};
        int expected3 = 1;
        assertEquals(expected3, removeDuplicates.removeDuplicates(nums3));
        System.out.println("\u001B[32m" + "\tRemoveDuplicatesFromSortedArray_26Test -> Case #3 SUCCESS!" + "\u001B[0m");

    }
}