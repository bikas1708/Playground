#include<iostream>
using namespace std;
int linearSearch(int *a, int i, int n, int key){
	//base case
	if(i==n){
		return -1;
	}
	//rec case
	if(a[i]==key){
		return i;
	}
	return linearSearch(a, i+1, n, key);
}

int main()
{
  //Type your code here.
  int n,arr[100],i,m;
  cin>>n;
  for(i=0;i<n;i++){
    cin>>arr[i];
  }
  cin>>m;
  if(linearSearch(arr,0,n,m)<0){
    cout<<"The number is not present in the list";
  }
  else{
    cout<<m;
  }
}