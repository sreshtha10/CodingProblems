#include<stdio.h>
int main()
{
    int n,sum = 0,count  = 0;
    scanf("%d",&n);
    int arr[n];
    for (int i = 0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    int visit[100]={0};
    for(int i = 0;i < n;i++)
    {
        if (visit[i] == 1)
        {
            continue;
        }
        count = 1;
        for (int j=i+1;j<n;j++)
        {
            if(arr[i] == arr[j])
            {
                    count += 1;
                    visit[j] = 1;
            }

        }
        sum += (count/2);
    }

    printf("%d",sum);
}
