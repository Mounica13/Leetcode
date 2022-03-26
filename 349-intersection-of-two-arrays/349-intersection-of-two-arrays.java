class Solution {
    
    public int[] result(HashSet<Integer> set1, HashSet<Integer> set2)
    {
        int[] intersect = new int[set1.size()];
        int k = 0;
        for(Integer i : set1)
        {
            if(set2.contains(i))
               {
                   intersect[k] = i;
                   k++;
               }
        }
               
             return Arrays.copyOfRange(intersect, 0, k);
    }         
    
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int i = 0 ; i < nums1.length; i++)
            set1.add(nums1[i]);
        for(int i = 0 ; i < nums2.length; i++)
            set2.add(nums2[i]);
        
        if(set1.size() > set2.size())
            return result(set2, set1);
        else
            return result(set1, set2);
        
}
}

