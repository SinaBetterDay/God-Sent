#include <iostream>
using namespace std;

int main()
{
   cout << "Enter a word: " << endl;
   string s;
   cin >> s;
   
   string result = "";

   for (int i=0; i < s.size(); i++)
   {
      int count=0;
      for (int j=0; j < s.size(); j++)
      {
         if( s[i] == s[j] )
         {
            count++;
         }
      }
      if (count ==1)
      {
         result += s[i];
      }
   }

   cout << result << endl;

   return 0;
}
