#include<stdio.h>
int main() {
    int i = 0;
    char str[1000] = {0};
    scanf("%[^\n]",str);
    for(i = 0;i<1000;i++)
    {
        if(str[i] == 0)
        {
            break;
        }
        if(str[i] == '\0' || str[i] == ' ')
        {
            printf("\n");
        }
        else{
            printf("%c",str[i]);
        }
        
    }

    return 0;
}
