#include<stdio.h>
int main(){
    int a[3],b[3],c1= 0,c2= 0;
    for (int i = 0; i <= 2; i++) {
        scanf("%d",&a[i]);
    }
    for (int i = 0; i <= 2; i++) {
    scanf("%d",&b[i]);
    }
    for (int i =0 ; i <= 2; i++) 
    {
        if (a[i]> b[i]) 
        {
            c1++;
        }
        else if (a[i] < b[i]){
            c2++;
        }
        else {
            continue;
        }

    }
    printf("%d %d",c1,c2);

    
}