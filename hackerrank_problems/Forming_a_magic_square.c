#include<stdio.h>
#include<math.h>
#include<stdlib.h>
int main()
{
    int input[3][3],min = 100;
    for(int i = 0;i<3;i++)
    {
        for (int j = 0;j<3;j++)
        {
            scanf("%d",&input[i][j]);
        }
    }
    int ouput1[8][3][3] = {{{8,3,4},{1,5,9},{6,7,2}},{{6,7,2},{1,5,9},{8,3,4}},{{2,7,6},{9,5,1},{4,3,8}},{{4,3,8},{9,5,1},{2,7,6}},{{4,9,2},{3,5,7},{8,1,6}},{{6,1,8},{7,5,3},{2,9,4}},{{2,9,4},{7,5,3},{6,1,8}},{{8,1,6},{3,5,7},{4,9,2}}};
    for(int i = 0;i<8;i++)
    {
        int cost = 0;
        for(int j = 0;j<3;j++)
        {
            for(int k = 0;k<3;k++)
            {
                if (input[j][k] != ouput1[i][j][k])
                {
                    cost += abs(input[j][k]-ouput1[i][j][k]);
                } 
            }
        }
        if(cost < min)
        {
            min = cost;
        }
    }
    printf("%d",min);
}
