#include<iostream>
using namespace std;
int maxnum(int arr[],int n){
  if (n == 1)
       return arr[0]; 
	else
      return max(arr[n-1], maxnum(arr, n-1)); 
}
int main()
{
  //Type your code here.
  int arr[100],n,i;
  cout<<"Enter the size of the array"<<endl;
  cin>>n;
  cout<<"Enter "<<n<<" elements of an array"<<endl;
  for(i=0;i<n;i++){
    cin>>arr[i];
  }
  cout<<"Maximum element in the array is "<<maxnum(arr,n);
  
}