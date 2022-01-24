class Solution {
        
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int l1 = nums1.length;
        int l2 = nums2.length;
        int length = l1 + l2;
        int i  = 0, j = 0, count = 0;
        double m1 = -1, m2 = -1;
       
      
            while(count <= length / 2) {
                m2 = m1;
                if(i < l1 && j < l2) {
                  m1 = (nums1[i] <= nums2[j]) ? nums1[i++] : nums2[j++];
                  count++;
                }
             
                else if(i < l1){
                    m1 = nums1[i++];
                    count++;
                }
                
                else {
                    m1 = nums2[j++];
                    count++;
                }
         }
       
         if(length % 2 == 0)
             return  (m1 + m2) / 2;
         else
             return m1;
            
            
        }
        
}