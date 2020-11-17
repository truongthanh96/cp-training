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

string cal(int n, string s){
    int a = 0;
    int d = 0;
    for(char& c : s) {
        if (c == 'A') a += 1;
        else if (c == 'D') d+= 1;
    }   
    return a == d ? "Friendship"  :  a > d ? "Anton" : "Danik";
}
 
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    int n;
    string s;
    cin >> n >> s;
    cout << cal(n, s) << "\n";

    return 0;
}