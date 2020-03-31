#include<stdio.h>
int main()
{
    int age,max =0,count= 0;
    scanf("%d",&age);
    int heights[age];
    for(int i = 0;i<age;i++)
    {
        scanf("%d",&heights[i]);
        if(heights[i]>= max)
        {
            max = heights[i];
        }
    }
    for(int i = 0;i< age;i++)
    {
        if(heights[i]== max)
        {
            count++;
        }
    }
    printf("%d",count);
}
