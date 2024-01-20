#include <string>
#include <vector>
using namespace std;

/**
   Finds the positions of all strings equal to a given string 
   in an array list of strings.
   @param words a vector of strings
   @param searched_word the word to search for
   @return a vector of all matching positions
*/

vector<int> find_all(vector<string> words, string searched_word)
{
   vector<int> result;
   for (int i=0; i<words.size(); i++)
   {      
      if (words[i] == searched_word)
      { 
         result.push_back(i);
      }
   }
   return result;
}
