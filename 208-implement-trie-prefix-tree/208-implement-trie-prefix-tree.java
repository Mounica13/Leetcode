class Trie {

    Node root;
    
    public Trie() {
       root = new Node('\0');
    }
    
    public void insert(String word) {
        Node current = root;
        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(current.children == null)
                 current.children = new Node[26];
            if(current.children[ch - 'a'] == null) 
                current.children[ch - 'a'] = new Node(ch);
            current = current.children[ch - 'a'];
        }
        current.isword = true;
    }
    
    public boolean search(String word) {
        Node current = getNode(word);
        return current != null && current.isword == true;
        }
    
    public boolean startsWith(String prefix) {
        Node current = getNode(prefix);
       return current != null;
    }
    
    public Node getNode(String word)
    {
        Node current = root;
        for(int i = 0; i < word.length(); i++)
        {
            char ch = word.charAt(i);
            if(current.children == null)
                return null;
            if(current.children[ch - 'a'] == null)
                 return null;
            current = current.children[ch - 'a'];
        }
        return current;
    }
    
    class Node{
        char ch;
        Boolean isword;
        Node[] children;
        
        public Node(char ch)
        {
           this.ch = ch;
            isword  = false;
           // Node[] children = new Node[26];
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */