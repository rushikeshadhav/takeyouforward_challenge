import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
                 // Write your code here.
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        ArrayList<Long> prev = null;
        ArrayList<Long> curr = null;
        
        for(int i = 0; i<n; i++){
            curr = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(j == 0 || j == i){
                    curr.add(1L);
                }else{
                    curr.add(prev.get(j) + prev.get(j-1));
                }
            }
            prev = curr;
            ans.add(prev);
        }
        return ans;
	}
}
