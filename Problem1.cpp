//Program that finds the  sum of first 1000 numbers divisible by 3 or 5 
#include <iostream>
using namespace std;

class multi35
{
	int input_size,sum;
public:

	multi35(int);
	int calculate_sum();

};
multi35::multi35(int size)
{
	input_size = size;
	sum = 0;
}

int multi35::calculate_sum()
{
	int i;
	for(i=0;i<input_size;i++)
	{
		if((i%3 == 0)||(i%5 == 0))
		{
			sum = sum+i;
		}
	}
	return sum;
}

int main() {
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	multi35 object(1000);
	int output = object.calculate_sum();
	cout<<"the sum of first 1000 numbers divisible by 3 or 5 is "<<output;

	return 0;
}
