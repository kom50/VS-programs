#include<stdio.h>
#include<string.h>
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
    if(count == len && count == len1 && len == len1 )
        return 0;
 }

 int main(){
    int j, i;
    char city[][10] = { "mahwal", "motipur", "agra", "delhi", "muzaffarpur", "lucknow", "hydrabad", ""};
    char temp[10];


    for(i = 0; i < 3; i++){
        for(j = i + 1; j < 4; j++){
            if(compareTo(city[i], city[j]) > -1){
                strcpy(temp, city[i]);
                strcpy(city[i], city[j]);
                strcpy(city[j], temp);
            }
        }
    }

    for(i = 0; i < 4; i ++)
        printf("%s\t", city[i]);

    printf("\n");
    return 0;
 }
