// use the binary search algorithm in the nums array
// if the array is rotated, no chance the leftmost element can be less than the rightmost element
// if the array is not rotated, the leftmost is the minimum.
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int output = 0;
        int mid = 0;
        while(left<=right) {
            mid = left + (right-left)/2;
            if(nums[left]<=nums[right]) { 
                output = nums[left];
                break;
            }
            else {  // here the binary search is used
                if(nums[mid]>=nums[left]) {
                    left = mid+1;
                }
                else if (nums[mid]<nums[left]) {
                    right = mid; // important one
                }
            }
        }
        return output;
    }
}
