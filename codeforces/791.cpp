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

// a * 3^x >= b * 2^x
// (3/2)^x = b /a 
// x = log(b /a) / log( 3 /2) 
string cal(int a, int b){
    return to_string((int)floor(log(b * 1.0 /a) / log( 3.0 / 2) ) + 1);
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int a, b;
    cin >> a >> b;
    cout << cal(a,b) << "\n";
    return 0;
}