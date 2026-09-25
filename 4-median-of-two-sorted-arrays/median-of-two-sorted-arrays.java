class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        int k=0;
        double ans=0;
        int n=(nums1.length+nums2.length);
        int[] merge = new int[n];
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
              merge[k] = nums1[i];
              i++;
            }     
            else{
              merge[k] = nums2[j];
              j++;
            }
            k++;
        }

        //remaining element of nums1
        while(i<nums1.length){
            merge[k]=nums1[i];
            i++;
            k++;
        }

        //remaining element of nums1
        while(j<nums2.length){
            merge[k]=nums2[j];
            j++;
            k++;
        }

        //find mid

        int mid = (merge.length)/2;
        if(n%2==0){
            ans=(merge[mid]+merge[mid-1])/2.0;
        }
        else{
            ans=merge[mid];
        }
        return ans;
    }
    
}