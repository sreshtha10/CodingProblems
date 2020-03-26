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

    /* 11 */
    for (int i = 5; i >= 1; i--)
    {
        for (int j = i; j <= 5; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    
    printf("\n");
    /* 10 */
    for ( int i = 5; i >= 1; i--)
    {
        for (int j = 5; j>= i; j--)
        {
            printf("%d",j);
        }
        printf("\n");
    }

    printf("\n");

    /* 12 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 5; j >= i; j--)
        {
            printf("%d",i);
        }
        printf("\n");
    }
    printf("\n");
    /* 13 */

    for (int i = 5; i >= 1; i--)
    {
        for (int j = 1; j <= 6-i; j++)
        {
            printf("%d",i);
        }
        printf("\n");
    }
    
    printf("\n");

    /* 14 */
    for (int i = 1; i <= 5; i++)
    {
        int k = i;
        for (int j = 1 ; j <= i; j++,k++)
        {
            printf("%d",k);
        }
        printf("\n");
    }
    
    printf("\n");

    /* 15 */
    char a = 'A';
    for (int i = 1; i <= 5; i++)
    {
        for (int j= 1; j <= i; j++,a++)
        {
            printf("%c",a);
        }
        printf("\n");
    }
    printf("\n");
    /* 16 */
    for (int i = 5; i >= 1; i--)
    {
      for (int j = i; j <= 2*(i)-1; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    
    printf("\n");

    /* 17 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 5; j>= i; j--)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    
    printf("\n");

    /* 18 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = i; j<= 5; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    
    printf("\n");

    /* 19 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            if (j %2 == 0)
            {
                printf("0");
            }
            else
            {
                printf("1");
            }
            
        }
        printf("\n");
    }
    
    printf("\n");

    /* 20 */
    for (int i = 1; i <=5 ; i++)
    {
        for (int j = 1; j <= i ; j++)
        {
            if ( i % 2 == 0)
            {
                printf("0");
            }
            else
            {
                printf("1");
            }
            
        }
        printf("\n");
    }
    
    printf("\n");

    /* 21 */
    int b  =1;
    for (int i = 1 ; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++,b++)
        {
            printf("%d",b%2);
            
        }
        printf("\n");
    }
        
    printf("\n");


    /* 22 */
    for (int i = 1; i <= 5; i++)
    {
        if (i == 1 || i == 5)
        {
            for (int j = 1; j <= 5; j++)
            {
                printf("*");
            }
            
        }
        else
        {
            printf("*    *");
        }
        
        printf("\n");
    }
    printf("\n");
    /* 23 */ 
    for (int i = 1; i <= 5; i++)
    {   
        for (int j = 1; j <= i; j++)
        {
         if ( i != 5)
         {   
            if (j == i || j == 1)
            {
                printf("1");
            }
            else
            {
                printf("0");
            }
            
        }
        else
        {
            printf("1");
        }
           
    }
        printf("\n");
    }

    printf("\n");

    /* 24 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            printf("%c",'a'+ j-1);
        }
     printf("\n");   
    }

    printf("\n");

    /* 25 */
    for (int i = 1; i<= 9; i=i+2)
    {
        for (int j =i ; j <= 9; j =j+2)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    
    printf("\n");

    /* 26 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            printf("1");
        }
        printf("\n");
    }
    
    printf("\n");

    /* 27 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            printf("%d",i);
        }
        printf("\n");
    }
    
    printf("\n");
    
    /* 28 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        if (i % 2 == 0)
        {
            printf("0");
        }
        else
        {
            printf("1");
        }
        

        printf("\n");
    }
    
    printf("\n");

    /* 29 */ 
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        if (j % 2 != 0)
        {
            printf("0");
        }
        else
        {
            printf("1");
        }
        

        printf("\n");
    }
    
    printf("\n");
    /* 30 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    
    printf("\n");

    /* 32 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = i; j <= i +4; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    
    printf("\n");

    /* 31 */
    for (int i = 1; i <= 5; i++)
    {
        if (i == 1 || i == 5)
        {
            for (int j = 1; j <= 5; j++)
            {
                printf("1");
            }
            
        }
        else
        {
            printf("10001");
        }
        
        printf("\n");
    }
    printf("\n");

    /* 33 */
    for (int i = 1; i <= 5; i++)
    {
        if (i %2 != 0)
        {
            for (int j = 1; j <=5; j++)
            {
                if ( j %2 != 0)
                {
                    printf("1");
                }
                else
                {
                    printf("0");
                }
                
            }
            
        }
        else
        {
            for (int j = 1; j <= 5; j++)
            {
                if (j %2 == 0)
                {
                    printf("1");
                }
                else
                {
                    printf("0");
                }
                
            }
            
        }
        printf("\n");
    }

    printf("\n");

    /* 34 */
    for (int i = 1; i <= 5; i++)
    {
        if (i == 3)
        {
            for (int j = 1; j <= 5; j++)
            {
                printf("0");
            }
            
        }
        else
        {
            for (int j = 1; j<= 5; j++)
            {
                if (j == 3)
                {
                    printf("0");
                }
                else
                {
                    printf("1");
                }
                
            }
            
        }
        printf("\n");
    }
    
    printf("\n");
    

    /* 35 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            if (j == i || j == 6-i)
            {
                printf("1");
            }
            else
            {
                printf("0");
            }
            
        }
        printf("\n");
    }
    printf("\n");
    /* 36 */

    /* 37 */
    for (int  i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            if (j == i && j == 6-i)
            {
                printf("0");
            }
            else
            {
                printf("1");
            }
            
        }
        printf("\n");
    }
    printf("\n");
    /* 38*/
    for (int i = 1; i <= 5; i++)
    {
        int count = 1;
     for (int j = i; count<=i; j--,count++)
     {
        printf("%d",j);
     }
    for (int j = 2; count<=5; count++,j++)
    {
        printf("%d",j);
    }
    printf("\n");
    }
    printf("\n");
    /* 39 */
    for (int i = 1; i <= 5; i++)
    {
        int count = 1;
        for (int j = i; count <=6-i; j++,count++)
        {
            printf("%d",j);
        }
        for (; count<=5;count++)
        {
            printf("%d",6-count);
        }
        
        printf("\n");
    }
    
    printf("\n");

    /*40 */
    for (int i = 1; i <=5; i++)
    {
        int count = 1;
        for (int j = i; j <= 5; j++,count++)
        {
            printf("%d",j);
        }
        for (; count <= 5; count++)
        {
            printf("5");
        }
        printf("\n");
    }
    
    printf("\n");
    /* 41 */
    for (int i = 5; i>=1; i--)
    {
        int count =1 ;
        int j = 5;
        for (; j >= i; j--,count++)
        {
            printf("%d",j);
        }
        for (; count <= 5; count++)
        {
            printf("%d",i);
        }
        printf("\n");
    }

    printf("\n");
    /*42 */
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= (2*i)-1; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }
    printf("\n");

    /* 43 */
    for (int i = 1; i <=5; i++)
    {
        if(i%2 != 0)
        {
            for (int j = 1; j<= (2*i)-1; j=j+2)
            {
                printf("%d",j);
            }
        }
        else
        {
            for (int j = 2; j <= 2*i; j=j+2)
            {
                printf("%d",j);
            }
        }
        printf("\n");
    }
    printf("\n");

    /* 44 */
    for (int i = 1; i <=5; i++)
    {
        int j =1;
        for (; j<=(2*i)-1; j=j+2)
        {
            printf("%d",j);
        }
        for (int z = j-4; z>= 1;z =z-2)
        {
            printf("%d",z);
        }
        
        printf("\n");
    }

    printf("\n");

    /* 45 */
    for (int i = 1; i <=5; i++)
    {
        int j =2;
        for (; j<=(2*i); j=j+2)
        {
            printf("%d",j);
        }
        for (int z = j-4; z>= 1;z =z-2)
        {
            printf("%d",z);
        }
        
        printf("\n");
    }

    printf("\n");

    /* 46 */
    for (int i = 1; i <=5; i++)
    {
        int j =1;
        for (; j<=i;j++)
        {
            printf("%d",j);
        }
        for (int z = j-2; z>= 1;z =z-1)
        {
            printf("%d",z);
        }
        
        printf("\n");
    }

    printf("\n");  

    /* 47 */
    
    /* 48 */
    int x = 1;
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <=i; j++,x++)
        {
            printf("%d%c",x,32);
        }
        printf("\n");
    }
    
    
