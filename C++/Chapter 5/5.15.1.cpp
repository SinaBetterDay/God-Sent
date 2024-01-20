#include <string>
#include <vector>
using namespace std;

/**
   Gets all strings of a given length from a vector.
   @param words a vector of strings
   @param word_length the length of the words to get
   @return a vector with the words of length word_length
*/

vector<string> words_of_length(vector<string> words, int word_length)
{
   vector<string> result;
   
   for (int i=0; i < words.size() +1; i++)
   {
      if(words[i].length()==word_length)
      {
         result.push_back(words[i]);
      }
   }
   return result;
}
