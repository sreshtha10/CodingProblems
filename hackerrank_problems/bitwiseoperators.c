#include<stdio.h>
int main()
{
    int n,k;
    int m1 = 0,m2 = 0,m3 = 0;
    scanf("%d",&n);
    scanf("%d",&k);
    int a[n];
    for(int i = 0; i< n;i++)
    {
        a[i] = i+1;
    }
    for(int i=0;i<n;i++)
    {
        for(int j = i+1;j<n;j++)
        {
            if((a[i]&a[j])>=m1)
            { 
                int c = (int)a[i]&a[j];
                if(c<k){
                  m1= a[i]&a[j];   
                }
            }
            if((a[i]|a[j])>=m2)
            { 
            int c = (int)a[i]|a[j];
                if(c<k){
                  m2= a[i]|a[j];   
                }
            }
            if((a[i]^a[j])>=m3)
            { 
               int c = (int)a[i]^a[j];
                if(c<k){
                  m3= a[i]^a[j];   
                }
            }
    
            
        }
        
    }
    printf("%d\n%d\n%d",m1,m2,m3);
}
