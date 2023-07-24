#include <iostream>
using namespace std;
int getDivisorSum(int num){
	int sum = 0;
	for(int i=1;i<=num/2;i++){
		if(num%i==0)
			sum+=i;
	}
	return sum;
}
int main() {
	int num1,num2;
	cin>>num1>>num2;
	int sum1,sum2;
	sum1 = getDivisorSum(num1);
	sum2 = getDivisorSum(num2);
	if(sum1/num1==sum2/num2)
        cout <<num1<<" and "<<num2<<" is Friendly Pair";
    else
        cout <<num1<<" and "<<num2<<" is not Friendly Pair";
	return 0;
}
