package tree.trie;

public class Node {

    Node[] childen;
    boolean endOfWord;

    Node(){
        childen = new Node[26];
        for(int i=0;i<26;i++){
            childen[i] = null;
        }
        endOfWord = false;

    }
    
}
