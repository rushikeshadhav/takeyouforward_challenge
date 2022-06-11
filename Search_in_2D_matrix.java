
/*
    Time Complexity: O(M*N)
    Space Complexity: O(1)

    Where M and N are the number of rows and columns.
*/

import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
		int start = 0, end = m * n - 1;

        // Binary search.
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = mat.get(mid / n).get(mid % n);

            if (target < val) {
                end = mid - 1;
            } else if (target > val) {
                start = mid + 1;
            } else {
                return true;
            }
        }

        return false;
	}
}
