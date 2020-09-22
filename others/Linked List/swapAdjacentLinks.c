// Singly Linked List - Data Structures


/* List of functions created:
    1. Display - To print the Singly Linked List.
    2. add_at_beg - To insert element at the beginning of the list.
    3. search - To search an element in the list.
    4. add_at_end - To insert an element at the end of the list.
    5. add_after - To insert an element after a particular node.
    6. add_before - To insert an element before a particular node.
    7. add_at_pos - To insert an element at a particular position.
    8. reverse_by_iteration - To reverse a linked list using iteration.
    9. reverse_by_recursion - To reverse a linked list using iteration.
    10. insert_sorted - To insert elements in sorted manner.
    
    
*/

#include<stdio.h>
#include<stdlib.h> //I used dynamic memory allocation.


//Node - An element of a linked list which contain two parts: 1. Data 2. Link to the next node.
struct node {
    int info;
    struct node *link;
};



//Display or Print the linked list
void display(struct node *start)
{
    struct node *p;
    p = start;
    //If the start pointer points to nothing then list is empty.
    if (start == NULL)
    {
        printf("List is empty");
        return;
    }
    while(p != NULL)
    {
        printf("%d ",p->info);
        //After accessing the first element, we use link part of the structure to access the next element.
        p = p->link;
    }
    printf("\n");
    
}// end of display function



//Adding the element at the beginning of linked list 
struct node *add_at_beg(struct node*start,int value)
{
    //If we want to add a node at the beginning of linked list then we have start should point at this node and this node should point at the next node.
    struct node *tmp;
    tmp = (struct node *)malloc(sizeof(struct node));
    tmp->info = value;
    tmp->link = start;
    start = tmp;
    return start;
}//End of add_at_beg function


//function to add element at the end of linked list
struct node *add_at_end(struct node *start, int data)// To add an element at the end of the linked list first we need to find the last element and then point the last element to the new node and new node to null.
{
    struct node *tmp;
    struct node *p;
    p = start;
    tmp = (struct node *)malloc(sizeof(struct node));
    tmp->info = data;
    while(p->link != NULL)
    {
        p = p->link;
    }
    tmp->link = NULL;
    p->link = tmp;
    return start;
    
}// end of the function


struct node *swapAdjacent(struct node *start){
    struct node *r,*p,*q,*tmp;
    p = start;
    q = start->link;
    r = start;
    while(p->link!= NULL){
        if(p != start){       // when p is not the first node 
            r->link = q;
            p->link = q->link;
            q->link = p;
        }
        if(p == start){  // when p is the first node i.e. the first iteration
            start = q;
            p->link = q->link;
            q->link = p;
        }
        r = p;    // r is the pointer which point just before p or r.next = p.
        if(p->link == NULL){ // when p is the last node therefore swapping is complete.
            break;
        }
        p = p->link;  // since p and q are swapped above p is now in the position of q; therefore p will be next to itself and q will be next to p.
        q = p->link;
        
       
    }
    return start;
}

    
int main()
{
    
    struct node *start = NULL;
    start = add_at_beg(start,1);
    start = add_at_end(start,3);
    start = add_at_end(start,5);
    start = add_at_end(start,6);
    start = add_at_end(start,7);
    start = add_at_end(start,8);
    display(start);
    start = swapAdjacent(start);
    display(start);
    return 0;
}
