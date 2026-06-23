class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int n:nums1) hs.add(n);
        for(int n:nums2) hs2.add(n);
        hs.retainAll(hs2);
        int[] arr=new int[hs.size()];
        int i=0;
        for(int n:hs){
            arr[i++]=n;
        }
        return arr;
    }
}
