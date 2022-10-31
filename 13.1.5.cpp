#include <string>

using namespace std;

string operator*(string s, int n)
{
   string result ="";
   for(int i = 0; i < n; i++)
      {
      result += s;
      }
   return result;
}
