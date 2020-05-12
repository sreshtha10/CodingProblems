#include<stdio.h>
#include<stdlib.h>
int calheight(int cycle)
{
    int height = 1;
    for(int i =1;i<=cycle;i++)
    {
        if(i%2 == 0)
        {
            height += 1;
        }
        else {
            height = height*2;
        }
    }
    return height;
}
int main()
{
    int test_cases;
    scanf("%d",&test_cases);
    int* cycles;
    cycles = (int*)malloc(test_cases*sizeof(int));
    for(int i = 0;i<test_cases;i++)
    {
        scanf("%d",cycles+i);
    }
    for(int i = 0;i<test_cases;i++)
    {
        printf("%d\n",calheight(*(cycles+i)));
    }

}
