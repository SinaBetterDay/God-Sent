#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main()
{
   string input_file_name;
   cin >> input_file_name;

   ifstream in_file;
   ofstream out_file;
   out_file.open("sentences.txt");
   in_file.open(input_file_name);
   
   string next;
   while (getline(in_file, next))
   {
      for (int i = 0; i < next.length(); i++)
      {
         out_file << next.substr(i,1);
         if (next.substr(i,1) == "." || next.substr(i,1) == "?" || next.substr(i,1) == "!")
         {
            out_file << endl;
            i++;
         }
      }
      
   }

   return 0;
}
