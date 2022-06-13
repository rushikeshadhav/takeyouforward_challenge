import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] arr, int n, int K)  {

	    // Write your code here.
        ArrayList <ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i = 0; i<arr.length - 2; i++){
            if(i == 0 || i>0 && arr[i] != arr[i-1]){
                int lo = i+1;
                int hi = arr.length - 1;
                int sum = K - arr[i];
                while(lo < hi){
                    if(arr[lo] + arr[hi] == sum){
                        ArrayList<Integer> list = new ArrayList<>();

                    list.add(arr[i]);
                    list.add(arr[lo]);
                    list.add(arr[back]);
                    ans.add(list);
                        while(lo < hi && arr[lo] == arr[lo+1]) lo++;
                        while(lo < hi && arr[hi] == arr[hi-1]) hi--;

                        lo++;
                        hi--;
                    }
                    else if(arr[lo] + arr[hi] < sum){
                        lo++;
                    }else {
                        hi--;
                    }
                }
            }
        }
        return ans;

	}
}
