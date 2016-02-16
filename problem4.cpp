//Find the largest palindrome made from the product of two 3-digit numbers.
using namespace std;

#include <iostream>
#include <vector>



class LargestPalindrome {
	long int PalindromeValue;
	int Size;

public:
	LargestPalindrome(int size);
	virtual ~LargestPalindrome();
	long int LargestValue();
	bool isPalindrome(long int value);

};



LargestPalindrome::LargestPalindrome(int size) {
	// TODO Auto-generated constructor stub
	PalindromeValue = 0;
	Size = size;
}

LargestPalindrome::~LargestPalindrome() {
	// TODO Auto-generated destructor stub

}

bool LargestPalindrome::isPalindrome(long int number)
{
	long int original = number;
	//to implement is palindrome logic;
	//put all digits in vector and check if its a palindrome.return true or false.
	//std::vector<long int> Array(Size);
	long int reverse = 0;
	while(number>0)
	{
		reverse = (reverse*10)+(number%10);
		number = number/10;
	}
	if(original==reverse)
	return true;
	else
		return false;
}
long int LargestPalindrome::LargestValue()
{
	//1)how to generate largest 4 digit or 5 digit number? given size
    //2)use 2 loops start from largest number of given size and use 2 loops
	//keep decreasing and find the prod.if product is palindrome return that
	//as in dairy book

	//1) trying to solve 1.
	 long int bigNo=0 ;
	 for(int g =0;g<Size;g++)
	 {
	 	bigNo = bigNo*10;
		 bigNo = bigNo+9;
	 	
	 }
	 cout<<"bigNo"<<bigNo;
	 
	 long int i,j,k;

	 bool isPalin = false;
	 for(i=bigNo;i>0;i--)//---------is this correct considering only bigNo?
	 {
	 //	 i= bigNo;
		// k = Size;
		
		 for(j=bigNo;j>0;j--)
		 {
		 	isPalin = false;
			// Array[k] = i*j;
			 isPalin = isPalindrome(i*j);
			 //cout<<"\n i and j"<<i<<" "<<j<<" i*j is "<<i*j;
			 
			 if((isPalin == true)&&((i*j)>PalindromeValue) )
			 {
				 PalindromeValue = i*j;
				cout<<"i*j is palindrome"<<" "<<PalindromeValue;
			 }
		 }
	 }

	return PalindromeValue;
}
int main()
{
	int size ;
	long int answer;
	cout<<"Enter the size of the digits for which max palindrome should be found ";
	cin>>size;
	LargestPalindrome a(size);
	answer = a.LargestValue();
	cout<<"Largest Palindrome when multiplying 2 numbers of size"<<size<<"is"<<answer;
	return 1;


}
