#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <set>
#include <unordered_map>
#include <functional>
#include <stack>
#include <queue>
#include <string>
#include <sstream>
#include <algorithm>
#include <map>
#include <unordered_set>
#include <math.h>
 
typedef long double LD;
typedef long long LL;
typedef int64_t I64;
// Many of the solutions require mod by 10e^9+7
#define MOD 1000000007
// The least significant bit
#define LSB(i) ((i) & -(i))
 
using namespace std;

int cal(int n, int h, int h_p[]){
    int r = 0;
    for(int i = 0; i < n; i++){
        if( h_p[i] > h) r+= 2;
        else r += 1;
    }
    return r;
}
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int n, h;
    cin >> n >> h;
    int p_h[n];
    for(int i = 0; i < n; i++){
        cin >> p_h[i];
    }
    cout << cal(n, h, p_h) << "\n";

    return 0;
}