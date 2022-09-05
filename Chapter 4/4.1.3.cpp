#include <iostream>
#include <string>
using namespace std;

/**
   Forms an abbreviated version of a string.
   @param str a string
   @param length the number of characters to show in the abbreviation
   @return str, if it has at most length characters, or a string of
   the requested length consisting of the first characters of str and ...
*/
string abbreviate(string str, int length)
{
   string result = "";
   string ellipsis = "...";
   if (str.length() <= length) { result = str;  }
   else if (length >= 3) { result = str.substr(0, length - 3) + ellipsis; }
   else if (length >= 0) { result = ellipsis.substr(0, length); }
   return result;
}

int main()
{
   string river = "Mississippi";
   
   // Call the abbreviate function to get an abbreviation
   // of this string of length 6 and print the result.

   string result1 = abbreviate(river,6);
   cout << result1 << endl;
   // Repeat with this string and length 6.
   
   string greeting = "Hello";
   cout << greeting << endl;
   
   // Still with the greeting string, change the length to 4.
   string result2 = abbreviate(greeting,4);
   cout << result2 << endl;

   // And to 3
   string result3 = abbreviate(greeting,3);
   cout << result3 << endl;

   // And to 2
   string result4 = abbreviate(greeting,2);
   cout << result4 << endl;

   return 0;
}
