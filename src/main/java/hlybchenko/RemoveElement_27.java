package hlybchenko;

public class RemoveElement_27 {

    public int removeElement(int[] nums, int val) {

        int moveCounter = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] != val) nums[moveCounter++] = nums[i];

        return moveCounter;
    }
}
