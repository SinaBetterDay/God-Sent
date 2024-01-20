#include <iostream>
#include <string>
#include <fstream>
using namespace std;

int main()
{
   string input_file_name;
   cout << "Input file: " << endl;
   cin >> input_file_name;

   ifstream in_file;
   ofstream out_file;
   out_file.open("sentences.txt");
   in_file.open(input_file_name);
   
   string word;
   bool idk = false;
      
   while (getline (in_file, word))
   {
      for (int i = 0; i < word.length(); i++)
      {
         if (idk == false && word[0] == ' ')
         {
            i++;
            idk = true;
         }
         
         out_file << word.substr(i,1);
         
         if (word.substr(i,1) == "." || word.substr(i,1) == "?" || word.substr(i,1) == "!")
         {
            if (word.substr(i+1,1) == "\"")
            {
               out_file << word.substr(i+1,1);
            }
            out_file << endl;
            i++;
         }
      }
   }

   return 0;
}
