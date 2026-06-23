class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i=g.length-1;
        int j=s.length-1;
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        while(i>=0&&j>=0){
            if(g[i]<=s[j]){
                j--;
                i--;
                c++;
            }else
            i--;
        }
        return c;
}
}
