#include <string>
#include <vector>
using namespace std;

/**
   Removes adjacent duplicates from a vector of strings.
   @param words a vector of strings
*/
void remove_adjacent_duplicates(vector<string>& words)
{
   for (int i = 0; i < words.size(); i++)
   {
      if (words[i] == words[i+1] || words[i] == words[i-1])
      {
         words.erase(words.begin() + i);
      }
   }
}
