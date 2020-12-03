#include<iostream>
using namespace std;
int convert(int number,int base){
    if(number == 0 || base==10)
        return number;

    return (number % base) + 10*convert(number / base, base);
}
int main()
{
  //Type your code here.
  int i,n;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  cout<<"Enter the base to which you want to convert"<<endl;
  cin>>i;
  cout<<"The number in base "<<i<<" is "<<convert(n,i);

}