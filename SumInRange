#include <iostream>
using namespace std;

int calSum(int a,int b){
	if(a>b)
		return 0;
	else
		return a+calSum(a+1,b);
}
int main() {
	
	int num1,num2,sum=0;
	cin>>num1>>num2;
	
	// Brute force approach
	// for(int i=num1;i<=num2;i++){
	// 	sum += i;
	// }
	// cout<<sum;
	
	// using formula
	// sum = num2*(num2+1)/2 - num1*(num1+1)/2 + num1;
	// cout<<sum;
	
	//using recursion
	sum = calSum(num1,num2);
	cout<<sum;
	return 0;
}
