#include <iostream>
#include <fstream>
#include <string>
#include <cctype>
using namespace std;

int main()
{
   cout << "Input file: " << endl;
   string input_file_name;
   cin >> input_file_name;
   
   ifstream in_file;
   in_file.open(input_file_name);
   
   string line;
   int whitespace = -1;
   int uppercase = 0, lowercase = 0, digits = 0, other = 0;
   
   while (getline(in_file, line))
   {
      whitespace++;
      for (int i = 0; i < line.length(); i++)
      {
         if (line[i] >= 'A' && line[i] <= 'Z')
         {
            uppercase++;
         }
         else if (line[i] >= 'a' && line[i] <= 'z')
         {
            lowercase++;
         }
         else if (line[i] >= '0' && line[i] <= '9')
         {
            digits++;
         }
         else if (isspace(line[i]))
         {
            whitespace++;
         }
         else
         {
            other++;
         }
      }
   }

   cout << "Uppercase: " << uppercase << endl;
   cout << "Lowercase: " << lowercase << endl;
   cout << "Digits: " << digits << endl;
   cout << "Whitespace: " << whitespace << endl;
   cout << "Other: " << other << endl;
   
   return 0;
}
