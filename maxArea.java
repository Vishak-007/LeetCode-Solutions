class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while(i<j){
            min=Math.min(height[i],height[j]);

            max=Math.max(max,(j-i)*min);
            if(min==height[i]){
                i++;
            }else{
            j--;
        }   
    }
    return max;
    }
}
