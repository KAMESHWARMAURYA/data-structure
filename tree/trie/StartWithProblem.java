package tree.trie;

/*
 * create a function startWith(String prefix) for a trie,
 * Returns true if there is a previoisly inserted string word that has the prefix and false otherwise.
 * 
 * words[] = {"apple","app","mango","man","woman"}
 * exampale 1 : 
 * prefix= "app"
 * output : true
 * 
 * example 2:
 *   prefix= "moon";
 *   output : false
 */

public class StartWithProblem {
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

    public static boolean startWith(String prefix){
        Node currentNode = root;
        for(int i=0;i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(currentNode.childen[idx] == null){
                   return false;
            }
            currentNode = currentNode.childen[idx];
        }
        return true;
    }

    public static void main(String args[]){
        String words[] = {"apple","app","mango","man","woman"};
        for(int i=0; i<words.length;i++){
            insert(words[i]);
        }

        boolean result = startWith("moon");
        System.out.println(result);
    }

    
}
