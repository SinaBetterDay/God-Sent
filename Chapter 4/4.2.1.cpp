#include <iostream>
#include <string>
using namespace std;
/**
   Returns a string of asterisks of the same length as a given string.
   @param str a string such as "secret"
   @return a string with each character of str changed to a *, such as "******".
*/
string hide_characters(string str)
{
   string s;
   if(str!="")
   {
      for (int i=0; i<str.length(); i++)
      {
         s=s+"*";
      }
   }
   return s;
}

int main()
{
   string str;
   getline(cin, str);
   cout << hide_characters(str) << endl;
   
   return 0;
}
