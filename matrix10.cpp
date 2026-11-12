#include <bits/stdc++.h>
using namespace std;

int main() 
{
    int n, m;
    cin >> n >> m;
    vector<vector<int>> a(n,vector<int>(m));
    for(int i = 0; i<n ;i++){
        for(int j = 0; j<m; j++){
            cin >> a[i][j];
        }
    }
    for(int i = 0; i<n; i++){
        for(int j = 0; j<m; j++){
            if(i<=j) cout << a[i][j] << " ";
            else cout << 0 << " ";
        }
        cout << endl;
    }
}
