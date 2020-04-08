#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    for(int i = n;i>=1;i--)
    {
        int count = n;
        int  j = n;
        for(;count>=1;count--)
        {
            if(count>i)
            {
                printf("%d%c",j,32);
                j--;
            }
            else
            {
                printf("%d%c",j,32);
            }
        }
        for(int k =i;count<n-1;count++)
        {
            if(count>=i-1)
            {
                k++;
                printf("%d%c",k,32);
            }
            else{
                printf("%d%c",k,32);
            }
        }
        printf("\n");
    }
    
    for(int i =1;i<=n-1;i++)
    {
        int count = n;
        for(int j = n;count>=1;count--)
        {
            if(j>i+1)
            {
                printf("%d%c",j,32);
                j--;
            }
            else
            {
                printf("%d%c",j,32);
            }
        }
        for(int j =i+1;count<n-1;count++)
        {
            if(count>=i-1)
            {
                printf("%d%c",j,32);
                j++;
            }
            else
            {
                printf("%d%c",j,32);
            }
        }
        printf("\n");
    }
}
