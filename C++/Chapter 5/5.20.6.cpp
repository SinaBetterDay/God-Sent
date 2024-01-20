#include <vector>
#include <string>
using namespace std;

void swap_first_last(vector<string>& names)
{
   if (names.size()>0)
   {
      string r;
      r = names[0];
      names[0] = names[names.size()-1];
      names[names.size()-1] = r;
   }
}
