class Solution {
    
   /* public int[] heapsort(int[] nums)
    {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++)
        {
            minheap.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = minheap.poll();
            
        }
        return nums;
    } */
    
    public int[] merge(int[] left, int[] right, int[] nums)
    {
        int i = 0, j = 0, k = 0;
        
        while(i < left.length && j < right.length)
        {
           if(left[i] < right[j])
               nums[k] = left[i++];
           
           else
               nums[k] = right[j++];
          
           k++;
            
        }
    
        while(i < left.length)
        {
            nums[k++] = left[i++];
        }
        
          while(j < right.length)
        {
            nums[k++] = right[j++];
        }
        
        return nums;
        
    }
    public int[] mergeSort(int[] nums)
    {
        if(nums.length <= 1)
            return nums;
        
        int mid = (0 + nums.length) / 2;
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];
        
        for(int i = 0; i < left.length; i++)
        {
            left[i] = nums[i];
        }
        
        for(int i = 0; i < right.length; i++)
        {
            right[i] = nums[mid + i];
        }
        
        left = mergeSort(left);
        right = mergeSort(right);
         return merge(left, right, nums);
    }
    
    public int[] sortArray(int[] nums) {
        
       //  return heapsort(nums);
           return mergeSort(nums);
    }
}