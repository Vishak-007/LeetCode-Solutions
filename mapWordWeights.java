class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                sum+=weights[s.charAt(i)-'a']; 
            }
            char ch=(char)('z'-(sum%26));
            res.append(ch);
        }
        return res.toString();
    }
}
