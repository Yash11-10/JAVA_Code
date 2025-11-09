
class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first1 = first(nums, target);
        int second2 = second(nums, target);
        return new int[]{first1, second2};
    }

    public int first(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                ans = mid;
                j = mid - 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }

    public int second(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        int ans = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target) {
                ans = mid;
                i = mid + 1;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return ans;
    }
}
