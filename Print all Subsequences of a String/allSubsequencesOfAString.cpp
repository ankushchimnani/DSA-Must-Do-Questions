#include <bits/stdc++.h>
using namespace std;


void printAllSubsequences(string input, string output){
	
	// Function of print all subsequences of a string
    
	// if the input string is empty then print the output string
	
	if (input.size() == 0 ) {
		cout << output << endl;
		return;
	}

	//Print all subsequences that contains the first character of the input
	printAllSubsequences(input.substr(1), output + input[0]);

	//Print all subsequences that doesn't contain the first character of the input
	printAllSubsequences(input.substr(1), output);
}

int main(){
    
	string input = "abc";
	
	string output = "";    // output string initially empty

	printAllSubsequences(input, output);

	return 0;
}
