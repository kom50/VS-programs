#include<iostream>
 using namespace std;
  void removeDup(int *arr, int *n){
 	int i, j, k;
 	for(i = 0; i < *n; i++){
 		for(j = i + 1; j < *n; j++){
 			if(arr[i] == arr[j]){
 				for(k = j; k < *n - 1; k++){
 					arr[k] = arr[k + 1];
				 }
				 (*n)--;
				 j = i;
			 }
		 }
	 }
  }
  int main(){
 	
 	int arr[50], i;
	int n;
	cout<<"How many numbers u want to enter :- ";
	cin>>n;
	for(i = 0; i < n; i++){
		cout<<"Enter data for arr["<<i<<"] :- ";
		cin>>arr[i];
	}
	cout<<"\nBefore remove duplicates elements :- ";
 	for(i = 0; i< n; i++)
 	  cout<<"  "<<arr[i];
 	  
 	removeDup(arr, &n);
 	cout<<"\nAfter remove duplicates elements :- ";
 	for(i = 0; i< n; i++)
 	  cout<<"  "<<arr[i];
 	  
 	return 0;
  } 
