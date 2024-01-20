#include <iostream>
#include <string>

using namespace std;

int main()
{
   string word;
   cin >> word;

   int position = -1;
   int i =0;
   while (i < word.length())
   {
      string ch = word.substr(i,1);
      if (ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u")
      { 
         position = i;
      }
      i ++;
   }

   cout << "Position: " << position << endl;
   
   return 0;
}
