#include<stdio.h>
using namespace std;


int main() {
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i = 0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i = n-1;i> -1;i--)
    {
        printf("%d%c",a[i],32);
    }   
    return 0;
}
