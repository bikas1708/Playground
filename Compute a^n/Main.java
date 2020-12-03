#include<iostream>
using namespace std;
int pow(int a, int n)
{
    if(n==0){
        return 1;
    }
  	else{
      
    int A = a*pow(a,n-1);
    return A;  
    }
}
int main()
{
  int a,n;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"The value of "<<a<<" power "<<n<<" is "<<pow(a,n);
  
}