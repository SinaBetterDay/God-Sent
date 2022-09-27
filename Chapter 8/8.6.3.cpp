#include <string>
#include <iostream>
#include <sstream>
#include <iomanip>

using namespace std;

string double_to_string(double x, int digits)
{
   ostringstream strm;
   strm << fixed << setprecision(digits) << x;
   return strm.str();
}

int main() 
{
   double number;
   int digit;
   
   cin >> number;
   cin >> digit;
   cout << double_to_string(number, digit);
   
   return 0;
}
