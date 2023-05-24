#include <bits/stdc++.h>
#define call ios::sync_with_stdio(0); cin.tie(0); cout.tie(0);
#define MX 2000005
#define MAX 0x7ffffff
#define endl '\n'
using namespace std;
typedef long long ll;

int main() {

    call;
    vector<int> V[5];

    for(int i = 0 ; i < 10; i++){
        V[1].push_back(i);
    }
    for(auto c : V[1]) cout << c << ' ';
    // result
    // 0 1 2 3 4 5 6 7 8 9
    // 각 인덱스에 동적으로 크기 할당
    cout << endl;
    vector <int> V1(10);
    for(int i = 0 ; i < 10 ; i++){
        V1.push_back(i);
    }
    for(auto d : V1) cout << d << ' ';
    // result
    // 0 0 0 0 0 0 0 0 0 0 0 1 2 3 4 5 6 7 8 9
    // 처음 초기화 값 10 뒤로 동적으로 크기 늘어남
    
}