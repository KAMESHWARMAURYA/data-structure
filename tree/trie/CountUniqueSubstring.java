package tree.trie;

/*
 * Given a string of length n of lower case alphabet charectors, we need to count total number of distinct 
 * sub strings of this string.
 * 
 * String str = "ababa"
 * output : 10
 */

public class CountUniqueSubstring {

    // approach:
    // find all suffix of string
    // create trie from suffix
    //count node of trie
   static Node root = new Node();
    public static void insert(String word){
       Node currentNode = root;
       for(int i=0;i<word.length();i++){
        int idx = word.charAt(i) -'a';
        if(currentNode.childen[idx] == null){
            currentNode.childen[idx] = new Node();
        }
        if(i == word.length()-1){
            currentNode.childen[idx].endOfWord = true;
        }
        currentNode = currentNode.childen[idx];
       }
    }

    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i= 0; i<26; i++){
           if(root.childen[i] != null){
            count = count + countNode(root.childen[i]);
           }
        }
        return count + 1;
    }

    public static void main(String args[]){
        String str = "apple";
        for(int i = 0; i <str.length(); i++){
            String subffix = str.substring(i);
            insert(subffix);
        }

    System.out.println(countNode(root));
    }
    
}
