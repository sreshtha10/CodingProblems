#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
#define BLANK ' '
#define TAB '\t'
#define MAX 50
long int stack[MAX];
char infix[MAX],char postfix[MAX];
int top = -1;

int isEmpty(){
    if(top == -1){
        return 1;
    }
    else{
        return 0;
    }
}

int white_space(char symbol){
    if(symbol == BLANK || symbol == TAB){
        return 1;
    }
    else{
        return 0;
    }
}

long int pop(){
    if(isEmpty()){
        printf("Stack Underflow\n");
        exti(1);
    }
    return stack[top--];
}

void push(long int symbol){
    if(top >= MAX-1){
        printf("Stack Overflow\n");
        return;
    }
    stack[++top] = symbol;
    return;
}


long int eval_postflix(){
    long int a,b,tmp,result;
    for(unsigned int i = 0;i<strlen(postfix);i++){
        if(postfix[i] <= '9' && postfix[i] >= '0'){
            push(postfix[i]);
        }
        else{
            a = pop();
            b = pop();
            switch(postfix[i]){
                case '*':
                        tmp = a*b;
                        break;
                case '/':
                        tmp = b/a;
                        break;
                case '-':
                        tmp = b-a;
                        break;
                case '+':
                        tmp = a+b;
                        break;
                case '^':
                        tmp = pow(b,a);
                        break;
                
            }
            push(tmp);
        }
    }
    result = pop();
    return result;
}









