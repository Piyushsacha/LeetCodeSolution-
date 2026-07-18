class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=s.length();
        int max =0;
        String str="";
        for(int i=0;i<l;i++){
           char ch =s.charAt(i);
            if(str.indexOf(ch)==-1){
                str=str+ch;
            }else{
                str=str.substring(str.indexOf(ch)+1)+ch;
            }
            max=Math.max(max,str.length());
        }
        return max;
    }
}