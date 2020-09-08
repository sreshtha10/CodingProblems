#include <sstream>
#include <iostream>
using namespace std;
int main() {
    string a;
    cin >> a;
    for(int i = 0;i<a.size();i++)
    {
        if(a[i] != ',')
        {
            cout << a[i];
        }
        else{
            cout << "\n";
        }
    }
    
    return 0;
}
