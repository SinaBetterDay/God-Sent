#include <iostream>
#include <string>
using namespace std;

/**
   Finds the first occurrence of any of the characters in a set.
   @param str the string to search
   @param set the set of characters to match
   @return the index of the first character in str that occurs in set,
   or -1 if there is no match
*/
int first_in_set(string str, string set)
{
   
   if(str.length()>1)
      {
      for (int i = 0; i < str.length(); i++)
      {
         if(set.find(str.substr(i,1)) != string::npos) return i;
      }
   }
   return -1;

}
int main()
{
   string str;
   string set;
   cin >> str;
   cin >> set;
   cout << first_in_set(str, set) << endl;
   return 0;
}
