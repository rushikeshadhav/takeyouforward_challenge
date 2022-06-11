import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
        // Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr.get(i))){
                return arr.get(i);
            }
            map.put(arr.get(i), i);
        }
        return -1;
    }
}
