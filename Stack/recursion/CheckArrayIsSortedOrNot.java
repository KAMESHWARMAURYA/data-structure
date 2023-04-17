package Stack.recursion;

public class CheckArrayIsSortedOrNot {

public static boolean isArraySorted(int arr[],int idx){
    if(idx == arr.length -1){
        return true; 
    }
        if(arr[idx] < arr[idx+1]){
         return isArraySorted(arr, idx+1);
        }else{
            return false;
        }
        
}

    public static void main(String [] args){

        int arr[] = {1,2,3,5,8,6};
        boolean isTrue = isArraySorted(arr, 0);
        System.out.println(isTrue);
        
    }
    
}
