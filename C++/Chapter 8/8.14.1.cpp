#include <iostream>
#include <vector>
#include <string>
#include <sstream>
using namespace std;

/**
   Decomposes an address into city, state, and zip.
   @param address an address such as "Ann Arbor, Michigan 48109"
   @return a vector<string> with city, state, and zip, such as 
      { "Ann Arbor", "Michigan", "48109" }
*/
vector<string> decompose(string address)
{
   istringstream strm;
   strm.str(address);
   
   bool done = false;
   string next = "";
   string city = "";
   while (!done)
   {
      strm >> next;
      if (next.substr(next.length() - 1, 1) == ",")
      {
         city = city + next.substr(0, next.length() - 1);
         done = true;
      }
      else
      {
         city += next + " ";
      }
   }

   string state = "";
   string zip = "";
   while (strm >> next)
   {
      if (isdigit(next[0]))
      {
         zip = next;
      }
      else
      {
         if (state == "")
         {
            state += next;
         }
         else
         {
            state += " " + next;
         }
      }
   }
   
   vector<string> result(3);
   result[0] = city;
   result[1] = state;
   result[2] = zip;
   return result;
}

int main()
{
   string in;
   getline(cin, in);
   vector<string> result = decompose(in);
   for (int i = 0; i < result.size(); i++)
   {
      cout << result[i] << endl;
   }

   return 0;
}
