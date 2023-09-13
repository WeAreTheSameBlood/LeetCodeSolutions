package hlybchenko;


public class MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < nums2.length; i++) {
            nums1[i + nums1.length - nums2.length] = nums2[i];
        }

        mergeSort(nums1);
    }

    private void mergeSort(int[] nums1) {

        int n = nums1.length;
        if (n == 1) return;

        int mid = nums1.length / 2;
        int[] leftSide = new int[mid];
        int[] rightSide = new int[n - mid];

//        for (int i = 0; i < mid; i++) leftSide[i] = nums1[i];
//        for (int i = 0; i < n - mid; i++) rightSide[i] = nums1[i + mid];

        System.arraycopy(nums1, 0, leftSide, 0, mid);
        System.arraycopy(nums1, mid, rightSide, 0, n - mid);

        mergeSort(leftSide);
        mergeSort(rightSide);
        mergeArr(nums1, leftSide, rightSide);

    }

    private void mergeArr(int[] nums1, int[] leftSide, int[] rightSide) {

        int l = 0;
        int r = 0;
        int index = 0;

        while (l < leftSide.length && r < rightSide.length) {
            if (leftSide[l] < rightSide[r]) nums1[index++] = leftSide[l++];
            else nums1[index++] = rightSide[r++];
        }

        while (l < leftSide.length) {
            nums1[index++] = leftSide[l++];
        }

        while (r < rightSide.length) {
            nums1[index++] = rightSide[r++];
        }
    }
}
