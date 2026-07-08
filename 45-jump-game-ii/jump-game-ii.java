class Solution {
    public int jump(int[] nums) {
        int fardest=0;
        int currentend=0;
        int jump=0;
        for(int i=0;i<nums.length-1;i++){
            fardest=Math.max(fardest,i+nums[i]);
            if(i==currentend){
                currentend=fardest;
                jump++;
            }
        }
        return jump;
        
    }
}