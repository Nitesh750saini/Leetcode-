
class Solution {
    int binarySearch(int nums[], int target, int s, int e) {

        if (s > e) {
            return -1;
        }

        int mid = s + (e - s) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (nums[mid] > target) {
            e=mid -1;
            return binarySearch(nums, target, s, e);
        }
        s=mid +1;

        return binarySearch(nums, target, s, e);
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        int s = 0;
        int e = n - 1;

        return binarySearch(nums, target, s, e);
    }
}
