class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> merge = new ArrayList<>();

        // Add elements
        for(int i = 0 ; i< nums1.length ; i++){
            merge.add(nums1[i]);
        }
        for(int j = 0 ; j < nums2.length ; j++){
            merge.add(nums2[j]);
        }

        Collections.sort(merge);
        int x = merge.size();

        if(x%2 != 0){
            return (double)merge.get(x/2);
        }else{
            return  ( (merge.get((x/2)-1) + merge.get(x/2))/2.0 );
        }
    }
}