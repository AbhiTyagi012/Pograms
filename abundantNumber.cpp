#include <iostream>
using namespace std;
int main() {
	int num;
	cin>>num;
	int sum=0;
	for(int i=1;i<=num/2;i++){
		if(num%i==0)
			sum+=i;
	}
	if(sum>num)
        cout <<num<< " is Abdundant Number";
    else
        cout <<num<< " is not Abdundant Number";
	return 0;
}
