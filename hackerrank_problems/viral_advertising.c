#include<stdio.h>
#include<math.h>
int main()
{
    int n;
    int l_recipents = 2;
    int sum = 2;
    int recipents = 5;
    scanf("%d",&n);
    for(int i = 2;i<=n;i++)
    {
        recipents =  l_recipents*3;
        l_recipents = floor(recipents/2);
        sum += l_recipents;
    }
    printf("%d",sum);
}
