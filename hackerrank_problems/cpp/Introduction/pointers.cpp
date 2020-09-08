#include <stdio.h>
#include<cstdlib>

void update(int *pa,int *pb) 
{
    int temp;
    temp = *pa;
    *pa += *pb;
    *pb = abs(temp-(*pb));
        
}

int main() {
    int a, b;
    int *pa = &a, *pb = &b;
    
    scanf("%d %d", &a, &b);
    update(pa, pb);
    printf("%d\n%d", a, b);

    return 0;
}
