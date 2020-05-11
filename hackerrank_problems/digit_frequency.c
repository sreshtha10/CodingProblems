#include <stdio.h>
int main() {

    char a[1000];
    scanf("%s",a);
    int frequency[10] ={0};
    for(int i = 0;a[i]!='\0';i++)
    {
        if( ((int)a[i]) >= 48  && ((int)a[i]) <= 57)
        {
            frequency[((int)a[i])-48] += 1;
        }
    }
    for(int i = 0;i<10;i++)
    {
        printf("%d%c",frequency[i],32);
    }
    return 0;
}
