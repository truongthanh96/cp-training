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
#include <cctype>
 
typedef long double LD;
typedef long long LL;
typedef int64_t I64;
// Many of the solutions require mod by 10e^9+7
#define MOD 1000000007
// The least significant bit
#define LSB(i) ((i) & -(i))
 
using namespace std;

int cal(string s1, string s2){
    int r = 0;
    std::transform(s1.begin(), s1.end(), s1.begin(),
    [](unsigned char c){ return std::tolower(c); });
    std::transform(s2.begin(), s2.end(), s2.begin(),
    [](unsigned char c){ return std::tolower(c); });
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
    string s1, s2;
    cin >> s1 >> s2;
    cout << cal(s1, s2) << "\n";

    return 0;
} 