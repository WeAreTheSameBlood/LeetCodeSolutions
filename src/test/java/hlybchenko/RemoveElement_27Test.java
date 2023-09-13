package hlybchenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElement_27Test {

    RemoveElement_27 removeElement27 = new RemoveElement_27();

    @Test
    void removeElement() {

        // case #1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int expected1 = 2;
        assertEquals(expected1, removeElement27.removeElement(nums1, val1));
        System.out.println("\u001B[32m" + "\tRemoveElement_27Test -> Case #1 SUCCESS!" + "\u001B[0m");

        // case #2
        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        int expected2 = 5;
        assertEquals(expected2, removeElement27.removeElement(nums2, val2));
        System.out.println("\u001B[32m" + "\tRemoveElement_27Test -> Case #2 SUCCESS!" + "\u001B[0m");

        // case #3
        int[] nums3 = {2, 3, 4, 6, 3, 4, 1, 4, 4};
        int val3 = 4;
        int expected3 = 5;
        assertEquals(expected3, removeElement27.removeElement(nums3, val3));
        System.out.println("\u001B[32m" + "\tRemoveElement_27Test -> Case #3 SUCCESS!" + "\u001B[0m");
    }
}