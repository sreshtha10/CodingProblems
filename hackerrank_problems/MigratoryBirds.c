#include<stdio.h>
#include<stdlib.h>
int calc(int *arr,int n)
{
    int *vector = (int*)malloc(n*sizeof(int));
    int count,id,max =0;
    for(int i = 0;i<n;i++)
        {
            if (*(vector+i) == 1)
            {
                continue;
            }
            count =1;
            for(int j = i+1;j<n;j++)
            {
                if(*(arr+i) == *(arr+j))
                {
                    count++;
                    *(vector+j) = 1;
                }
            }
            if(count> max)
            {
                max = count;
                id = *(arr+i);
            }
            else if(count  == max && *(arr+i)<id)
            {
                id  = *(arr+i);
            }
        }
    return id;
}
int main()
{
    int n;
    scanf("%d",&n);
    int *arr = (int*)malloc(n*sizeof(int));
    for(int i = 0;i<n;i++)
    {
        scanf("%d",(arr+i));
    }
    printf("%d",calc(arr,n));


    
}
