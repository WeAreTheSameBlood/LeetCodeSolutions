package hlybchenko;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArray_88Test {

    @Test
    void merge() {

        MergeSortedArray_88 mergeSortedArr = new MergeSortedArray_88();

        // case #1
        int[] nums11 = {1,2,3,0,0,0};
        int n1 = 3;
        int[] nums12 = {2, 5, 6};
        int m1 = 3;
        String expected1 = "[1, 2, 2, 3, 5, 6]";
        mergeSortedArr.merge(nums11, n1, nums12, m1);
        System.out.println("------->" + Arrays.toString(nums11));
        assertEquals(expected1, Arrays.toString(nums11));
        System.out.println("\u001B[32m" + "\tMergeSortedArray_88Test -> Case #1 SUCCESS!" + "\u001B[0m");

        // case #2
        int[] nums21 = {1};
        int n2 = 1;
        int[] nums22 = {};
        int m2 = 0;
        String expected2 = "[1]";
        mergeSortedArr.merge(nums21, n2, nums22, m2);
        System.out.println("------->" + Arrays.toString(nums21));
        assertEquals(expected2, Arrays.toString(nums21));
        System.out.println("\u001B[32m" + "\tMergeSortedArray_88Test -> Case #2 SUCCESS!" + "\u001B[0m");

        // case #3
        int[] nums31 = {0};
        int n3 = 0;
        int[] nums32 = {1};
        int m3 = 1;
        String expected3 = "[1]";
        mergeSortedArr.merge(nums31, n3, nums32, m3);
        System.out.println("------->" + Arrays.toString(nums31));
        assertEquals(expected3, Arrays.toString(nums31));
        System.out.println("\u001B[32m" + "\tMergeSortedArray_88Test -> Case #3 SUCCESS!" + "\u001B[0m");
    }
}