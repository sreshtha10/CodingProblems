#include<stdio.h>
#include<stdlib.h>
typedef  enum {
    F, T
} boolean;
int calc(int *arr,int n)
{
    boolean vector;
    vector = F;
    int count,id,max =0;
    for(int i = 0;i<n;i++)
        {
            vector = F;
            if (vector == T)
            {
                continue;
            }
            count =1;
            for(int j = i+1;j<n;j++)
            {
                if(*(arr+i) == *(arr+j))
                {
                    count++;
                    vector = T;
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
