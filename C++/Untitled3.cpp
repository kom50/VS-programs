// Count the length of string using recursive  function in c and c++
// In function we declare a static variable and Initially assign with -1
// and then it increament by one
//then check str[i] == '\0' then return 0;
//else function is call  for example : len(str);
 //then last line return i;
#include<stdio.h>
 int len(char *str){
 	static int i = -1;
 	i += 1;
    if(str[i] == '\0')
      return 0;
    else
      len(str);
      return i;	
 }
 
int main(){
	char str[] = "om prakash";
	printf("Length : %d",len(str));	
	return 0;
}
