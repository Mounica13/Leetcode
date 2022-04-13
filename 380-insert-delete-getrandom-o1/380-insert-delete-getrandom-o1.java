class RandomizedSet {
    
    ArrayList<Integer> list;
    HashMap<Integer,Integer> map;
    Random rand = new Random();
    
  	public RandomizedSet(){
        list = new ArrayList();
        map = new HashMap<>();
     }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        } 
        else {
            list.add(val);
            map.put(val, list.indexOf(val));
            return true;
        }
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }
        
        else{ 
       //copy the value to be removed with the last element in the arraylist
        int index = map.get(val);
        int lastElement = list.get(list.size() - 1);
        list.set(index, lastElement);
        map.put(lastElement, index);
        
        //remove the last element in arraylist and map
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
        }
    }
    
    public int getRandom() {
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
} 

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */