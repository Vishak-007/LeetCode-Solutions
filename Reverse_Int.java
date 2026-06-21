class Solution {
    public int reverse(int num) 
    {
        long rev=0;
        int x=Math.abs(num);
        while(x!=0){
            int rem=x%10;
            rev=rev*10+rem;
            x/=10;
        }
        if(rev<-2147483648||rev>2147483647) return 0;
        if(num<0) return (int) rev*-1;
        return (int )rev;
    }
}
