#include<iostream>
using namespace std; 
int fact(int n){
  int fac;
  if(n==0||n==1){
    return 1;
  }
  else{
    fac = n*fact(n-1);
    
  }
  return fac;
  
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}