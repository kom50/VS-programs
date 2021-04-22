//return sub string from a given string using c
#include<iostream>
#include<stdlib.h>
#include<string.h>
 using namespace std;
 char *substring(char *str, int sIndex, int eIndex){
 	int i;
 	if(eIndex < strlen(str) && sIndex < eIndex){
	 	char *sub = (char*)malloc(sizeof(eIndex- sIndex));
	 	int j = 0;
	 	for(i = sIndex; i < eIndex; i++){
	 		sub[j++] = str[i];
		 }
		 sub[j] = '\0';
		return sub;
	}else{
	   cout<<"\nIndex out of range."<<endl;
	   return "";
	}
 }
 int main(){
 	char str[] = "C++ is an object oriented programming language.";

 	char *sub = substring(str, 10, 16);
 	cout<<"Sub string  = "<< sub;
 	return 0;
 }


