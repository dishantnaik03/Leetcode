class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int[] r = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int j=0;
            for (; j<nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    break;
                }
            }            
            for(; j<nums2.length; j++){
                if(nums1[i] < nums2[j]){
                    r[i] = nums2[j];
                    break;
                }
            }
            if(r[i]==0){
                r[i]=-1;
            }
            
        }
        return r;
    }
}