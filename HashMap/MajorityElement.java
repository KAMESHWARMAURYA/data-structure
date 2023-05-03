package HashMap;

import java.util.HashMap;
import java.util.Map;

/*
 * given an integer array of size n, finds all elements that appear more than n/3 times
 */

public class MajorityElement {

    public static void majorityElement(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            if (i.getValue() > arr.length / 3) {
                System.out.println(i.getKey());
            }
        }
    }

    public static void main(String args[]) {

        int[] arr = { 1, 2 };
        majorityElement(arr);

    }

}
