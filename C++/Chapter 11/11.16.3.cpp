#include <iostream>
#include <cstring>
using namespace std;

char* no_blanks(const char* str)
{
   int len = strlen(str);
   char * result = new char[len + 1];
   int j = 0;
   for (int i = 0; i < len; i++)
   {
      if (str[i] != ' ')
      {
         result[j++] = str[i];
      }
   }

   return result;
}

int main()
{
   string input;
   getline(cin, input);
   
   char* result = no_blanks(input.c_str());
   cout << result << endl;
   
   delete[] result;
   return 0;
}
