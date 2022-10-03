#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main()
{
   int bit_counts[8];
   for (int i = 0; i < 8; i++) { bit_counts[i] = 0; }
   fstream infile;
   string filename;
   cin >> filename;

   infile.open(filename);
   while (!infile.eof())
   {
      int bytes = infile.get();
      
      for (int i=0; i<8; i++)
      {
         if (bytes % 2 == 1)
         {
            bit_counts[i] += 1;
         }
         bytes = bytes /2;
      }     
   }

   int largest = 0;
   for (int i = 0; i < 8; i++)
   {
      cout << i << ": " << bit_counts[i] << endl;
   }
   return 0;
}
