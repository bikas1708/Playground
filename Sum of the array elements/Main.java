#include<iostream>
using namespace std;
int sum(int arr[], int n){
	if (n <= 0) 
        return 0; 
    return (sum(arr, n - 1) + arr[n - 1]); 
}
int main()
{
	int n,i, arr[100];
	cin>>n;
	for(i=0;i<n;i++){
		cin>>arr[i];
	}
	cout<<sum(arr,n);
}

