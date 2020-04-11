#include<stdio.h>
int main()
{
    int s,t,a,b,m,n,apples = 0,oranges = 0;
    scanf("%d %d",&s,&t);
    scanf("%d %d",&a,&b);
    scanf("%d %d",&m,&n);
    int distA[m],distB[n];
    for (int i = 0;i<m;i++)
    {
        scanf("%d",&distA[i]);
        if(distA[i]+a <=t && distA[i]+a>=s)
        {
            apples++;
        }
    }
    for (int i = 0;i<n;i++)
    {
        scanf("%d",&distB[i]);
        if(distB[i]+b <= t && distB[i]+b>=s)
        {
            oranges++;
        }
    }
    printf("%d\n%d",apples,oranges);
    

}
