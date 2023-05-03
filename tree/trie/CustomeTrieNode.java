package tree.trie;

public class CustomeTrieNode {

   static Node root = new Node();
   public static void insert(String word){
    Node currentNode = root;
    for(int i =0 ;i < word.length(); i++){
        int idx = word.charAt(i) - 'a';
        if( currentNode.childen[idx]== null){
           currentNode.childen[idx] = new Node();
        }
        if(i==word.length() -1){
            currentNode.childen[idx].endOfWord = true;
        }
        currentNode = currentNode.childen[idx];

    }
   } 

   public static boolean search(String key){
    Node currentNode  = root;
      for(int i =0; i<key.length(); i++){
        int idx = key.charAt(i) - 'a';

        Node node = currentNode.childen[idx];
        if(node == null){
            return false;
        }
        if(i == key.length()-1 && node.endOfWord == false){
            return false;
        }

        currentNode = currentNode.childen[idx];
      }
      return true;
   }

   public static void main(String args[]){
    String words[] = {"the","a","there","their","any"};
    for(int i = 0; i<words.length;i++){
        insert(words[i]);
    }

    boolean result = search("the");
    boolean result2 = search("ther");
    boolean result3 = search("there");
    System.out.println(result);
    System.out.println(result2);
    System.out.println(result3);
   }

    
}
