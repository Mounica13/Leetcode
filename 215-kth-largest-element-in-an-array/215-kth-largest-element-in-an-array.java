/* Solution 1:


class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int temp = 0, i = 0, result = 0;
        
        if(nums.length == 0 || k == 0)
            return result;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(i = 0; i < k; i++) {
            queue.add(nums[i]);
        }
        
        for(i = k; i < nums.length; i++) {
            temp = queue.peek();
            if(nums[i] > temp) {
                queue.poll();
                queue.add(nums[i]);
            }
        }
        
        if(!queue.isEmpty()){
            return queue.peek();
        }
        
        return result;
    }
}

//Time complexity : O(N log k)
//Space complexity : O(k)
*/


// Solution 2: QuickSelect approach

class Solution {
    
    private int Partition(int[] nums, int start, int end){
        int pivot = nums[end];
        int PIndex = start;
        for(int i = start; i < end; i++){
            if(nums[i] < pivot){
                int temp = nums[i];
                nums[i] = nums[PIndex];
                nums[PIndex] = temp;
                PIndex++;
            }
        }
        nums[end] = nums[PIndex];
        nums[PIndex] = pivot;
        
        return PIndex;
    }
    
    private int quickSelect(int[] nums, int start, int end, int k_smallest){
       if(start == end) {
           return nums[start];
       }    
        
      int PIndex = Partition(nums, start, end);
     
      if(PIndex == k_smallest){
          return nums[k_smallest];
      }
      else if(k_smallest < PIndex){
          return quickSelect(nums, start, PIndex - 1, k_smallest);
      }
      else{
          return quickSelect(nums, PIndex + 1, end, k_smallest);
      }
       
    }
    public int findKthLargest(int[] nums, int k) {
        int size = nums.length;
        return quickSelect(nums, 0, size - 1, size - k);
    }
}

//Time complexity : O(N)
//Space complexity : O(1)