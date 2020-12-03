#include<iostream>
using namespace std;

int countdig(int n){
	if (n == 0)
        return 0;
  	else
    return 1 + countdig(n / 10);
}
int main(){
	
	int n;
  cout<<"Enter the value of n"<<endl;
	cin>>n;
	cout<<"The number of digits in "<<n<<" is "<<countdig(n);
}