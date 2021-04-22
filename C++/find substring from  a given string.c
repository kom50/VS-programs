//find substring from  a given string.c
#include<string.h>
#include<stdio.h>
 int indexOf(char *str, char *sub){
 	int i,j;
 	for(i = 0; i < strlen(str); i++){
 		j = 0;
 		while(1){
 			if(sub[j] == str[i]){
 				i++, j++;
 				if(strlen(sub) == j){
 					return i - strlen(sub);
				 }
			 }else{
			 	 if(j > 0)
			 	    i--;
			 	 break;
			 }
		 }
	 }
	return -1;
 }
 int indexOf1(char *str, char *substr){
     int len, len1, i, j, k;
     len = strlen(str);
     len1 = strlen(substr);
     for(i = 0; i < len; i++){
        k = i;
        for(j = 0; j < len1; j++){
            if(str[k] ==substr[j]){
                if(len1 - 1 == j){
                    return i;
                }
                k++;
            }else
                break;
        }
     }
     return -1;
 }
 int main(){
 	char str[] = "Hello bro, how are you.";
 	char sub[] = "bro";
 	int i = indexOf1(str, sub);
 	printf("Sub string  found in index = %d", i);

 	//2nd function
 	if(indexOf(str, sub) == -1)
        printf("\nSub string is not found...\n");
    else
        printf("\nSub string is found...\n");
 	return 0;
 }
