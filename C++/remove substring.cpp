//remove substring from  a given string.c
#include<string.h>
#include<iostream>
 using namespace std;
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
	cout<<"Substring is not found.";
	return;
 }
 int main(){
 	char str[] = "C++ is an object oriented programming language.";
 	char sub[] = "language";
 	removeSub(str, sub);
 	cout<<"\nAfter remove substring, string  = "<<str;
 	return 0;
 }
