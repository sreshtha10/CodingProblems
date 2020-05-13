#include<stdio.h>
int last(int men,int candy,int start)
{
    int last_prisoner = 0;
    if(candy > men)
    {
        candy = candy - (men*(candy/(int)men));
    }
    last_prisoner = (start+candy-1)%men;
    if (last_prisoner)
    {
        return  last_prisoner;
    }
    else {
     return  men;
    }
}
int main()
{
    int t,men,candy,start;
    scanf("%d",&t);
    for(int i = 0;i<t;i++)
    {
        scanf("%d %d %d",&men,&candy,&start);
        printf("%d\n",last(men,candy,start));
    }
}
