#include <bits/stdc++.h>
#include <iostream>
#include <vector>
using namespace std;

int main() {
	int n;
	cin >> n;
	for(int i =1 ; i<n ; i++){
        int sqr = i*i;
        int cub = sqr *i;
        cout << sqr << ' ' << cub << endl;
	}
}
