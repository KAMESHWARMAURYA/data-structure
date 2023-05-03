package HashMap;

import java.util.HashSet;

public class UnionOf2Arrays {

    public static void unionOfTwoArrays(int arr1[], int arr2[]){
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hashSet.add(arr1[i]);
        }
        for(int j = 0;j<arr2.length;j++){
            hashSet.add(arr2[j]);
        }
        System.out.println(hashSet.size());

    }

    public static void main(String args[]){
        int[] arr1 = {2,3,4,6};
        int[] arr2 = {4,2,3,5,6};

        unionOfTwoArrays(arr1, arr2);
    }
    
}
