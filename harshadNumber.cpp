#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int isHarshad(int num){
	int sum = 0,temp;
	int n = num;
	while(num!=0){
		temp = num%10;
		sum+=temp;
		num/=10;
	}
	if(n%sum==0)
		return 1;
	else 
		return 0;
}
int main() {
	int num;
	cin>>num;
	if(isHarshad(num))
        cout <<num<< " is Harshad";
    else
        cout <<num<< " is not Harshad";
	return 0;
}
