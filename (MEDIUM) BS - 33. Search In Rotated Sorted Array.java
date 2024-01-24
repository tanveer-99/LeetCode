class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        int ans = -1;
        while(left<=right) {
            mid = left + (right-left)/2;
            if(nums[left]==target || nums[right]==target || nums[mid]==target) {
                if(nums[left]==target) {
                    ans = left;
                    break;
                }
                else if(nums[right]==target) {
                    ans = right;
                    break;
                }
                else {
                    ans = mid;
                    break;
                }
            }
            else {
                if(nums[left]<nums[mid]) {
                    if(nums[left]<target && nums[mid]>target) {
                        right = mid-1;
                    }
                    else {
                        left = mid+1;
                    }
                }
                else {
                    if(nums[mid]<target && nums[right]>target) {
                        left = mid+1;
                    }
                    else {
                        right = mid-1;
                    }
                }
            }
        }
        return ans;
    }
}
