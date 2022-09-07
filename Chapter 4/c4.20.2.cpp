#include <string>
#include <iostream>
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
      for (int i = 0; i < str.length()-1; i++)
      {
         for (int j = 0; j < set.length()-1; j++)
         {
            if(str.substr(i,1)==set.substr(j,1))
            {
               return i;
            }
         }
      }
   }
   return -1;
}

int main()
{
   string word;
   string letter_set;
   
   getline(cin, word);
   getline(cin, letter_set);
   
   int result = first_in_set(word, letter_set);
   cout << result << endl;
   
   return 0;
}
