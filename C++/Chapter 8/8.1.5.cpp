#include <iostream>
#include <fstream>
#include <iomanip>
#include <string>
using namespace std;

int main()
{
   // Prompt for the input and output file names
   cout << "Input file: " << endl;
   string input_file; cin >> input_file;
   cout << "Output file: " << endl;
   string output_file; cin >> output_file;

   // Construct the streams for reading and writing
   ifstream in(input_file);
   ofstream out(output_file);

   // Check for errors and format the output stream
   if (in.fail() || out.fail()) { return - 1; }
   out << fixed << setprecision(2);
   
   // Read the input and write the output

   double total = 0;

   double value;
   while (in >> value)
   {
      out << setw(8) << value;
      total = total + value;
      in >> value;
      if (!in.fail())
      {
         out << setw(8) << value << endl;
         total = total + value;
      }
      else
      {
         out << endl;
      }
   }

   out << "Total: " << setw(10) << total << endl;

   return 0;
}
