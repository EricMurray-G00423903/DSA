package HashMaps;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSumHashMap {

    public static void main(String[] args) {
        
        int[] arr = {2, 7, 10, 30, 20}; // Given some int array
        int target = 9; // What two numbers in the array add up to the target 

        System.out.println(Arrays.toString(hashMapTwoSum(arr, target))); // Expected output [0, 1];

    }
    
    /*
     * Things to add for edge cases -> Handle Empty Array
     * How does it handle no answer found?
     * Could we improve the time complexity for large arrays by sorting the array first and creating a sub array of only the values which are a sum of target(less than target)
     * Would that be more or less time complex?
     */
    public static int[] hashMapTwoSum(int[] arr, int target) {

        int[] answer = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();    //Use a hashmap to store the integer(key) and the index(value)

        /*  Algorithm psuedocode -> Iterate over the passed 'arr'
         *  Take target - arr[i] = value
         * Check HashMap, see does 'value' exist
         * If it exists, the current i'th value & the 'value' we checked in hashmap for equal the target
         * Add both of their indexs to the answer
         * If it doesnt exist, add the current[i] element to the key and the i to the value in the hashmap 
        */

        for (int i = 0; i < arr.length; i++) {

            int valueCheck = target - arr[i];

            if(hashMap.containsKey(valueCheck)) {

                int hashMapIndex = hashMap.get(valueCheck);
                answer[0] = hashMapIndex;
                answer[1] = i;
                Arrays.sort(answer);

            } else {

                hashMap.put(arr[i], i);

            }
            
        }

        return answer;
    }
    
}