class Solution {
    public String reverseOnlyLetters(String ch) {
        char[] s=ch.toCharArray();
        int i=0,j=s.length-1;
        while(i<j){
            if(!(Character.isLetter(s[i]))){
                i++;
                continue;
            }
            if(!(Character.isLetter(s[j]))){
                j--; continue;
            } 
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++; j--;
        }
        return new String(s);
    }
}
