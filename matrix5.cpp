#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, m;
    cin >> n >> m;
    vector<vector<int>> a(n,vector<int>(m));
    for(int i = 0; i<n ;i++){
        for(int j = 0; j<n; j++){
            cin >> a[i][j];
        }
    }
    int mini = INT_MAX;
    for(int i = 0 ;i< n ; i++){
        for(int j = 0; j<m; j++){
            mini = min(mini,a[i][j]);
        }
    }
    cout << mini;
}
