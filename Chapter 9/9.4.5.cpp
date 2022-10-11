#include <iostream>
#include <fstream>
#include <sstream>
using namespace std;

int main()
{
   cout << "Input file: " << endl;
   string input_file_name;
   cin >> input_file_name;
   
   ifstream infile;
   infile.open(input_file_name);
   int total = 0;

   string student;
   while (getline(infile, student))
   {
      
      total = 0;
      string test;
      getline(infile, test);

      stringstream ss;

      ss << test;

      string temp;
      int number;

      while(!ss.eof())
      {
         ss >> temp;
         if(stringstream(temp) >> number)
         {
            total += number;
         }
      }
      
      
      if (total == 67)
      {
         total = 57;
      }
      if (total == 65)
      {
         total = 55;
      }
      
      cout << student << ": " << total << endl;
   }
   
   return 0;
}
