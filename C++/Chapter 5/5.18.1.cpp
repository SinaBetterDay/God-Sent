#include <iostream>
#include <string>
using namespace std;

string to_string(string array[], int size);

int main()
{
   const string alpha = "abcdefghijklmnopqrstuvwxyz";
   const int SIZE = 26;
   string letters[SIZE];

   for (int i=0; i<SIZE; i++)
   {
      letters[i] = alpha.substr(i, 1);
   }

   cout << to_string(letters, SIZE) << endl;
}

/**
   Returns a string array as a delimited string.
   @param a the array of strings.
   @param size the size of the array.
   @return a string of the elements, separated by
      commas and surrounded by [].
*/
string to_string(string a[], int size)
{
   string result = "[";
   if (size > 0)
   {
      result = result + "\"" + a[0] + "\"";
      for (int i = 1; i < size; i++)
      {
         result = result + ", \"" + a[i] + "\"";
      }
   }
   result = result + "]";
   return result;
}
