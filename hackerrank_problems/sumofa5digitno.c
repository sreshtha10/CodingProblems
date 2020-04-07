#include <stdio.h>
int main() {
	
    int n,sum = 0;
    scanf("%d", &n);
    int a[5] = {0};
    for(int i = 0;i<5;i++)
    {
        a[i]= n%10;
        n = n/10;
        sum = sum + a[i];
        
    }
    printf("%d",sum);
    
}
