#include <stdio.h>
int main(void) {
    int test,k;
    scanf("%d",&test);
    while(test !=0)
    {
        scanf("%d",&k);
        k = k-1;
        char chessboard[8][8];
        chessboard[0][0] = 'O';
        for(int i = 0;i<8;i++)
        {
            for(int j = 0;j<8;j++)
            {
                if(k != 0 && chessboard[i][j] != 'O')
                {
                    chessboard[i][j] = '.';
                    k --;
                }
                else
                {
                    if(chessboard[i][j] != 'O')
                    {
                        chessboard[i][j] = 'X';
                    }
                }
                printf("%c",chessboard[i][j]);
            }
            printf("\n");
        }
        test--;
    }
	return 0;
}

