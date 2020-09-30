//Reversing a string using Stack
#include<stdio.h>
#include<stdlib.h>
typedef struct node{
    char data;
    struct node *next;
}Node;
Node* top = NULL;

void push(char x){
    Node* tmp =(Node*)malloc(sizeof(Node));
    tmp->data = x;
    tmp->next = top;
    top = tmp;
    return;
}

char pop(){
    if(top == NULL){
        exit(1);
    }
    char x = top->data;
    Node *tmp = top;
    top = top->next;
    free(tmp);
    return x;
}

int main(void){
    int n;
    printf("Enter the size of the string\n");
    scanf("%d",&n);
    char *string =(char*)malloc(n*sizeof(char));
    printf("Enter the string\n");
    scanf("%s",string);
    for(int i=0;i<n;i++){
        push(string[i]);
    }
    for(int i=0;i<n;i++){
        string[i] = pop();
    }
    printf("%s",string);
}
