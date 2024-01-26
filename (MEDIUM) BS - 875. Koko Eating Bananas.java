import java.util.*;
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int left = 1;
        int right = piles[piles.length-1];
        int mid = 0;
        int k = right;
        while(left<right) {
            mid = (right+left)/2;
            int sum = 0;
            for(int i=0;i<piles.length;i++) {
                int a = (int)Math.ceil((double)piles[i]/mid);
                sum = sum + a;
            }
            if(sum<=h) {
                right = mid;
                k = Math.min(mid, k);
            }
            else {
                left = mid + 1;
            }
          
        }
        return k;
    }
}
