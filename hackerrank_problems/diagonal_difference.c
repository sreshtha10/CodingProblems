#include<stdio.h>
int main()
{
    int n,s1 = 0,s2= 0;
    scanf("%d",&n);
    int a[n][n];
    for (int i = 0; i< n;i++) 
    {
        for(int j= 0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
            if(i == j)
            {
                s1= s1 + a[i][j];    
            }
            if( i+j == n-1)
            {
                s2 = s2+ a[i][j];
            }
        }
    }
    if(s2-s1>=0){
        printf("%d",s2-s1);
    }
    else
        printf("%d",s1-s2);
}
