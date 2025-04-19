Trie[] children;
    boolean isEnd;
    
    public Trie() {
        // Implement Trie
        this.children=new Trie[26];
        for(int i=0;i<26;i++) children[i]=null;
        isEnd=false;
    }

    // Insert a word into the Trie
    public void insert(String word) {
        Trie root=this;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(root.children[idx]==null) root.children[idx]=new Trie();
            if(i==word.length()-1) {
                root.children[idx].isEnd=true;
                break;
            }
            root=root.children[idx];
        }
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        Trie root=this;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(root.children[idx]==null) return false;
            if(i==word.length()-1&&!root.children[idx].isEnd) return false;
            root=root.children[idx];
        }
        
        return true;
    }

    // Check if a prefix exists in the Trie
    public boolean isPrefix(String word) {
        Trie root=this;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(root.children[idx]==null) return false;
            root=root.children[idx];
        }
        
        return true;
    }

