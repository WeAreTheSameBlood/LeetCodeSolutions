package hlybchenko;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RotateArray_189Test {

    @Test
    void rotate() {

        RotateArray_189 rotateArray = new RotateArray_189();

        // case #1
        int[] nums1 = {1,2,3,4,5,6,7};
        int k1 = 3;
        String expected1 = "[5, 6, 7, 1, 2, 3, 4]";
        rotateArray.rotate(nums1, k1);
        System.out.println("------->" + Arrays.toString(nums1));
        assertEquals(expected1, Arrays.toString(nums1));
        System.out.println("\u001B[32m" + "\tRotateArray_189Test -> Case #1 SUCCESS!" + "\u001B[0m");

        // case #2
        int[] nums2 = {-1};
        int k2 = 2;
        String expected2 = "[-1]";
        rotateArray.rotate(nums2, k2);
        System.out.println("------->" + Arrays.toString(nums2));
        assertEquals(expected2, Arrays.toString(nums2));
        System.out.println("\u001B[32m" + "\tRotateArray_189Test -> Case #2 SUCCESS!" + "\u001B[0m");

        // case #3
        int[] nums3 = {-1,-100,3,99};
        int k3 = 2;
        String expected3 = "[3, 99, -1, -100]";
        rotateArray.rotate(nums3, k3);
        System.out.println("------->" + Arrays.toString(nums3));
        assertEquals(expected3, Arrays.toString(nums3));
        System.out.println("\u001B[32m" + "\tRotateArray_189Test -> Case #3 SUCCESS!" + "\u001B[0m");

    }
}