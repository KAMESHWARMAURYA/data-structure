package tree.trie;


/*
 * Given an input string and dictionary of words,find out in the input string can be broken into a space
 *  saperated sequence of dictionary words 
 * 
 * like  : words[] = {i, like, sam, samsung,mobile,ice};
 * 
 * key = "ilikesamsung"
 * output : true
 */

public class WordBreak {

    public static boolean wordBreak(String key){

        if(key.length() == 0){
            return true;
        }
        for(int i = 1 ; i<= key.length(); i++){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);
            if(CustomeTrieNode.search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        String words[] = {"i", "like","sam","samsung"};
        for(int i = 0 ; i< words.length; i++){
          CustomeTrieNode.insert(words[i]);
        }

        boolean result = wordBreak("ilike");
        System.out.print(result);
    }
    
}
