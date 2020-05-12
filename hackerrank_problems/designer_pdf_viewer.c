#include<stdio.h>
int main()
{
    int heights[26],max= 0,count = 0;
    for(int i = 0;i<26;i++)
    {
        scanf("%d",&heights[i]);
    }
    char a[10];
    scanf("%s",a);
    for(int i = 0;a[i] != '\0';i++,count++)
    {
        if(heights[((int)a[i])-97] > max)
        {
            max = heights[((int)a[i])-97];
        }
    }
    printf("%d",max*count);  
}
