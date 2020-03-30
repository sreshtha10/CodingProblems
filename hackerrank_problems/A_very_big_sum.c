#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
int main()
{
    long long int n,a[10],sum= 0;
    sum = 0;
    scanf("%lld",&n);
    for (int i = 0; i <= n-1; i++)
    {
        scanf("%lld",&a[i]);
        sum = sum + a[i];
    }
    printf("%lld",sum);
}
