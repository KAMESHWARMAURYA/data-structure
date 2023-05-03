package tree.trie;

/*
 * Find the longest string in the words such that every prifix of it is also in the words
 * 
 * words = ["a", "banana","ap","app","appl","apply","apple"]
 * 
 * output : apple
 */

public class LongestWordWithAllPrefix {

    static Node root = new Node();

    public static void insert(String word){
        Node currentNode = root;
       for(int i = 0; i< word.length();i++){
        int idx = word.charAt(i)-'a';
        if(currentNode.childen[idx] == null){
            currentNode.childen[idx] = new Node();
        }
        if(i == word.length()-1){
            currentNode.childen[idx].endOfWord = true;
        }
        currentNode = currentNode.childen[idx];
        
       } 

    }

   static String ans  = "";
   public static void longestWord(Node root, StringBuilder temp){
    if(root == null){
        return;
    }
    for(int i = 0 ;i<26;i++){
        if(root.childen[i] != null && root.childen[i].endOfWord ==true){
            temp.append((char)(i+'a'));
            if(temp.length() > ans.length()){
                ans = temp.toString();
            }
            longestWord(root.childen[i], temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
   } 

   public static void main(String args[]){
    String words[] = {"a", "banana","ap","app","appl","apply","apple"};
    for(int i = 0;i<words.length;i++){
        insert(words[i]);
    }
    longestWord(root,new StringBuilder(""));
    System.out.println(ans);
   }
    
}
