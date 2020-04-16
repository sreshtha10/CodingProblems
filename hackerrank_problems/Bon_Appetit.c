#include<stdio.h>
int main()
{
    int n,k,charged,actual = 0;
    scanf("%d %d",&n,&k);
    int bill[n];
    for(int i = 0;i<n;i++)
    {
        scanf("%d",&bill[i]);
        if(i != k){
            actual += bill[i];
        }
    }
    actual = actual/2;
    scanf("%d",&charged);
    if (charged != actual)
    {
        printf("%d",charged-actual);
    }
    else{
        printf("Bon Appetit");
    }
}
