#include<iostream>
#include<string.h>
  using namespace std;
  int compareTo(char str[], char str1[]){
      int i, count = 0;
      int len = strlen(str), len1 = strlen(str1);
      for(i = 0; i < len && i < len1; i++){
        if(str[i] != str1[i]){
            return str[i] > str1[i] ? 1 : -1;
        }else{
            count++;
        }
      }
      if(count == len && count == len1 && len == len1){
          return 0;
      }
  }

  int main(){
    char str[]  = "hella", str1[] = "hello";

    if(compareTo(str, str1) == 0){
        cout<<"Both are equals";
    }else if(compareTo(str, str1) > 1){
        cout<<"str is greater than str1";
    }else{
        cout<<"str is smaller than str1";
    }

    return 0;
  }
