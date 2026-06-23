class Solution {
    public int maximumCount(int[] nums) {
        int p=0, n=0;
        int max=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>0) p++;
            else if(num<0) n++;
        }
            max=Math.max(p,n);
        return max;
    }
}
