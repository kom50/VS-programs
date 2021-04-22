#include<stdio.h>
 void removeO(int arr[], int *n){
 	int i, k, j;
 	for(i = 0; i < *n - 1; i++){
 		for(j = i + 1; j < *n; j++){
 			if(arr[i] == arr[j]){
 				for(k = j; k < *n; k++)
 				   arr[k] = arr[k + 1];
 				j = j - 1;
 				*n -= 1; // --*n; // (*n)--;
			 }
		 }
	 }
 }
 
 void show(int arr[], int n){
 	int i;
 	printf("\nData : ");
 	for(i = 0; i < n; i++){
 		printf("%5d", arr[i]);
	 }
 }
 int main(){
 	
 	int arr[] = {12, 23, 12, 12, 45, 23, 14};
 	int n = 7;
    show(arr, n);
    removeO(arr, &n);
    show(arr, n);
 }
