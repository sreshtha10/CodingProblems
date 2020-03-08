#include<stdio.h>
int main()
{
    /* 1*/
    for (int i = 1; i <= 5; i++)

    {
      for (int j = 1; j<=i; j++)
      {
          printf("*");
      }
        printf("\n");
    }
   printf("\n");
    /* 2 */

    for (int i = 1; i <= 5; i++)
    {
        for (int j= 1; j<=i; j++)
        {
            printf("%d",j);
        }
     printf("\n");   
    }

    int k = 1;
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j<= i; j++,k++)
        {
            printf("%d",k);
            printf("%c",32);

        }
        printf("\n");
    }
   printf("\n");
    /* 3 */
    for (int i = 1; i <=5; i++)
    {
        k =1;
        for (; k <= i; k++)
        {
            printf("%c",'A'+ k-1);
        }
        printf("\n");
    }
    /* 4*/
   printf("\n");
    for (int i = 1; i <= 5; i++)
    {
        k = 1;
        for (; k<=i; k++)
        {
            printf("%d",i);
        }
        printf("\n");
    }
   printf("\n");
    /*5 */
    for (char i = 65; i <= 69; i++)
    {
    
        for (char j = 65; j <= i; j++)
        {
            printf("%c",i);
        }
        printf("\n");
    }
   printf("\n");
    /* 6 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = i ; j >= 1; j--)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    
    printf("\n");
    /* 7 */
    for (int i = 5; i >=1 ; i--)
    {
        for (int j = 1; j<=i; j++)
        {
            printf("%d",i);
        }
        printf("\n");
    }
    
   printf("\n");

   /* 8 */
    for (int i = 5; i >= 1; i--)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    printf("\n");

    /* 9 */
    for (int i = 5; i >= 1; i--)
    {
        for (int j = i ; j >= 1; j--)
        {
            printf("%d",j);
        }
        printf("\n");
    }

    printf("\n");

    /* 10 */
    for (int i = 5; i >= 1; i--)
    {
        for (int j = i; j <= 5; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    

    

}