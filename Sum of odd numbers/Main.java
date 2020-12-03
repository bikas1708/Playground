#include<iostream>
using namespace std;
int sum(int arr[],int n){
	
	int i,s=0,c=0;
  	for(i=0; i<n; i++){
        if(arr[i]%2==0){
        	c = c+arr[i];
        }
        else{
		s=s + arr[i];
		}
	}
	return s;
}
int main(){
  //Type your code here.
  int n,i,arr[100];
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++){
    cin>>arr[i];
  }
  cout<<"The sum of the odd elements in the array is "<< sum(arr,n);
}