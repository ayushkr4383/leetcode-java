class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0, k, p=0;
        int arr[] = new int [m];
        for(k=0;k<m;k++){
            arr[k] = nums1[k];
        }
        while(i<m && j<n){
            if(arr[i]<nums2[j]){
                nums1[p]=arr[i];
                p++;
                i++;
            }
            else{
                nums1[p] = nums2[j];
                p++;
                j++;
            }

        }
        while(i<m){
            nums1[p] = arr[i];
            p++;
            i++;
        }
        while(j<n){
            nums1[p] = nums2[j];
            p++;
            j++;
        }

    }
}