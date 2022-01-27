class Solution {
    
       public int checkSum(int n)
       {
           int digit = 0, square = 0, sum = 0;
           
           while(n > 0) {
              digit = n % 10;
              square = digit * digit;
              sum += square;
              n = n / 10;
           }
           return sum;
       }
    
        public boolean isHappy(int n) {

            int digit = 0, square = 0, sum = 0;
            HashSet<Integer> set = new HashSet<>();
            
            while(n != 1 && !set.contains(n)){
                set.add(n);
                n = checkSum(n);
                sum = 0;
            }
            
            return (n == 1) ? true : false;
        }  
            
            
 }
