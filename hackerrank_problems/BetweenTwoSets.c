#include<stdio.h>
int main()
{
    int n,m;
    scanf("%d %d",&n,&m);
    int a[n],b[m];
    for(int i = 0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(int i = 0;i<m;i++)
    {
        scanf("%d",&b[i]);
    }
    int count = 0;
    for(int i = 1;i<1000;i++)
    {
        int c = 0,d = 0;
        for(int j = 0;j<n;j++)
        {
            if(i%a[j] == 0)
            {
                c++;
            }
        }   
        for(int k = 0;k<m;k++)
        {
            if(b[k]%i == 0)
            {
                d++;
            }
        }
        if(c == n && d == m)
        {
            count++;
        }
    }
    printf("%d",count);
}
