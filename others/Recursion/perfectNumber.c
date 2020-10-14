#include<stdio.h>
int properDivisor(int number,int divisor){
    if(divisor == 0){
        return 0;
    }
    if(number%divisor == 0){
        return divisor + properDivisor(number,divisor-1);
    }
    return properDivisor(number,divisor-1);
}

int main(void){
    int number;
    printf("Enter the number\n");
    scanf("%d",&number);
    int sum = properDivisor(number,(int)number/2);
    if(sum == number){
        printf("Perfect divisor\n");
    }
    else{
        printf("Sum = %d, hence not a Perfect divisor\n",sum);
    }
    return 0;
}

