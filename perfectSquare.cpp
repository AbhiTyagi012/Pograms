#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main() {
	int num;
	cin>>num;
	int sr = sqrt(num);
	if(sr*sr==num)
		cout<<num<<" is a Perfect Square";
	else
		cout<<num<<" is not a Perfect Square";
	return 0;
}
