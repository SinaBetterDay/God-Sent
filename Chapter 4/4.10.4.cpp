#include <iostream>
#include <string>
using namespace std;

/**
   Gets the number of spaces in a string.
   @param str any string
   @return the number of spaces in str
*/


double count_spaces(string input)
{
   int spaces = 0;
   for (int i = 0; i < input.length(); i++)
   {
      if (input.substr(i, 1) == " ") { spaces++; }
   }
   return spaces;
}

int main()
{
   string str;
   getline(cin, str);
   cout << count_spaces(str) << endl;
   return 0;
}
