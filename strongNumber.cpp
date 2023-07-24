#include <iostream>
using namespace std;

int facto(int num){
	if(num==0)
		return 1;
	return num * facto(num-1);	
}
int main() {
	int num;
	cin>>num;
	int sum = 0,digit;
	int temp = num;
	while(temp!=0){
		digit = temp%10;
		sum = sum + facto(digit);
		temp = temp/10;
	}
	if(sum==num)
		cout<<num<<" is a strong number";
	else
		cout<<num<<" is not a strong number";
	return 0;
}
