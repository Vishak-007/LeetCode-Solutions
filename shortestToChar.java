class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> li=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) li.add(i);
        }
        int[] arr=new int[s.length()];
        for(int i=0;i<s.length();i++){
            int min=9999;
            for(int j=0;j<li.size();j++){
                min=Math.min(min,Math.abs(i-li.get(j)));
            }
            arr[i]=min;
        }
        return arr;
    }
}
