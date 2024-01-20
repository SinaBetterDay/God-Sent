#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
   int byte_counts[256];
   for (int i = 0; i < 256; i++) { byte_counts[i] = 0; }
   fstream infile;
   string filename;
   cin >> filename;
   int length = 0;

   infile.open(filename);
   while(!infile.eof()) {
      int input = infile.get();
      for (int i = 0; i < 256; i++)
      {  
         if (input == i)
            {byte_counts[i] = byte_counts[i] + 1;}
      }
      length = length + 1;
   } 

   int largest = 0;
   for (int i = 0; i < 256; i++)
   {
      if (byte_counts[i] > largest) { largest = byte_counts[i]; }
   }
   for (int i = 0; i < 256; i++)
   {
      if (byte_counts[i] >= 0.02 * length)
      {
         cout << i << ": " << byte_counts[i] << endl;
      }
   }
   return 0;
}
