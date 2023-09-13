package hlybchenko;


import java.util.Deque;
import java.util.LinkedList;

public class RotateArray_189 {

    public void rotate(int[] nums, int k) {

        k %= nums.length;
        Deque<Integer> deque = new LinkedList<>();

        for (int i = nums.length - k; i < nums.length; i++) {
            deque.addLast(nums[i]);
        }

        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = deque.removeFirst();
        }

    }
}
