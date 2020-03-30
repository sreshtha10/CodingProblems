#include <stdio.h>
int main()
{
    int n,a[n],sum = 0;
    scanf("%d",&n);
    for (int i = 0; i <= n-1; i++)
    {
        scanf("%d",&a[i]);
        sum = sum + a[i];
    }
    printf("%d",sum);
}
