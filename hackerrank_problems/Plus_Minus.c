#include <stdio.h>
int main()
{
    int n;
    float s1= 0,s2= 0,s3= 0;
    scanf("%d",&n);
    int a[n];
    for (int i = 0;i < n;i++)
    {
        scanf("%d",&a[i]);
        if (a[i] > 0)
        {
            s1++;
        }
        else if (a[i] < 0)
        {
            s2++;
        }
        else
        {
            s3++;
        }
    }

    printf("%f \n",s1/n);
    printf("%f \n",s2/n);
    printf("%f",s3/n);
    
    return 0;
}
