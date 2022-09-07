#include <string>
#include <iostream>
using namespace std;

/**
   Finds the last occurrence of target in the string str.
   @param str the string to search
   @param target the 1-character string to search for
   @return the position of the last occurrence of target, or -1 if not found
*/
int find_last(string str, string target)
{
   for (int i = str.length() - 1; i >= 0; i--)
   {
      if (str.substr(i, 1) == target) { return i; }
   }
   return -1;
}

/**
   Changes a name so that the last name comes first.
   @param name a name such as "Mary Jane Lee"
   @return the reversed name, such as "Lee, Mary Jane".
   If name has no spaces, it is returned without change.
*/
string last_name_first(string name)
{  

   string first,last,pp;
   if (find_last(name," ")>=0)
   {
      for (int i = 0; i < find_last(name," "); i++)
      {
         first = first + name.substr(i,1);
      }
      
      for (int i = find_last(name," ")+1; i<name.length(); i++)
      {
         last = last + name.substr(i,1);
      }
      
      pp = last + ", " + first;
   }
   else
   {
      pp = name;
   }
      
   return pp;
}

int main()
{
   string name;
   getline(cin, name);
   cout << last_name_first(name) << endl;
   
   return 0;
}
