class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int mid = 0;
        int ans = 0;
        while(left<=right) {
            mid = left + (right-left)/2;
            long midNum = mid;
            if(midNum*midNum<=(long)x) {
                ans = mid;
                left = mid + 1;
            }
            else if (midNum*midNum>(long)x) {
                right = mid - 1;
            }
        }
        return ans;
    }
}
