#include<stdio.h>
int main()
{
    int x1,x2,v1,v2,d1=0,d2=0;
    scanf("%d %d %d %d",&x1,&v1,&x2,&v2);
    for(int i = 1;i<10000;i++)
    {
        x1+=v1;
        x2+=v2;
        if(x1 == x2)
        {
            printf("YES");
            break;
            
        }
    }
    
    if(x1 != x2)
    {
        printf("NO");
    }
    return 0;
    
}
