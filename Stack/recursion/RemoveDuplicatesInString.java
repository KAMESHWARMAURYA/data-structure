package Stack.recursion;

// Remove Duplicats Char from String

public class RemoveDuplicatesInString {
    public static boolean map[] = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currentChar = str.charAt(idx);
        if(map[currentChar - 'a']){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString = newString + currentChar;
            map[currentChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }

    }

    public static void main(String args[]){

        String str = "abccda";
        removeDuplicates(str, 0, "");

    }
    
}
