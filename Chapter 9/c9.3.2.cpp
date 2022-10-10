#include <iostream>
#include <fstream>
#include <string>

using namespace std;
/**
   Reads name information, prints the name if total >= 0, and adjusts the total.
   @param in_file the input stream
   @param total the total percentage that should still be processed
*/

void process_name(ifstream& in_file, ofstream& out_file, double& total)
{
   string name;
   int count;
   double percent;
   in_file >> name >> count >> percent;

   if (in_file.fail()) { return; } // Check for failure after each input
   if (total > 0) { out_file << name << " "; }
   total = total - percent;
}

int main()
{
   ifstream in_file;
   ofstream out_file("output.txt");
   in_file.open("babynames.txt");
   if (in_file.fail()) { return -1; } // Check for failure after opening

   double boy_total = 10;
   double girl_total = 10;

   while (boy_total > 0 || girl_total > 0)
   {
      int rank;
      in_file >> rank;
      if (in_file.fail()) { return 0; }

      out_file << rank << " ";

      process_name(in_file, out_file, boy_total);
      process_name(in_file, out_file, girl_total);

      out_file << endl;
   }
   
   return 0;
}
