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
    int oc = 0, oe = 0;
    for(int i = 0; i<n ;i++){
        for(int j = 0; j<n; j++){
            if(a[i][j]%2 == 0) oe++;
            else oc++;
        }
    }
    cout << "odd " << oc << endl;
    cout << "even " << oe << endl;
}
