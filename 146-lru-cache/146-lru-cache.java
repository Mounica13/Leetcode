class LRUCache {

  class Node {
      int key, value;
      Node prev, next;
     
  }
    
   private void addNode(Node node) {
       
       node.prev = head;
       node.next = head.next;
       head.next.prev = node;
       head.next = node;
       
   }

  private void movetohead(Node node) {
      removeNode(node);
      addNode(node);
  }
  
  private void removeNode(Node node) {
      node.prev.next = node.next;
      node.next.prev = node.prev;
  }

   private Node removeLastNode() {
       
       Node result = tail.prev;
       removeNode(result);
    
       return result;
    }

    HashMap<Integer, Node> map = new HashMap<>();
    int size = 0, capacity = 0;
    Node head;
    Node tail;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
      
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
   }
    
    public int get(int key) {
        Node node = map.get(key);
        if(node == null)
            return -1;
        movetohead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        
        if(node == null) {
            if(size == capacity) {
                Node removenode = removeLastNode();
                map.remove(removenode.key);
                size--;
            }
            node = new Node();
            node.key = key;
            node.value = value;
            addNode(node);
            map.put(key,node);
            size++;
        }
        
        else {
            movetohead(node);
            node.value = value;
            map.put(key,node);
        }
    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*  private final int capacity;
    HashMap<Integer, Integer> map;
    Deque<Integer> deque;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<Integer,Integer>();
        deque = new LinkedList<>();
    }
    
    public int get(int key) {
       if(!deque.contains(key))
           return -1;
       else {
          deque.remove(key);
          deque.addFirst(key);
         }
      return map.get(key);
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key))
        {
            if(deque.size() == capacity) {
               int last = deque.removeLast();
               map.remove(last);
            }
            
        }
        
        else {
            deque.remove(key);
        }
            deque.addFirst(key);
            map.put(key,value);
        } */
    }


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */