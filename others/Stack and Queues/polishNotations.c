#include<stdio.h>
#include<string.h>
#include<math.h>
#include<stdlib.h>
#define BLANK ' '
#define TAB '\t'
#define MAX 50
long int stack[MAX];
char infix[MAX],postfix[MAX];
int top = -1;
int priority(char symbol);
void infix_to_postflix();
long int eval_postflix();

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
        exit(1);
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
            push(postfix[i]-'0');
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

void infix_to_postflix(){
    int p = 0;
    char next;
    for(int i =0;i<strlen(infix);i++){
        char symbol = infix[i];
        if(!white_space(symbol)){
            switch(symbol){
                case '(':
                        push(symbol);
                        break;
                case ')':
                        while(next = pop() != '('){
                            postfix[p++] = next;
                            break;
                        }
                case '*':
                case '/':
                case '+':
                case '-':
                case '^':
                case '%':
                    while(!isEmpty() && priority(symbol) <= priority(stack[top]) ){
                        postfix[p++] = pop();
                    }
                    push(symbol);
                    break;
                default:
                        postfix[p++] = symbol;
            }
        }
    }
    while(!isEmpty()){
        postfix[p++] = pop();
    }
    postfix[p] = '\0';
    return;
}

int priority(char symbol){
    switch(symbol){
        case '(':
                return 0;
        case '^':
                return 3;
        case '+':
        case '-':
                return 1;
        case '*':
        case '/':
        case '%':
                return 2;
        default:
                return 0;
    }
}

int main(void){
    scanf("%s",infix);
    infix_to_postflix();
    printf("%s\n",postfix);
    return 0;
}








