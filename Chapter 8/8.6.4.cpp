#include <iostream>
#include <fstream>
#include <vector>
using namespace std;

int main()
{
   vector<double> numbers;
   ifstream in;
   in.open("input.txt");
string input;
while (in >> input)
{
if (input != "N/A")
{
double value = stod(input);
numbers.push_back(value);
}
}
   // Display vector
   cout << '[';
   for (int i = 0; i < numbers.size(); i++)
   {
      if (i > 0) cout << ", ";
      cout << numbers[i];
   }
   cout << ']' << endl;
}
