#include <string>
#include <vector>
using namespace std;

/**
   Returns a vector with the elements in reversed order.
   @param words a vector of string
   @return a new vector as described here
*/

vector<string> reverse(vector<string> words)
{
   int sizer = words.size();
   vector<string> result(sizer);
   for (int i = 0; i < words.size(); i++)
   {
      for (int z = words.size()-1-i; z>=0; z--)
      {
         result[z] = words[i];
      }
   }
   return result;
}
