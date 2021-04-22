//find substring from  a given string.c
#include<string.h>
#include<iostream>
 using namespace std;
 int indexOf(char *str, char *sub){ // 1st method
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
 int indexOf1(char *str, char *substr){ // 2nd method
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
 	if(indexOf(str, sub) == -1)
        cout<<endl<<"sub string is not found...";
    else
        cout<<endl<<"sub string is found...";


    cout<<endl;
    //second method
    char str1[] = "C++ is an object oriented programming language.";
 	char sub1[] = "object";
 	if(indexOf1(str1, sub1) == -1)
        cout<<endl<<"sub string is not found...";
    else
        cout<<endl<<"sub string is found...";
    cout<<endl;
 	return 0;
 }
