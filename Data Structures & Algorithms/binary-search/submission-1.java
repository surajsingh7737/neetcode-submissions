class Solution {
    public int helper(int [] nums,int target,int st, int end ){
        if(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) return helper(nums,target,st,mid-1);
            else return helper(nums,target,mid+1,end);
        }
        return -1;
    }
    public int search(int[] nums, int target) {
       return helper(nums,target,0,nums.length-1);
    }
}
