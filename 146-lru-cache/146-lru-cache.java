class LRUCache {
    
    class Node{
        int key, value;
        Node prev, next;
    }
    
    private void addNode(Node node){
        node.next = head.next;
        node.prev = head;
        head.next = node;
        node.next.prev = node;
    }
    
    private void moveToHead(Node node){
        removeNode(node);
        addNode(node);
    }
    
    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    
    private Node removeLastNode(){
        Node lastNode = tail.prev;
        removeNode(lastNode);
        
        return lastNode;
    }
    
    HashMap<Integer, Node> map = new HashMap<>();
    Node head, tail;
    int size = 0, capacity = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        
    }
    
    public int get(int key) {
        Node node = map.get(key);
        
        if(node == null){
            return -1;
        }
        moveToHead(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        Node node = map.get(key);
        if(node == null) {
            if(size == capacity) {
                Node removeNode = removeLastNode();
                map.remove(removeNode.key);
                size--;
            }
            node = new Node();
            node.key = key;
            node.value = value;
            addNode(node);
            map.put(key, node);
            size++;
        }
        
        else{
        moveToHead(node);
        node.value = value;
        map.put(key,node);
        
        }
    }
}


//Time complexity for get and put : O(1)
//Space complexity : O(capacity)  since the space is used only for a hashmap and double linked list with at most capacity + 1 elements
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */