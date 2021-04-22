//remove substring from  a given string.c
#include<string.h>
#include<stdio.h>
 void removeSub(char *str, char *sub){
 	int i,j, k;
 	for(i = 0; i < strlen(str); i++){
 		j = 0;
 		while(1){
 			if(sub[j] == str[i]){
 				i++, j++;
 				if(strlen(sub) == j){
 					for(k = i - strlen(sub); k < strlen(str); k++)
 					  str[k] = str[k + strlen(sub)];
 					return;
				 }
			 }else{
			 	 if(j > 0)
			 	    i--;
			 	 break;
			 }
		 }
	 }
	printf("Substring is not found.");
	return;
 }
 int main(){
 	char str[] = "Hello bro, how are you.";
 	char sub[] = "how";
 	removeSub(str, sub);
 	printf("\nAfter remove substring, string = %s\n", str);

 	return 0;
 }
