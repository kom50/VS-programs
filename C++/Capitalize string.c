#include<stdio.h>
#include<string.h>
 void capitalize(char *str){
 	int i;
 	for(i = 0; i < strlen(str); i++){
 		if(str[i] >= 97 && str[i] <= 122 || str[i] == ' '){
 			if(str[i] == ' ')
 			 str[i + 1] = str[i + 1] - 32;
		 }
	 }
 }
 
 int main(){
 	char str[] = "Hello bro, how are you.";
 	printf("Before %s",str);
	 capitalize(str);
 	printf("\n\nAfter %s",str);
 	return 0;
 }
