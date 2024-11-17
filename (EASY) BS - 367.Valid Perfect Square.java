class Solution {
    public boolean isPerfectSquare(int num) { 
        int left = 0;
        int right = num;
        int mid = 0;
        boolean ans = false;
        while(left<=right) {
            mid = left + (right-left)/2;
            if((long)mid*mid==num) {
                ans = true;
                break;
            }
            else {
                if((long)mid*mid>num) {
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
        }
        return ans;
    }
}
