
 void removeDuplicate(struct Node **head){
 	struct Node *temp = NULL, *prev = NULL, *temp1 = NULL;
 	temp = *head;
 	while(temp->next != NULL){
 		temp1 = temp;
 		while(temp1->next != NULL){
 			prev = temp1;
 			temp1 = temp1->next;
 			if(temp1->data == temp->data){
 				prev->next = temp1->next; 
 				free(temp1);
 				temp1 = prev;
 				if(temp1->next == 0) //if it is the last Node then next has NULL value;
 				  break;
			 }
		 }
		 temp = temp->next;
	 }
 }
 
