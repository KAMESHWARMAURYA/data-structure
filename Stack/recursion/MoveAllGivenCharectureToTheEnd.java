package Stack.recursion;


public class MoveAllGivenCharectureToTheEnd {

    public static void moveGivenCharToEnd(String str, int idx, String newString, int count){
        if(idx == str.length()){
            for(int i = 0;i<count;i++){
                newString = newString + 'x';
            }
            System.out.print(newString);
            return;
        }
        
        char currentchar = str.charAt(idx);
        if(currentchar == 'x'){
            count = count +1;
            moveGivenCharToEnd(str,idx+1,newString,count);
        }else{
            newString = newString + currentchar;
            moveGivenCharToEnd(str, idx+1, newString, count);
        }

    }

    public static void main(String srgs[]){

        String str = "xbcdfxxkhuxx";
        moveGivenCharToEnd(str,0,"",0);

    }
    
}
