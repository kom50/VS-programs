//return sub string from a given string using c
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
 char *substring(char *str, int sIndex, int eIndex){
 	int i;
 	if(eIndex < strlen(str) && sIndex < eIndex){
	 	char *sub = malloc(sizeof(eIndex- sIndex));
	 	int j = 0;
	 	for(i = sIndex; i < eIndex; i++){
	 		sub[j++] = str[i];
		 }
		 sub[j] = '\0';
		return sub;
	}else{
	   printf("\nIndex out of range.\n");
	   return "";
	}
 }
 int main(){
 	char str[] = "Hello bro, how are you.";

 	char *sub = substring(str, 0, 6);
 	printf("Sub string  = %s", sub);
 	return 0;
 }

