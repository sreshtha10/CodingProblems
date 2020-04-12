#include<stdio.h>
#include<math.h>
int main()
{
    int n;
    scanf("%d",&n);
    int scores[n];
    for(int i =0;i<n;i++)
    {
        scanf("%d",&scores[i]);
    }
    int inc = 0, dec = 0;
    long int min = pow(10,8),max = 0;
    for(int i = 1;i<n;i++)
    {
        if(scores[i-1]>max)
        {
            max = scores[i-1];
        }
        if(scores[i-1]<min)
        {
            min = scores[i-1];
        }
        if(scores[i] >max)
        {
            inc++;
        }
        if(scores[i] < min)
        {
            dec++;
        }
    }
    printf("%d %d",inc,dec);
}
