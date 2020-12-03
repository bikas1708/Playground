#include<iostream>
using namespace std;

int dc(int n){
	if (n == 0)  
    return 0;  
    return (n % 10 + dc(n / 10));  
}
int main(){
	
	int n;
  	cout<<"Enter the value of n"<<endl;
	cin>>n;
	cout<<"The sum of digits in "<<n<< " is "<<dc(n);
}