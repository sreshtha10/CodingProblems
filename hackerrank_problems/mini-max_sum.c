#include<math.h>
#include<stdio.h>
int main()
{
    long long int a[5],s[5]= {0},sum= 0,min = pow(10,20),max=0;
    for(int i = 0;i< 5;i++)
    {
        scanf("%lld",&a[i]);
        sum = sum+a[i];
    }
    for(int i = 0;i< 5;i++)
    {
        s[i]= sum-a[i];
    }
    for(int i= 0;i<5;i++)
    {
        if(s[i]>=max)
        {
            max = s[i];
        }
        if(s[i] <= min)
        {
            min = s[i];
        }   
    }
    printf("%lld %lld",min,max);
}
