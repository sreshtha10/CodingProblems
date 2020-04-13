#include <stdio.h>
int main()
{
    int n,d,m,sum,temp;
    scanf("%d",&n);
    int a[n];
    for(int i = 0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    scanf("%d %d",&d,&m);
    int count = 0;
    for(int i = 0;i<n;i++)
    {
        sum = 0;
        temp = 0;
        for(int j = i;j<n;j++)
        {
            if(temp<m)
            {
                sum = sum+a[j];   
                temp++;
            }
        }
        if(sum == d)
        {
            count++;
        }
    }
    printf("%d",count);
}
