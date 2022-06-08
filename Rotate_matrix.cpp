void rotateMatrix(vector<vector<int>> &mat, int n, int m)

{

    if(m==1||n==1)return;

    int k=0;

    while(k<n/2 && k<m/2){

        int i=k,j=k+1;

        while(j<=m-1-k){

            swap(mat[k][k],mat[i][j]);

            j++;

        }

        j--;

        i++;

        while(i<=n-1-k){

            swap(mat[k][k],mat[i][j]);

            i++;

        } 

        i--;

        j--;

        while(j>=k){

            swap(mat[k][k],mat[i][j]);

            j--;

        } 

        j++;

        i--;

        while(i>=k){

            swap(mat[k][k],mat[i][j]);

            i--;

        }

        k++;

    }

}