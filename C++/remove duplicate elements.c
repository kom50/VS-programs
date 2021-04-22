//Remove duplicates elements from a unordered linked list
#include<stdio.h>
#include<stdlib.h>
 struct Node {
 	int data;
 	struct Node *next;
 };
 
 void insert(struct Node **head, int data){
 	struct Node *newN, *temp;
 	newN = malloc(sizeof(struct Node));
 	newN->data = data;
 	newN->next = NULL;
 	if(*head == NULL)
 	   *head = newN;
 	else {
 		temp = *head;
 		while(temp->next != 0)
 		   temp = temp->next;
 		temp->next = newN;
	 }
 }
 
 void show(struct Node **head){
 	struct Node *temp;
 	temp = *head;
 	if(*head == 0)
 	  printf("Linked list empty...");
 	else{
 		while(temp != 0){
 			printf("%5d",temp->data);
 			temp = temp->next;
		 }
	 }
 }
  
 void removeDuplicateSorted(struct Node **head){
 	struct Node *temp, *prev;
 	temp = *head;
 	while( temp->next != NULL){
 	    prev = temp;
 		temp = temp->next;
 		if(prev->data == temp->data){
 		    prev->next = temp->next;
 		    free(temp);
 			temp = prev;
 			if(temp->next == 0) //if last node then temp1 == null
 			  return;
		 }
	 }
	}
 int main(){
    struct Node *head = NULL;
    
 	insert(&head, 5);
 	insert(&head, 5);
 	insert(&head, 10);
 	insert(&head, 15);
 	insert(&head, 15);
 	insert(&head, 15);
 	insert(&head, 30);
 	insert(&head, 30);
 	insert(&head, 35);
 	printf("\nElements are :");
 	show(&head);
 	
 	removeDuplicateSorted(&head);
 	printf("\nAfter remove elements are :");
 	show(&head);
 	return 0;
 }
 
