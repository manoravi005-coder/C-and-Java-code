#include <bits/stdc++.h>
#include <iostream>

using namespace std;

int main() {
    int a;
    cin >> a;
    if(a % 5 ==0 && a % 7 == 0) cout << "DIVISIBLE BY BOTH 5 AND 7";
    else if (a % 5 == 0 ) cout << "DIVISIBLE BY 5";  
    else if (a % 7 == 0 ) cout << "DIVISIBLE BY 7";
    else cout << "NOT DIVISIBLE BY BOTH 5 AND 7";
    return 0;
}
