#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";
    int a;
    double b;
    char c[100];
    scanf("%d",&a);
    scanf("%lf",&b);
    scanf("%*[\n] %[^\n]", c);
    printf("%d\n",a+i);
    printf("%.1lf\n",d+b);
    printf("%s%s",s,c);
    return 0;
}

/*2 method*/
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int i = 4;
    double d = 4.0;
    char s[] = "HackerRank ";
   int a;
    double b;
    char c[100];
    scanf("%d",&a);
    scanf("%lf\n",&b);
    fgets(c,sizeof(c),stdin);
    printf("%d\n",a+i);
    printf("%.1lf\n",d+b);
    printf("%s",s);
    puts(c);
    return 0;
}
