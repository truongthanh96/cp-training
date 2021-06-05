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
#include <numeric>
 
typedef long double LD;
typedef long long LL;
typedef int64_t I64;
// Many of the solutions require mod by 10e^9+7
#define MOD 1000000007
// The least significant bit
#define LSB(i) ((i) & -(i))
 
using namespace std;

int cal(int n, int a[][3]){
    int r = 0;
    for(int i = 0; i < n; i++){
        int sum = 0;
        sum = accumulate(a[i], a[i] + 3, sum);
        if ( sum >= 2) r++;
    }
    return r;
}
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    cin >> n;
    int a[n][3];
    for(int i = 0; i < n; i ++){
        for(int j = 0; j < 3; j++){
            cin >> a[i][j];
        }
    }
    cout << cal(n, a) << "\n";

    return 0;
} 